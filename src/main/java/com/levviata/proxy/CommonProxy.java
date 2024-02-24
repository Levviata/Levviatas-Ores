package com.levviata.proxy;

import com.levviata.config.Config;
import com.levviata.recipes.CraftingRecipes;
import com.levviata.utils.compat.oreDictionaryCompat;
import com.levviata.world.gen.WorldGenOres;
import net.minecraft.item.Item;

public class CommonProxy {
    public void registerModel(Item item, int meta, String id) { }

    public void registerVariantRenderer(Item item, int meta, String fileName, String id) { }

    public void preInit() {
        Config.preInit();
        WorldGenOres.preInit();
    }

    public void init() {
        oreDictionaryCompat.init();
        CraftingRecipes.init();
    }

    public void postInit() {
    }
}
