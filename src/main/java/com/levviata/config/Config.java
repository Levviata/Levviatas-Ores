package com.levviata.config;

import com.levviata.utils.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

import static com.levviata.config.BlockConfig.*;
import static com.levviata.config.ItemConfig.*;

public class Config {
	public static final String CATEGORY_NAME_ITEMS = "category_items";
	public static final String CATEGORY_NAME_BLOCKS = "category_blocks";
	public static void preInit()
	{

		File configFile = new File(Loader.instance().getConfigDir(), "LevviatasOres.cfg");

		config = new Configuration(configFile);

		syncFromFile();
	}
	public static void clientPreInit() {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}
	public static Configuration getConfig() {
		return config;
	}
	public static void syncFromFile() {
		syncConfig(true, true);
	}
	public static void syncFromGUI() {
		syncConfig(false, true);
	}
	public static void syncFromFields() {
		syncConfig(false, false);
	}

	private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
	{
		if (loadConfigFromFile) {
			config.load();
		}
		/*String blockListString = blocksToRegister.stream()
				.map(block -> Objects.requireNonNull(block.getRegistryName()).toString())
				.collect(Collectors.joining(","));*/

		configInitBlocks(config);
		configInitItems(config);

		if (readFieldsFromConfig)
		{
			enableTin = propEnableTin.getBoolean();
			enableCopper = propEnableCopper.getBoolean();
			enablePlatinum = propEnablePlatinum.getBoolean();
			enableNewItems = propEnableNewItems.getBoolean();
		}

		propEnableTin.set(enableTin);
		propEnableCopper.set(enableCopper);
		propEnablePlatinum.set(enablePlatinum);
		propEnableNewItems.set(enableNewItems);

		if (config.hasChanged()) {
			config.save();
		}
	}

	private static Configuration config = null;

	public static class ConfigEventHandler
	{
		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event)
		{
			if (Reference.MODID.equals(event.getModID()) && !event.isWorldRunning())
			{
				if (event.getConfigID().equals(CATEGORY_NAME_BLOCKS) ||
					event.getConfigID().equals(CATEGORY_NAME_ITEMS
					))
				{
					syncFromGUI();
				}
			}
		}
	}
}
