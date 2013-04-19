package com.N00byEdge.BD;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import com.N00byEdge.BD.WorldGen.WorldGen_BD;
import com.N00byEdge.BD.block.BlockRawBeard;
import com.N00byEdge.BD.item.ItemBeardPiece;
import com.N00byEdge.BD.lib.Blockname;
import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.lib.Itemname;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Bearded_Dangerzone {
    /* Declaring stuff */
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

        rawBeardID = config.get(Configuration.CATEGORY_BLOCK,
                Blockname.RawBeard, Ids.RawBeardIDDefault).getInt();
        beardPieceID = config.get(Configuration.CATEGORY_ITEM,
                Itemname.BeardPiece, Ids.BeardPieceIDDefault).getInt();

        config.save();
        /* CONFIG END */

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
        rawBeard = new BlockRawBeard(rawBeardID, Material.rock)
                .setUnlocalizedName(Blockname.RawBeard);
        GameRegistry.registerBlock(rawBeard,
                Reference.MODID + rawBeard.getUnlocalizedName2());
        LanguageRegistry.addName(rawBeard, Blockname.RawBeard);
        GameRegistry.registerWorldGenerator(new WorldGen_BD());
    }

    private void loadItems() {
        /* LOADING BEARD PIECE */
        beardPiece = new ItemBeardPiece(beardPieceID)
                .setUnlocalizedName(Itemname.BeardPiece);
        GameRegistry.registerItem(beardPiece,
                Reference.MODID + beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(beardPiece, Itemname.BeardPiece);
    }
}