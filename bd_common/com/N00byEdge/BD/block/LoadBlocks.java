package com.N00byEdge.BD.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.N00byEdge.BD.lib.Blockname;
import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadBlocks {

    public static Block rawBeard;

    public static void load() {
        /* LOADING BEARD BLOCK */
        BDBlocks.rawBeard = new BlockRawBeard(Ids.RawBeardID, Material.rock).setUnlocalizedName(Blockname.RAWBEARD_NAME);
        GameRegistry.registerBlock(BDBlocks.rawBeard, Reference.MODID + BDBlocks.rawBeard.getUnlocalizedName());
        LanguageRegistry.addName(BDBlocks.rawBeard, Blockname.RAWBEARD_NAME);
        
        BDBlocks.beardBlock = new BlockRawBeard(Ids.BeardBlockID, Material.rock).setUnlocalizedName(Blockname.BEARDBLOCK_NAME);
        GameRegistry.registerBlock(BDBlocks.beardBlock, Reference.MODID + BDBlocks.beardBlock.getUnlocalizedName());
        LanguageRegistry.addName(BDBlocks.beardBlock, Blockname.BEARDBLOCK_NAME);
    }
}
