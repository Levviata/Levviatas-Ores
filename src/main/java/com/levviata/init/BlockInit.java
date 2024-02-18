package com.levviata.init;

import com.levviata.bases.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block TIN_ORE = new BlockBase("tin_ore", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
    public static final Block PLATINUM_ORE = new BlockBase("platinum_ore", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
}
