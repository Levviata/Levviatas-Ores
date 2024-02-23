package com.levviata.bases;

import com.levviata.Main;
import com.levviata.init.ItemInit;
import com.levviata.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name,  String oreDict, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        if (oreDict != null)
                OreDictionary.registerOre(oreDict, this);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(this, 0, "inventory");
    }
}
