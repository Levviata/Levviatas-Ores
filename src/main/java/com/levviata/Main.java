package com.levviata;

import com.levviata.proxy.CommonProxy;
import com.levviata.recipes.CraftingRecipes;
import com.levviata.util.Reference;
import com.levviata.util.compat.oreDictionaryCompat;
import com.levviata.world.gen.WorldGenOres;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;
    @SidedProxy(clientSide = "com.levviata.proxy.ClientProxy", serverSide = "com.levviata.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 4);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        CraftingRecipes.init();
        oreDictionaryCompat.registerOres();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
