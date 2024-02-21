package com.levviata.bases;

import com.levviata.Main;
import com.levviata.handlers.EnumHandler;
import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.util.IHasModel;
import com.levviata.util.compat.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Random;

public class GenericOreBase extends Block implements IHasModel, IMetaName {
    public static PropertyEnum<EnumHandler.EnumType> VARIANT = PropertyEnum.create("variant", EnumHandler.EnumType.class);
    private final Item droppedItem;
    private String name;
    public GenericOreBase(String name, Material material, float hardness, int harvestLevel, Item droppedItem, EnumHandler.EnumType type) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(3);
        setHarvestLevel("pickaxe", harvestLevel);
        setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, type));
        this.droppedItem = droppedItem;

        this.name = name;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }
    public void setOreType(EnumHandler.EnumType oreType) {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, oreType));
    }
    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }
    public int getMetaFromState(IBlockState state) {
        return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
    }

    @Override
    public ItemStack getPickBlock(IBlockState p_getPickBlock_1_, RayTraceResult p_getPickBlock_2_, World p_getPickBlock_3_, BlockPos p_getPickBlock_4_, EntityPlayer p_getPickBlock_5_) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(p_getPickBlock_1_));
    }

    @Override
    public void getSubBlocks(CreativeTabs p_149666_1_, NonNullList<ItemStack> p_149666_2_) {
        for (EnumHandler.EnumType variant : EnumHandler.EnumType.values()) {
            p_149666_2_.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{VARIANT});
    }
    @Override
    public String getSpecialName(ItemStack stack) {
        return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
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