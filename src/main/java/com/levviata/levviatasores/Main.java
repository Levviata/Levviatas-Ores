package com.levviata.levviatasores;

import com.levviata.levviatasores.config.Config;
import com.levviata.levviatasores.proxy.CommonProxy;
import com.levviata.levviatasores.recipes.CraftingRecipes;
import com.levviata.levviatasores.utils.Reference;
import com.levviata.levviatasores.utils.compat.oreDictionaryCompat;
import com.levviata.levviatasores.gen.WorldGenOres;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.levviata.levviatasores.Main.GUIFACTORY;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = GUIFACTORY)
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = "com.levviata.levviatasores.proxy.ClientProxy", serverSide = "com.levviata.levviatasores.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final String GUIFACTORY = "com.levviata.levviatasores.config.GuiFactory";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.clientPreInit();
        Config.preInit();
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 4);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        oreDictionaryCompat.init();
        CraftingRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
