package com.levviata.levviatasores.bases;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(this, 0, "inventory");
    }
}
