package com.levviata.bases.blocks;

import com.levviata.Main;
import com.levviata.handlers.EnumHandler;
import com.levviata.init.BlockInit;
import com.levviata.init.ItemInit;
import com.levviata.util.IHasModel;
import com.levviata.util.IMetaName;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentUntouching;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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
        ItemInit.ITEMS.add(new ItemBlockVariant(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, EnumHandler.EnumType.byMetadata(meta));
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this, 1, getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> stack) {
        for(EnumHandler.EnumType variant : EnumHandler.EnumType.values()) {
            stack.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return EnumHandler.EnumType.values()[stack.getItemDamage()].getName();
    }

    @Override
    public void registerModels() {
        for (int meta = 0; meta < EnumHandler.EnumType.values().length; meta++) {
            Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), meta, EnumHandler.EnumType.values()[meta].getName(),"inventory");
        }
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