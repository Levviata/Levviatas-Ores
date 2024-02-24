package com.levviata.levviatasores.bases.tools;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(this, 0, "inventory");
    }
    }

