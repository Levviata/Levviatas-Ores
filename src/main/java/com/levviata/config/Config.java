package com.levviata.config;

import com.levviata.utils.Reference;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.levviata.config.BlockConfig.*;
import static com.levviata.config.ItemConfig.*;

public class Config {
	public static Property propEnableTinItem;
	public static Property propEnableCopperItem;
	public static Property propEnablePlatinumItem;
	public static Property propEnableBronzeItem;
	public static boolean enableTinItem;
	public static boolean enableCopperItem;
	public static boolean enablePlatinumItem;
	public static boolean enableBronzeItem;
	public static Property propEnableTinBlock;
	public static Property propEnableCopperBlock;
	public static Property propEnablePlatinumBlock;
	public static boolean enableTinBlock;
	public static boolean enableCopperBlock;
	public static boolean enablePlatinumBlock;
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
		propEnableTinBlock = config.get(
				CATEGORY_NAME_BLOCKS,
				"enable_tin_block",
				enableTinBlock,
				"Enable or disable all BLOCKS related to tin."
		);
		propEnableTinBlock.setLanguageKey("gui.lo_configuration.enable_tin_block");

		propEnableCopperBlock = config.get(
				CATEGORY_NAME_BLOCKS,
				"enable_copper_block",
				enableCopperBlock,
				"Enable or disable all BLOCKS related to copper."
		);
		propEnableCopperBlock.setLanguageKey("gui.lo_configuration.enable_copper_block");

		propEnablePlatinumBlock = config.get(
				CATEGORY_NAME_BLOCKS,
				"enable_platinum_block",
				enablePlatinumBlock,
				"Enable or disable all BLOCKS related to platinum."
		);
		propEnablePlatinumBlock.setLanguageKey("gui.lo_configuration.enable_platinum_block");

		propEnableTinItem = config.get(
				CATEGORY_NAME_ITEMS,
				"enable_tin_item",
				enableTinItem,
				"Enable or disable all ITEMS related to tin."
		);
		propEnableTinItem.setLanguageKey("gui.lo_configuration.enable_tin_item");

		propEnableCopperItem = config.get(
				CATEGORY_NAME_ITEMS,
				"enable_copper_item",
				enableCopperItem,
				"Enable or disable all ITEMS related to copper."
		);
		propEnableCopperItem.setLanguageKey("gui.lo_configuration.enable_copper_item");

		propEnablePlatinumItem = config.get(
				CATEGORY_NAME_ITEMS,
				"enable_platinum_item",
				enablePlatinumItem,
				"Enable or disable all ITEMS related to platinum."
		);
		propEnablePlatinumItem.setLanguageKey("gui.lo_configuration.enable_platinum_item");

		propEnableBronzeItem = config.get(
				CATEGORY_NAME_ITEMS,
				"enable_bronze_item",
				enableBronzeItem,
				"Enable or disable all ITEMS related to bronze."
		);
		propEnableBronzeItem.setLanguageKey("gui.lo_configuration.enable_bronze_item");

		List<String> propItems = new ArrayList<String>();
		propItems.add(propEnableTinItem.getName());
		propItems.add(propEnableCopperItem.getName());
		propItems.add(propEnablePlatinumItem.getName());
		propItems.add(propEnablePlatinumItem.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_ITEMS, propItems);

		List<String> propBlocks = new ArrayList<String>();
		propBlocks.add(propEnableTinBlock.getName());
		propBlocks.add(propEnableCopperBlock.getName());
		propBlocks.add(propEnablePlatinumBlock.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_BLOCKS, propBlocks);
		/*String blockListString = blocksToRegister.stream()
				.map(block -> Objects.requireNonNull(block.getRegistryName()).toString())
				.collect(Collectors.joining(","));*/

		if (readFieldsFromConfig)
		{
			enableTinBlock = propEnableTinBlock.getBoolean();
			enableCopperBlock = propEnableCopperBlock.getBoolean();
			enablePlatinumBlock = propEnablePlatinumBlock.getBoolean();

			enableTinItem = propEnableTinItem.getBoolean();
			enableCopperItem = propEnableCopperItem.getBoolean();
			enablePlatinumItem = propEnablePlatinumItem.getBoolean();
			enableBronzeItem = propEnableBronzeItem.getBoolean();
		}

		propEnableTinBlock.set(enableTinBlock);
		propEnableCopperBlock.set(enableCopperBlock);
		propEnablePlatinumBlock.set(enablePlatinumBlock);

		propEnableTinItem.set(enableTinItem);
		propEnableCopperItem.set(enableCopperItem);
		propEnablePlatinumItem.set(enablePlatinumItem);
		propEnableBronzeItem.set(enableBronzeItem);


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
