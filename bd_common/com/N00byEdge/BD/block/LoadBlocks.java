package com.N00byEdge.BD.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.N00byEdge.BD.WorldGen.WorldGen_BD;
import com.N00byEdge.BD.lib.Blockname;
import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadBlocks {
    
    public static Block rawBeard;
    
    public static void load(){
        /* LOADING BEARD BLOCK */
        rawBeard = new BlockRawBeard(Ids.RawBeardID, Material.rock)
                .setUnlocalizedName(Blockname.RAWBEARD_NAME);
        GameRegistry.registerBlock(rawBeard,
                Reference.MODID + rawBeard.getUnlocalizedName2());
        LanguageRegistry.addName(rawBeard, Blockname.RAWBEARD_NAME);
        WorldGen_BD.registerGen();
    }
}
