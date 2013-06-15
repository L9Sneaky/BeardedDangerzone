package com.N00byEdge.BD.WorldGen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.N00byEdge.BD.lib.Booleans;
import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.handlers.*;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGen_BD implements IWorldGenerator {
    // Beard Block Generation //
    int sent;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ) {

    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 10; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(64);
            int coordZ = random.nextInt(16) + chunkZ;

            if (Booleans.RawBeardGenEnabled == true) {
                (new WorldGenMinable(Ids.RawBeardID, 6)).generate(world, random, coordX, coordY, coordZ);
                sendmsg(true);
            } else {
                sendmsg(false);
            }
        }
    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

    }

    private void sendmsg(Boolean enabled) {
        if (!(sent == 1)) {
            sent = 0;
        }

        if (sent == 0 && enabled == true) {
            LogHelper.info("World Gen enabled. Will generate Raw Beard in world.");
            sent = 1;
        } else if (sent == 0 && enabled == false) {

            LogHelper.info("World Gen disabled. Will not generate Raw Beard in world.");
            sent = 1;
        }
    }

    public static void registerGen() {
        GameRegistry.registerWorldGenerator(new WorldGen_BD());
    }
}