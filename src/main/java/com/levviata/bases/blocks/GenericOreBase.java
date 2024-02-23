package com.levviata.bases.blocks;

import com.levviata.Main;
import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;
import java.util.Random;

public class GenericOreBase extends Block implements IHasModel {

    private final Item droppedOre;
    public GenericOreBase(
            String name,
            float hardness,
            int harvestLevel,
            Item droppedOre
    ) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(6);
        setHarvestLevel("pickaxe", harvestLevel);
        this.droppedOre = droppedOre;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return droppedOre;
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