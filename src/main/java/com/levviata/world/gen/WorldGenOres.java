package com.levviata.world.gen;

import com.levviata.init.BlockInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenOres implements IWorldGenerator {

    @Override
    public void generate(Random random, int i, int i1, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        if(world.provider.getDimension() == 0) {
            generateOverworld(random, i, i1, world, iChunkGenerator, iChunkProvider);
        }
    }
    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator iChunkGenerator, IChunkProvider iChunkProvider) {
        generateOre(
                BlockInit.TIN_ORE.getDefaultState(),
                world,
                random,
                chunkX * 8,
                chunkZ * 8,
                18,
                64,
                random.nextInt(3) + 5,
                60);
        generateOre(
                BlockInit.COPPER_ORE.getDefaultState(),
                world,
                random,
                chunkX * 8,
                chunkZ * 8,
                18,
                64,
                random.nextInt(3) + 5,
                60);
        generateOre(
                BlockInit.PLATINUM_ORE.getDefaultState(),
                world,
                random,
                chunkX * 8,
                chunkZ * 8,
                3,
                32,
                random.nextInt(3) + 3,
                60);
    }
    private void generateOre(
            IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;
        for(int i = 0; i < chances; i++) {
            BlockPos pos =
                    new BlockPos(x + random.nextInt(8),
                            minY + random.nextInt(deltaY),
                            z + random.nextInt(8));
            WorldGenerator generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
