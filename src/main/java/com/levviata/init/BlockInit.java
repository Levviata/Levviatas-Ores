package com.levviata.init;

import com.levviata.bases.GenericOreBase;
import com.levviata.bases.OreBlockBase;
import com.levviata.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block TIN_ORE = new GenericOreBase(
            "tin_ore", Material.IRON, 3, 2, ItemInit.RAW_TIN, EnumHandler.EnumType.TIN_ORE);
    public static final Block COPPER_ORE = new GenericOreBase(
            "copper_ore", Material.IRON, 3, 2, ItemInit.RAW_COPPER, EnumHandler.EnumType.COPPER_ORE);
    public static final Block PLATINUM_ORE = new GenericOreBase(
            "platinum_ore", Material.IRON, 5, 3, ItemInit.RAW_PLATINUM, EnumHandler.EnumType.PLATINUM_ORE);
    public static final Block RAW_TIN_BLOCK = new OreBlockBase(
            "raw_tin_block", Material.IRON, 3, 2);
    public static final Block RAW_COPPER_BLOCK = new OreBlockBase(
            "raw_copper_block", Material.IRON, 3, 2);
    public static final Block RAW_PLATINUM_BLOCK = new OreBlockBase(
            "raw_platinum_block", Material.IRON, 5, 3);
}
