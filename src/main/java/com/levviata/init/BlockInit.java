package com.levviata.init;


import com.levviata.bases.blocks.OreBlockBase;
import com.levviata.bases.blocks.ores.CopperOreBase;
import com.levviata.bases.blocks.ores.PlatinumOreBase;
import com.levviata.bases.blocks.ores.TinOreBase;
import com.levviata.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;

import java.util.ArrayList;
import java.util.List;

import static com.levviata.bases.blocks.ores.CopperOreBase.COPPER_VARIANT;
import static com.levviata.bases.blocks.ores.PlatinumOreBase.PLATINUM_VARIANT;
import static com.levviata.bases.blocks.ores.TinOreBase.TIN_VARIANT;

public class BlockInit {



    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block TIN_ORE = new TinOreBase(
            "tin_ore", Material.IRON, 3, 2, ItemInit.RAW_TIN);
    public static final Block COPPER_ORE = new CopperOreBase(
            "copper_ore", Material.IRON, 3, 2, ItemInit.RAW_COPPER);
    public static final Block PLATINUM_ORE = new PlatinumOreBase(
            "platinum_ore", Material.IRON, 5, 3, ItemInit.RAW_PLATINUM);
    public static final Block RAW_TIN_BLOCK = new OreBlockBase(
            "raw_tin_block", Material.IRON, 3, 2);
    public static final Block RAW_COPPER_BLOCK = new OreBlockBase(
            "raw_copper_block", Material.IRON, 3, 2);
    public static final Block RAW_PLATINUM_BLOCK = new OreBlockBase(
            "raw_platinum_block", Material.IRON, 5, 3);
}
