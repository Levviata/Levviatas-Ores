package com.levviata.levviatasores.init;


import com.levviata.levviatasores.bases.blocks.GenericOreBase;
import com.levviata.levviatasores.bases.blocks.OreBlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block TIN_ORE = new GenericOreBase(
            "tin_ore", 3, 2, ItemInit.RAW_TIN);
    public static final Block COPPER_ORE = new GenericOreBase(
            "copper_ore", 3, 2, ItemInit.RAW_COPPER);
    public static final Block PLATINUM_ORE = new GenericOreBase(
            "platinum_ore", 5, 3, ItemInit.RAW_PLATINUM);
    public static final Block RAW_TIN_BLOCK = new OreBlockBase(
            "raw_tin_block", Material.IRON, 3, 2);
    public static final Block RAW_COPPER_BLOCK = new OreBlockBase(
            "raw_copper_block", Material.IRON, 3, 2);
    public static final Block RAW_PLATINUM_BLOCK = new OreBlockBase(
            "raw_platinum_block", Material.IRON, 5, 3);

    //Variants
    public static final Block COPPER_ORE_GRANITE = new GenericOreBase(
            "copper_ore_granite", 3, 2, ItemInit.RAW_COPPER);
    public static final Block TIN_ORE_GRANITE = new GenericOreBase(
            "tin_ore_granite", 3, 2, ItemInit.RAW_TIN);
    public static final Block PLATINUM_ORE_GRANITE = new GenericOreBase(
            "platinum_ore_granite", 5, 3, ItemInit.RAW_PLATINUM);

    public static final Block COPPER_ORE_ANDESITE = new GenericOreBase(
            "copper_ore_andesite", 3, 2, ItemInit.RAW_COPPER);
    public static final Block TIN_ORE_ANDESITE = new GenericOreBase(
            "tin_ore_andesite",3, 2, ItemInit.RAW_TIN);
    public static final Block PLATINUM_ORE_ANDESITE = new GenericOreBase(
            "platinum_ore_andesite", 5, 3, ItemInit.RAW_PLATINUM);

    public static final Block TIN_ORE_DIORITE = new GenericOreBase(
            "tin_ore_diorite", 3, 2, ItemInit.RAW_TIN);
    public static final Block COPPER_ORE_DIORITE = new GenericOreBase(
            "copper_ore_diorite", 3, 2, ItemInit.RAW_COPPER);
    public static final Block PLATINUM_ORE_DIORITE = new GenericOreBase(
            "platinum_ore_diorite", 5, 3, ItemInit.RAW_PLATINUM);
}
