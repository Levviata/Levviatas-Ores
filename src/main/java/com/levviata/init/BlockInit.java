package com.levviata.init;

import com.levviata.bases.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block TIN_ORE = new BlockBase("ingot_tin", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
}
