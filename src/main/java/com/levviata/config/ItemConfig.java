package com.levviata.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.util.ArrayList;
import java.util.List;

import static com.levviata.config.Config.CATEGORY_NAME_BLOCKS;
import static com.levviata.config.Config.CATEGORY_NAME_ITEMS;


public class ItemConfig {

    public static void configInitItems(Configuration config) {


        /*propEnableNewItems = config.get(
                CATEGORY_NAME_BLOCKS,
                "enable_new_items",
                enableNewItems,
                "Enable or disable all NEW ITEMS."
        );
        propEnableNewItems.setLanguageKey("gui.lo_configuration.enable_new_items");

        List<String> propItems = new ArrayList<String>();
        propItems.add(propEnableNewItems.getName());
        config.setCategoryPropertyOrder(CATEGORY_NAME_ITEMS, propItems);*/
    }
}
