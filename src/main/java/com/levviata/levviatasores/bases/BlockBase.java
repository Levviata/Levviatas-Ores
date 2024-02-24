package com.levviata.levviatasores.bases;

import com.levviata.levviatasores.Main;
import com.levviata.levviatasores.init.BlockInit;
import com.levviata.levviatasores.init.ItemInit;
import com.levviata.levviatasores.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;
import java.util.Random;

public class BlockBase extends Block implements IHasModel {
    private final Item droppedItem;

    public BlockBase(String name, Material material, float hardness, float resistance, String tool, int harvestLevel, CreativeTabs tab, Item droppedItem) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvestLevel);
        this.droppedItem = droppedItem;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerModel(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return droppedItem;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1; // Adjust as needed
    }
}