package com.levviata.bases;

import com.levviata.Main;
import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Objects;
import java.util.Random;

public class GenericOreBase extends Block implements IHasModel {
    private final Item droppedItem;

    public GenericOreBase(String name, Material material, float hardness, int harvestLevel, Item droppedItem) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(3);
        setHarvestLevel("pickaxe", harvestLevel);
        this.droppedItem = droppedItem;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
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