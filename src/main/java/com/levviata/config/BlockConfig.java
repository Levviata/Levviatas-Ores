package com.levviata.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.util.ArrayList;
import java.util.List;

import static com.levviata.config.Config.CATEGORY_NAME_BLOCKS;

public class BlockConfig {
    public static Property propEnableTin;
    public static Property propEnableCopper;
    public static Property propEnablePlatinum;
    public static boolean enableTin = true;
    public static boolean enableCopper = true;
    public static boolean enablePlatinum = true;
    public static void configInitBlocks(Configuration config) {
        propEnableTin = config.get(
                CATEGORY_NAME_BLOCKS,
                "enable_tin",
                enableTin,
                "Enable or disable all BLOCKS related to tin."
        );
        propEnableTin.setLanguageKey("gui.lo_configuration.enable_tin");

        propEnableCopper = config.get(
                CATEGORY_NAME_BLOCKS,
                "enable_copper",
                enableCopper,
                "Enable or disable all BLOCKS related to copper."
        );
        propEnableCopper.setLanguageKey("gui.lo_configuration.enable_copper");

        propEnablePlatinum = config.get(
                CATEGORY_NAME_BLOCKS,
                "enable_platinum",
                enablePlatinum,
                "Enable or disable all BLOCKS related to platinum."
        );
        propEnablePlatinum.setLanguageKey("gui.lo_configuration.enable_platinum");

        List<String> propBlocks = new ArrayList<String>();
        propBlocks.add(propEnableTin.getName());
        propBlocks.add(propEnableCopper.getName());
        propBlocks.add(propEnablePlatinum.getName());
        config.setCategoryPropertyOrder(CATEGORY_NAME_BLOCKS, propBlocks);
    }
}
