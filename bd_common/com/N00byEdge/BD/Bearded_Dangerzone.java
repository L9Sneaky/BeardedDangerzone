package com.N00byEdge.BD;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.N00byEdge.BD.WorldGen.*;
import com.N00byEdge.BD.block.*;
import com.N00byEdge.BD.item.*;
import com.N00byEdge.BD.lib.*;
import com.N00byEdge.BD.config.ConfigHandler.Config;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Bearded_Dangerzone {
    /* Declaring stuff */

    public static Block rawBeard;

    public static Item beardPiece;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        Config.Handler(event);
        loadBlocks();
        loadItems();
    }

    @Init
    public void load(FMLInitializationEvent event) {

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }

    /* Loading Blocks & Items, gets called during PreInitialization */

    private void loadBlocks() {
        /* LOADING BEARD BLOCK */
        rawBeard = new BlockRawBeard(Ids.RawBeardID, Material.rock)
                .setUnlocalizedName(Blockname.RAWBEARD_NAME);
        GameRegistry.registerBlock(rawBeard,
                Reference.MODID + rawBeard.getUnlocalizedName2());
        LanguageRegistry.addName(rawBeard, Blockname.RAWBEARD_NAME);
        GameRegistry.registerWorldGenerator(new WorldGen_BD());
    }

    private void loadItems() {
        /* LOADING BEARD PIECE */
        beardPiece = new ItemBeardPiece(Ids.BeardPieceID)
                .setUnlocalizedName(Itemname.BEARDPIECE_NAME);
        GameRegistry.registerItem(beardPiece,
                Reference.MODID + beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(beardPiece, Itemname.BEARDPIECE_NAME);
    }
}