package com.N00byEdge.BD.item;

import net.minecraft.item.Item;

import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.lib.Itemname;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadItems {
    public static void load() {

        Item beardPiece;

        /* LOADING BEARD PIECE */
        beardPiece = new ItemBeardPiece(Ids.BeardPieceID).setUnlocalizedName(Itemname.BEARDPIECE_NAME);
        GameRegistry.registerItem(beardPiece, Reference.MODID + beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(beardPiece, Itemname.BEARDPIECE_NAME);
    }
}
