package com.levviata.bases.blocks.ores;

import com.levviata.Main;
import com.levviata.bases.blocks.ItemBlockVariant;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Random;

public class CopperOreBase extends Block implements IHasModel, IMetaName {
    public static PropertyEnum<EnumHandler.EnumCopper> COPPER_VARIANT = PropertyEnum.create(
            "copper_variant", EnumHandler.EnumCopper.class);
    private final Item droppedItem;
    private String name;
    public CopperOreBase(String name, Material material, float hardness, int harvestLevel, Item droppedItem) {
        super(material);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness(hardness);
        setResistance(3);
        setHarvestLevel("pickaxe", harvestLevel);
        setDefaultState(this.blockState.getBaseState().withProperty(COPPER_VARIANT, EnumHandler.EnumCopper.COPPER_ORE));
        this.droppedItem = droppedItem;

        this.name = name;
        //type = typeReference;

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlockVariant(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public int damageDropped(IBlockState state) {
        return ((EnumHandler.EnumCopper)state.getValue(COPPER_VARIANT)).getMeta();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumHandler.EnumCopper)state.getValue(COPPER_VARIANT)).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(COPPER_VARIANT, EnumHandler.EnumCopper.byMetadata(meta));
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this, 1, getMetaFromState(world.getBlockState(pos)));
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> stack) {
        for(EnumHandler.EnumCopper variant : EnumHandler.EnumCopper.values()) {
            stack.add(new ItemStack(this, 1, variant.getMeta()));
        }
    }
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {COPPER_VARIANT});
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return EnumHandler.EnumCopper.values()[stack.getItemDamage()].getName();
    }

    @Override
    public void registerModels() {
        for (int meta = 0; meta < EnumHandler.EnumCopper.values().length; meta++) {
            Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), meta, EnumHandler.EnumCopper.values()[meta].getName(),"inventory");
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