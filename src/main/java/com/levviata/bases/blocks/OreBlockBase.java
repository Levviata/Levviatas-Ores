package com.levviata.bases.blocks;

import com.levviata.Main;
import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;
import java.util.Random;

public class OreBlockBase extends Block implements IHasModel {

    public OreBlockBase(
            String name,
            Material material,
            float hardness,
            int harvestLevel
            ) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(6);
        setHarvestLevel("pickaxe", harvestLevel);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public int quantityDropped(Random random) {
        return 1; // Adjust as needed
    }
    @Override
    public void registerModels() {
        Main.proxy.registerModel(Item.getItemFromBlock(this), 0, "inventory");
    }


}