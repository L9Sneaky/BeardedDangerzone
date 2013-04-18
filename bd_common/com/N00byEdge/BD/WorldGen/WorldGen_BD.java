package com.N00byEdge.BD.WorldGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.N00byEdge.BD.Bearded_Dangerzone;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen_BD implements IWorldGenerator {
    // Beard Block Generation //
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(World world, Random random, int chunkX,
            int chunkZ) {

    }

    private void generateSurface(World world, Random random, int chunkX,
            int chunkZ) {
        for (int i = 0; i < 60; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(64);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(Bearded_Dangerzone.rawBeard.blockID, 9))
                    .generate(world, random, coordX, coordY, coordZ);
        }
    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

    }
}