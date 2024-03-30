package com.levviata.levviatasores.config;

import com.levviata.levviatasores.utils.Reference;
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

public class Config {
	public static Property propEnableTinGen;
	public static Property propEnableCopperGen;
	public static Property propEnablePlatinumGen;
	public static Property propYMinCopper;
	public static Property propYMaxCopper;
	public static Property propCopperSizeRandom;
	public static Property propTinSizeRandom;
	public static Property propPlatinumSizeRandom;
	public static Property propCopperSizeSet;
	public static Property propTinSizeSet;
	public static Property propPlatinumSizeSet;
	public static Property propCopperChance;
	public static Property propTinChance;
	public static Property propPlatinumChance;
	public static Property propYMinTin;
	public static Property propYMaxTin;
	public static Property propYMinPlatinum;
	public static Property propYMaxPlatinum;
	private static int minYCopper;
	private static int maxYCopper;
	private static int minYTin;
	private static int maxYTin;
	private static int minYPlatinum;
	private static int maxYPlatinum;
	private static boolean enableCopperGen = true;
	private static boolean enableTinGen = true;
	private static boolean enablePlatinumGen = true;
	//public static final String CATEGORY_NAME_ITEMS = "category_items";
	public static final String CATEGORY_NAME_WORLD_GEN = "category_world_gen";
	public static final String CATEGORY_NAME_COPPER = "category_copper";
	public static final String CATEGORY_NAME_TIN = "category_tin";
	public static final String CATEGORY_NAME_PLATINUM = "category_platinum";
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
		propEnableTinGen = config.get(
				CATEGORY_NAME_WORLD_GEN,
				"enable_tin",
				enableTinGen,
				"Enable or disable all WORLD GENERATION related to tin."
		);
		propEnableTinGen.setLanguageKey("gui.config.enable_tin");

		propEnableCopperGen = config.get(
				CATEGORY_NAME_WORLD_GEN,
				"enable_copper",
				enableCopperGen,
				"Enable or disable all WORLD GENERATION related to copper."
		);
		propEnableCopperGen.setLanguageKey("gui.config.enable_copper");

		propEnablePlatinumGen = config.get(
				CATEGORY_NAME_WORLD_GEN,
				"enable_platinum",
				enablePlatinumGen,
				"Enable or disable all WORLD GENERATION related to platinum."
		);
		propEnablePlatinumGen.setLanguageKey("gui.config.enable_platinum");


        propYMaxCopper = config.get( CATEGORY_NAME_COPPER, "y_max_copper", 80, "Max Y value for copper generation. Min and max Y are used for making their Delta Y (most abundant place)" );
        propYMaxCopper.setLanguageKey( "gui.config.y_max_copper" );

		propYMinCopper = config.get( CATEGORY_NAME_COPPER, "y_min_copper", 3, "Min Y value for copper generation. Min and max Y are used for making their Delta Y (most abundant place)" );
		propYMinCopper.setLanguageKey( "gui.config.y_min_copper" );

		propCopperSizeRandom = config.get( CATEGORY_NAME_COPPER, "copper_vein_size_random", 4, "A randomized value that picks between your number's maximum minus one and 0. e.i: your number is 8, max value is (8 - 1) = 7, min value is 0 which means there is a probability to spawn a ore vein size of 0 to 7." );
		propCopperSizeRandom.setLanguageKey( "gui.config.copper_vein_size" );

		propCopperSizeSet = config.get( CATEGORY_NAME_COPPER, "copper_vein_size_set", 8, "A set amount of ores that will spawn in the vein, sums up to the randomized value as well. e.i: randomized value (8 - 1) = 7, set value 4, result: (0 + 4) = 4 to (7 + 4) = 11 ores that will spawn in the vein." );
		propCopperSizeSet.setLanguageKey( "gui.config.copper_vein_size" );

		propCopperChance = config.get( CATEGORY_NAME_COPPER, "copper_weight", 8, "The spawn weight of the ore. i.e: Bigger numbers = more common, lower numbers = less common" );
		propCopperChance.setLanguageKey( "gui.config.copper_weight" );

        propYMaxTin = config.get( CATEGORY_NAME_TIN, "y_max_tin", 60, "Max Y value for tin generation. Min and max Y are used for making their Delta Y (most abundant place)" );
        propYMaxTin.setLanguageKey( "gui.config.y_max_tin" );

        propYMinTin = config.get( CATEGORY_NAME_TIN, "y_min_tin", 3, "Min Y value for tin generation. Min and max Y are used for making their Delta Y (most abundant place)" );
        propYMinTin.setLanguageKey( "gui.config.y_min_tin" );

		propTinSizeRandom = config.get( CATEGORY_NAME_TIN, "tin_vein_size_random", 3, "A randomized value that picks between your number's maximum minus one and 0. e.i: your number is 8, max value is (8 - 1) = 7, min value is 0 which means there is a probability to spawn a ore vein size of 0 to 7." );
		propTinSizeRandom.setLanguageKey( "gui.config.tin_vein_size" );

		propTinSizeSet = config.get( CATEGORY_NAME_TIN, "tin_vein_size_set", 4, "A set amount of ores that will spawn in the vein, sums up to the randomized value as well. e.i: randomized value (8 - 1) = 7, set value 4, result: (0 + 4) = 4 to (7 + 4) = 11 ores that will spawn in the vein." );
		propTinSizeSet.setLanguageKey( "gui.config.tin_vein_size" );

