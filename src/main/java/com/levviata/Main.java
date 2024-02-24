package com.levviata;

import com.levviata.config.Config;
import com.levviata.proxy.CommonProxy;
import com.levviata.recipes.CraftingRecipes;
import com.levviata.utils.Reference;
import com.levviata.utils.compat.oreDictionaryCompat;
import com.levviata.world.gen.WorldGenOres;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.levviata.Main.GUIFACTORY;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, guiFactory = GUIFACTORY)
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = "com.levviata.proxy.ClientProxy", serverSide = "com.levviata.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final String GUIFACTORY = "com.levviata.config.GuiFactory";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
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
        proxy.postInit();
    }
}
