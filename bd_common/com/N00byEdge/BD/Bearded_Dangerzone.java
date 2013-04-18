package com.N00byEdge.BD;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import com.N00byEdge.BD.WorldGen.WorldGen_BD;
import com.N00byEdge.BD.block.BlockRawBeard;
import com.N00byEdge.BD.item.ItemBeardPiece;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Bearded_Dangerzone.modid, name = "Bearded Dangerzone", version = "0.1a")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Bearded_Dangerzone {
    public static final String modid = "N00byEdge_BD";

    /*
     * Stuffs
     */

    public static Block rawBeard;
    public static int rawBeardID;

    public static Item beardPiece;
    public static int beardPieceID;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        /* CONFIG */
        Configuration config = new Configuration(
                event.getSuggestedConfigurationFile());
        config.load();

        rawBeardID = config.get(Configuration.CATEGORY_BLOCK, "Raw beard", 461)
                .getInt();
        beardPieceID = config.get(Configuration.CATEGORY_ITEM, "Beard Piece",
                4891).getInt();

        config.save();
        /* CONFIG END */
    }

    @Init
    public void load(FMLInitializationEvent event) {
        /*
         * Loads Blocks & Items
         */
        loadBlocks();
        loadItems();
    }

    /*
     * Loading Blocks & Items, gets called during init
     */

    private void loadBlocks() {
        // LOADING BEARD BLOCK//
        rawBeard = new BlockRawBeard(rawBeardID, Material.rock)
                .setUnlocalizedName("Beard Block");
        GameRegistry.registerBlock(rawBeard,
                modid + rawBeard.getUnlocalizedName2());
        LanguageRegistry.addName(rawBeard, "Beard Block");
        GameRegistry.registerWorldGenerator(new WorldGen_BD());
    }

    private void loadItems() {
        // LOADING BEARD PIECE//
        beardPiece = new ItemBeardPiece(beardPieceID)
                .setUnlocalizedName("Beard Piece");
        GameRegistry.registerItem(beardPiece,
                modid + beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(beardPiece, "Beard Piece");
    }
}