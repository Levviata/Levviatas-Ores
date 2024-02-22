package com.levviata.world.gen;

import com.levviata.bases.blocks.GenericOreBase;
import com.levviata.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import static com.levviata.init.BlockInit.*;

public class WorldGenOres implements IWorldGenerator {
    private final int bounds = 16;

    @Override
    public void generate(Random random, int i, int i1, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if(world.provider.getDimension() == 0) {
            generateOverworld(random, i, i1, world, iChunkGenerator, iChunkProvider);
        }
    }
    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        generateOre(
                TIN_ORE,
                TIN_ORE.getDefaultState(),
                world,
                random,
                chunkX * bounds,
                chunkZ * bounds,
                32,
                96,
                random.nextInt(3) + 6,
                10);
        generateOre(
                COPPER_ORE,
                COPPER_ORE.getDefaultState(),
                world,
                random,
                chunkX * bounds,
                chunkZ * bounds,
                32,
                96,
                random.nextInt(3) + 6,
                10);

        generateOre(
                PLATINUM_ORE,
                PLATINUM_ORE.getDefaultState(),
                world,
                random,
                chunkX * bounds,
                chunkZ * bounds,
                3,
                32,
                random.nextInt(3) + 5,
                5);
    }
    private void generateOre(
            Block ore, IBlockState oreState, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        Block origOre = ore;
        for(int i = 0; i < chances; i++) {
            BlockPos pos =
                    new BlockPos(x + random.nextInt(bounds),
                            minY + random.nextInt(deltaY),
                            z + random.nextInt(bounds));

            IBlockState blockStateNorth = world.getBlockState(pos.north());
            IBlockState blockStateSouth = world.getBlockState(pos.south());
            IBlockState blockStateWest = world.getBlockState(pos.west());
            IBlockState blockStateEast = world.getBlockState(pos.east());

            //Granite
            if (blockStateNorth.getBlock() == Blocks.STONE &&
                    blockStateNorth.getBlock().getMetaFromState(blockStateNorth) == 1 ||
                blockStateSouth.getBlock() == Blocks.STONE &&
                        blockStateSouth.getBlock().getMetaFromState(blockStateSouth) == 1 ||
                blockStateWest.getBlock() == Blocks.STONE &&
                        blockStateWest.getBlock().getMetaFromState(blockStateWest) == 1 ||
                blockStateEast.getBlock() == Blocks.STONE &&
                        blockStateEast.getBlock().getMetaFromState(blockStateEast) == 1
            ) {

                if (ore == COPPER_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            COPPER_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.GRANITE_COPPER_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == TIN_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            TIN_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.GRANITE_TIN_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == PLATINUM_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            PLATINUM_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.GRANITE_PLATINUM_ORE), size);
                    generator.generate(world, random, pos);
                }
            }
            //Diorite
            if (blockStateNorth.getBlock() == Blocks.STONE &&
                    blockStateNorth.getBlock().getMetaFromState(blockStateNorth) == 3 ||
                    blockStateSouth.getBlock() == Blocks.STONE &&
                            blockStateSouth.getBlock().getMetaFromState(blockStateSouth) == 3 ||
                    blockStateWest.getBlock() == Blocks.STONE &&
                            blockStateWest.getBlock().getMetaFromState(blockStateWest) == 3 ||
                    blockStateEast.getBlock() == Blocks.STONE &&
                            blockStateEast.getBlock().getMetaFromState(blockStateEast) == 3
            ) {

                if (ore == COPPER_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            COPPER_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.DIORITE_COPPER_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == TIN_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            TIN_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.DIORITE_TIN_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == PLATINUM_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            PLATINUM_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.DIORITE_PLATINUM_ORE), size);
                    generator.generate(world, random, pos);
                }
            }
            //Andesite
            if (blockStateNorth.getBlock() == Blocks.STONE &&
                    blockStateNorth.getBlock().getMetaFromState(blockStateNorth) == 5 ||
                    blockStateSouth.getBlock() == Blocks.STONE &&
                            blockStateSouth.getBlock().getMetaFromState(blockStateSouth) == 5 ||
                    blockStateWest.getBlock() == Blocks.STONE &&
                            blockStateWest.getBlock().getMetaFromState(blockStateWest) == 5 ||
                    blockStateEast.getBlock() == Blocks.STONE &&
                            blockStateEast.getBlock().getMetaFromState(blockStateEast) == 5
            ) {

                if (ore == COPPER_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            COPPER_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.ANDESITE_COPPER_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == TIN_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            TIN_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.ANDESITE_TIN_ORE), size);
                    generator.generate(world, random, pos);
                }
                if (ore == PLATINUM_ORE) {
                    WorldGenerator generator = new WorldGenMinable(
                            PLATINUM_ORE.getDefaultState().withProperty(GenericOreBase.VARIANT,
                                    EnumHandler.EnumType.ANDESITE_PLATINUM_ORE), size);
                    generator.generate(world, random, pos);
                }
            }
        }
    }
}