		propTinChance = config.get( CATEGORY_NAME_TIN, "tin_weight", 8, "The spawn weight of the ore. i.e: Bigger numbers = more common, lower numbers = less common" );
		propTinChance.setLanguageKey( "gui.config.tin_weight" );


        propYMaxPlatinum = config.get( CATEGORY_NAME_PLATINUM, "y_max_platinum", 32, "Max Y value for platinum generation. Min and max Y are used for making their Delta Y (most abundant place)" );
        propYMaxPlatinum.setLanguageKey( "gui.config.y_max_platinum" );

        propYMinPlatinum = config.get( CATEGORY_NAME_PLATINUM, "y_min_platinum", 3, "Min Y value for platinum generation. Min and max Y are used for making their Delta Y (most abundant place)" );
        propYMinPlatinum.setLanguageKey( "gui.config.y_min_platinum" );

		propPlatinumSizeRandom = config.get( CATEGORY_NAME_PLATINUM, "platinum_vein_size_random", 3, "A randomized value that picks between your number's maximum minus one and 0. e.i: your number is 8, max value is (8 - 1) = 7, min value is 0 which means there is a probability to spawn a ore vein size of 0 to 7." );
		propPlatinumSizeRandom.setLanguageKey( "gui.config.platinum_vein_size" );

		propPlatinumSizeSet = config.get( CATEGORY_NAME_PLATINUM, "platinum_vein_size_set", 4, "A set amount of ores that will spawn in the vein, sums up to the randomized value as well. e.i: randomized value (8 - 1) = 7, set value 4, result: (0 + 4) = 4 to (7 + 4) = 11 ores that will spawn in the vein." );
		propPlatinumSizeSet.setLanguageKey( "gui.config.platinum_vein_size" );

		propPlatinumChance = config.get( CATEGORY_NAME_PLATINUM, "platinum_weight", 8, "The spawn weight of the ore. i.e: Bigger numbers = more common, lower numbers = less common" );
		propPlatinumChance.setLanguageKey( "gui.config.platinum_weight" );

		List<String> propWorldGen = new ArrayList<String>();
		propWorldGen.add(propEnableTinGen.getName());
		propWorldGen.add(propEnableCopperGen.getName());
		propWorldGen.add(propEnablePlatinumGen.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_WORLD_GEN, propWorldGen);

		List<String> propCopper = new ArrayList<String>();
		propWorldGen.add(propYMaxCopper.getName());
		propWorldGen.add(propYMinCopper.getName());
		propWorldGen.add(propCopperSizeRandom.getName());
		propWorldGen.add(propCopperSizeSet.getName());
		propWorldGen.add(propCopperChance.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_COPPER, propCopper);

		List<String> propTin = new ArrayList<String>();
		propTin.add(propYMaxTin.getName());
		propTin.add(propYMinTin.getName());
		propTin.add(propTinSizeRandom.getName());
		propTin.add(propTinSizeSet.getName());
		propTin.add(propTinChance.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_TIN, propTin);

		List<String> propPlatinum = new ArrayList<String>();
		propPlatinum.add(propYMaxPlatinum.getName());
		propPlatinum.add(propYMinPlatinum.getName());
		propPlatinum.add(propPlatinumSizeRandom.getName());
		propPlatinum.add(propPlatinumSizeSet.getName());
		propPlatinum.add(propPlatinumChance.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_PLATINUM, propPlatinum);



		/*String blockListString = blocksToRegister.stream()
				.map(block -> Objects.requireNonNull(block.getRegistryName()).toString())
				.collect(Collectors.joining(","));*/

		if (readFieldsFromConfig)
		{
			minYCopper = propYMinCopper.getInt();
			if (minYCopper > 255) minYCopper = 255;
			if (minYCopper < 0) minYCopper = 0;
			maxYCopper = propYMaxCopper.getInt();
			if (maxYCopper > 255) maxYCopper = 255;
			if (maxYCopper < 0) maxYCopper = 0;
			minYTin = propYMinTin.getInt();
			if (minYTin > 255) minYTin = 255;
			if (minYTin < 0) minYTin = 0;
			maxYTin = propYMaxTin.getInt();
			if (maxYTin > 255) maxYTin = 255;
			if (maxYTin < 0) maxYTin = 0;
			minYPlatinum = propYMinPlatinum.getInt();
			if (minYPlatinum > 255) minYPlatinum = 255;
			if (minYPlatinum < 0) minYPlatinum = 0;
			maxYPlatinum = propYMaxPlatinum.getInt();
			if (maxYPlatinum > 255) maxYPlatinum = 255;
			if (maxYPlatinum < 0) maxYPlatinum = 0;

			enableTinGen = propEnableTinGen.getBoolean();
			enableCopperGen = propEnableCopperGen.getBoolean();
			enablePlatinumGen = propEnablePlatinumGen.getBoolean();
		}

		propYMaxCopper.set(maxYCopper);
		propYMinCopper.set(minYCopper);
		propYMaxTin.set(maxYTin);
		propYMinTin.set(minYTin);
		propYMaxPlatinum.set(maxYPlatinum);
		propYMinPlatinum.set(minYPlatinum);

		propEnableTinGen.set(enableTinGen);
		propEnableCopperGen.set(enableCopperGen);
		propEnablePlatinumGen.set(enablePlatinumGen);


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
			if (Reference.MODID.equals(event.getModID()))
			{
				if (event.getConfigID().equals(CATEGORY_NAME_WORLD_GEN)) //|| event.getConfigID().equals(CATEGORY_NAME_ITEMS))
				{
					syncFromGUI();
				}
			}
		}
	}
}
