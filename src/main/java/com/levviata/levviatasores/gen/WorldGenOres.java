package com.levviata.levviatasores.gen;

import com.google.common.base.Predicate;
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
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

import static com.levviata.levviatasores.config.Config.*;
import static com.levviata.levviatasores.init.BlockInit.*;

public class WorldGenOres implements IWorldGenerator {
    public static void preInit() {
        GameRegistry.registerWorldGenerator(new WorldGenOres(), 4);
    }
    private final int bounds = 16;

    @Override
    public void generate(Random random, int i, int i1, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if(world.provider.getDimension() == 0) {

            generateOverworld(random, i, i1, world, iChunkGenerator, iChunkProvider);
        }
    }
    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if (propEnableTinGen.getBoolean()) {
                generateOre(
                        TIN_ORE,
                        TIN_ORE.getDefaultState(),
                        world,
                        random,
                        chunkX * bounds,
                        chunkZ * bounds,
                        propYMinTin.getInt(),
                        propYMaxTin.getInt(),
                        random.nextInt(propTinSizeRandom.getInt()) + propTinSizeSet.getInt(),
                        propTinChance.getInt());
        }
        if (propEnableCopperGen.getBoolean()) {
                generateOre(
                        COPPER_ORE,
                        COPPER_ORE.getDefaultState(),
                        world,
                        random,
                        chunkX * bounds,
                        chunkZ * bounds,
                        propYMinCopper.getInt(),
                        propYMaxCopper.getInt(),
                        random.nextInt(propPlatinumSizeRandom.getInt()) + propPlatinumSizeSet.getInt(),
                        propCopperChance.getInt());
        }
        if (propEnablePlatinumGen.getBoolean()) {
                generateOre(
                        PLATINUM_ORE,
                        PLATINUM_ORE.getDefaultState(),
                        world,
                        random,
                        chunkX * bounds,
                        chunkZ * bounds,
                        propYMinPlatinum.getInt(),
                        propYMaxPlatinum.getInt(),
                        random.nextInt(propPlatinumSizeRandom.getInt()) + propPlatinumSizeSet.getInt(),
                        propPlatinumChance.getInt());
        }

    }
    private void generateOre(
            Block ore, IBlockState oreState, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        Block origOre = ore;
        Predicate<IBlockState> stoneMatcher = new Predicate<IBlockState>() {
            @Override
            public boolean apply(IBlockState state) {
                return state != null && state.getBlock() == Blocks.STONE && state.getBlock().getMetaFromState(state) == 0;
            }
        };
        Predicate<IBlockState> graniteMatcher = new Predicate<IBlockState>() {
            @Override
            public boolean apply(IBlockState state) {
                return state != null && state.getBlock() == Blocks.STONE && state.getBlock().getMetaFromState(state) == 1;
            }
        };
        Predicate<IBlockState> dioriteMatcher = new Predicate<IBlockState>() {
            @Override
            public boolean apply(IBlockState state) {
                return state != null && state.getBlock() == Blocks.STONE && state.getBlock().getMetaFromState(state) == 3;
            }
        };
        Predicate<IBlockState> andesiteMatcher = new Predicate<IBlockState>() {
            @Override
            public boolean apply(IBlockState state) {
                return state != null && state.getBlock() == Blocks.STONE && state.getBlock().getMetaFromState(state) == 5;
            }
        };

        for(int i = 0; i < chances; i++) {
            BlockPos pos =
                    new BlockPos(x + random.nextInt(bounds),
                            minY + random.nextInt(deltaY),
                            z + random.nextInt(bounds));
            if (ore == COPPER_ORE) {
                WorldGenerator genGraniteCopper = new WorldGenMinable(
                        COPPER_ORE_GRANITE.getDefaultState(), size, graniteMatcher);
                genGraniteCopper.generate(world, random, pos);
                WorldGenerator genDioriteCopper = new WorldGenMinable(
                        COPPER_ORE_DIORITE.getDefaultState(), size, dioriteMatcher);
                genDioriteCopper.generate(world, random, pos);
                WorldGenerator genAndesiteCopper = new WorldGenMinable(
                        COPPER_ORE_ANDESITE.getDefaultState(), size, andesiteMatcher);
                genAndesiteCopper.generate(world, random, pos);
            }
            if (ore == TIN_ORE) {
                WorldGenerator genGraniteTin = new WorldGenMinable(
                        TIN_ORE_GRANITE.getDefaultState(), size, graniteMatcher);
                genGraniteTin.generate(world, random, pos);
                WorldGenerator genDioriteTin = new WorldGenMinable(
                        TIN_ORE_DIORITE.getDefaultState(), size, dioriteMatcher);
                genDioriteTin.generate(world, random, pos);
                WorldGenerator genAndesiteTin = new WorldGenMinable(
                        TIN_ORE_ANDESITE.getDefaultState(), size, andesiteMatcher);
                genAndesiteTin.generate(world, random, pos);
            }
            if (ore == PLATINUM_ORE) {
                WorldGenerator genGranitePlatinum = new WorldGenMinable(
                        PLATINUM_ORE_GRANITE.getDefaultState(), size, graniteMatcher);
                genGranitePlatinum.generate(world, random, pos);
                WorldGenerator genDioritePlatinum = new WorldGenMinable(
                        PLATINUM_ORE_DIORITE.getDefaultState(), size, dioriteMatcher);
                genDioritePlatinum.generate(world, random, pos);
                WorldGenerator genAndesitePlatinum = new WorldGenMinable(
                        PLATINUM_ORE_ANDESITE.getDefaultState(), size, andesiteMatcher);
                genAndesitePlatinum.generate(world, random, pos);
            }

            //Normal generator
            WorldGenerator generator = new WorldGenMinable(oreState, size, stoneMatcher);
            generator.generate(world, random, pos);

        }
    }
}
