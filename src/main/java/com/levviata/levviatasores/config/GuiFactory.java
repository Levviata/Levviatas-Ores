package com.levviata.levviatasores.config;

import com.levviata.levviatasores.utils.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GuiFactory implements IModGuiFactory
{
    //this class is accessed when Forge needs a GUI made relating to your mod (e.g. config GUI)

    @Override
    public void initialize(Minecraft minecraftInstance)
    {
        //needed to implement IModGuiFactory but doesn't need to do anything
        // for the configuration gui
    }

    // called when your GUI needs to be created
    public GuiScreen createConfigGui(GuiScreen parentScreen)
    {
        return new LOConfigGui(parentScreen);
    }

    public boolean hasConfigGui() {
        return true;
    }

    // This function is needed for implementation only, the config gui does not require them
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    //This class inherits from GuiConfig, a specialized GuiScreen designed to display your
    // configuration categories
    public static class LOConfigGui extends GuiConfig
    {
        public LOConfigGui(GuiScreen parentScreen)
        {
            //I18n function basically "translates" or localizes the given key using the appropriate .lang file
            super(parentScreen, getConfigElements(), Reference.MODID,
                    false, false, I18n.format("gui.config.mainTitle"));
        }

        private static List<IConfigElement> getConfigElements()
        {
            List<IConfigElement> list = new ArrayList<IConfigElement>();
            //Add the two buttons that will go to each config category edit screen
            list.add(new DummyCategoryElement("worldGenCfg", "gui.config.ctgy.world_gen", CategoryEntryWorldGen.class));
            list.add(new DummyCategoryElement("copperCfg", "gui.config.ctgy.copper", CategoryEntryCopper.class));
            list.add(new DummyCategoryElement("tinCfg", "gui.config.ctgy.tin", CategoryEntryTin.class));
            list.add(new DummyCategoryElement("platinumCfg", "gui.config.ctgy.platinum", CategoryEntryPlatinum.class));
            //list.add(new DummyCategoryElement("itemsCfg", "gui.config.ctgy.items", CategoryEntryItems.class));
            //list.add(new DummyCategoryElement("miscCfg", "gui.config.ctgy.other", CategoryEntryOther.class));
            return list;
        }

        //the next two classes are the edit screens for each configuration category
        /*public static class CategoryEntryItems extends CategoryEntry
        {
            public CategoryEntryItems(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }


            @Override
            protected GuiScreen buildChildScreen()
            {
                //The following GuiConfig object specifies the configID of the object and thus will force-save
                // when closed.
                //Parent GuiConfig object's entryList will also be refreshed to reflect the changes.
                // --see GuiFactory of Forge for more info
                //Additionally, Forge best practices say to put the path to the config file for the category as
                // the title for the category config screen

                Configuration configuration = Config.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_ITEMS));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        Config.CATEGORY_NAME_ITEMS,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }*/
        public static class CategoryEntryWorldGen extends CategoryEntry {
            public CategoryEntryWorldGen(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                //The following GuiConfig object specifies the configID of the object and thus will force-save
                // when closed.
                //Parent GuiConfig object's entryList will also be refreshed to reflect the changes.
                // --see GuiFactory of Forge for more info
                //Additionally, Forge best practices say to put the path to the config file for the category as
                // the title for the category config screen

                Configuration configuration = Config.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_WORLD_GEN));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        Config.CATEGORY_NAME_WORLD_GEN,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }
        public static class CategoryEntryCopper extends CategoryEntry {
            public CategoryEntryCopper(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                //The following GuiConfig object specifies the configID of the object and thus will force-save
                // when closed.
                //Parent GuiConfig object's entryList will also be refreshed to reflect the changes.
                // --see GuiFactory of Forge for more info
                //Additionally, Forge best practices say to put the path to the config file for the category as
                // the title for the category config screen

                Configuration configuration = Config.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_COPPER));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        Config.CATEGORY_NAME_COPPER,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }
        public static class CategoryEntryTin extends CategoryEntry {
            public CategoryEntryTin(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                //The following GuiConfig object specifies the configID of the object and thus will force-save
                // when closed.
                //Parent GuiConfig object's entryList will also be refreshed to reflect the changes.
                // --see GuiFactory of Forge for more info
                //Additionally, Forge best practices say to put the path to the config file for the category as
                // the title for the category config screen

                Configuration configuration = Config.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_TIN));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        Config.CATEGORY_NAME_TIN,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }
        public static class CategoryEntryPlatinum extends CategoryEntry {
            public CategoryEntryPlatinum(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop) {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                //The following GuiConfig object specifies the configID of the object and thus will force-save
                // when closed.
                //Parent GuiConfig object's entryList will also be refreshed to reflect the changes.
                // --see GuiFactory of Forge for more info
                //Additionally, Forge best practices say to put the path to the config file for the category as
                // the title for the category config screen

                Configuration configuration = Config.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(Config.CATEGORY_NAME_PLATINUM));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        Config.CATEGORY_NAME_PLATINUM,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }
        /*public static class CategoryEntryOther extends CategoryEntry
        {
            public CategoryEntryOther(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
            {
                super(owningScreen, owningEntryList, prop);
            }

            @Override
            protected GuiScreen buildChildScreen()
            {
                Configuration configuration = LESConfiguration.getConfig();
                ConfigElement cat_general = new ConfigElement(configuration.getCategory(LESConfiguration.CATEGORY_NAME_OTHER));
                List<IConfigElement> propertiesOnThisScreen = cat_general.getChildElements();
                String windowTitle = configuration.toString();

                return new GuiConfig(this.owningScreen, propertiesOnThisScreen,
                        this.owningScreen.modID,
                        LESConfiguration.CATEGORY_NAME_OTHER,
                        this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
                        this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
                        windowTitle);
                //this is a complicated object that specifies the category's gui screen, to better understand
                // how it works, look into the definitions of the called functions and objects
            }
        }*/
    }
}
