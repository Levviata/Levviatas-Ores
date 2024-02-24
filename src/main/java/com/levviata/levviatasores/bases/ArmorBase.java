package com.levviata.levviatasores.bases;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {

    public ArmorBase(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot slot) {
        super(material, renderIndexIn, slot);
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
