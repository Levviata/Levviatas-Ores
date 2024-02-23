package com.levviata.world.gen.ores;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

import static com.levviata.init.BlockInit.*;

public class CopperOreGen {
    static Predicate<IBlockState> granitePredicate = (blockState) -> blockState.getBlock() == Blocks.STONE && blockState.getValue(BlockStone.VARIANT) == BlockStone.EnumType.GRANITE;
    public static void genCopper(int size, WorldGenerator gen, World world, Random random, BlockPos pos) {
        WorldGenerator genCopperDiorite = new WorldGenMinable(
                COPPER_ORE_DIORITE.getDefaultState(), size, BlockMatcher.forBlock((Block) granitePredicate));
        genCopperDiorite.generate(world, random, pos);
        WorldGenerator genCopperAndesite = new WorldGenMinable(
                COPPER_ORE_ANDESITE.getDefaultState(), size, BlockMatcher.forBlock((Block) granitePredicate));
        genCopperAndesite.generate(world, random, pos);

        WorldGenerator genCopperGranite = new WorldGenMinable(
                COPPER_ORE_GRANITE.getDefaultState(), size, BlockMatcher.forBlock((Block) granitePredicate));
        genCopperGranite.generate(world, random, pos);
    }
}
