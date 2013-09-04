package com.N00byEdge.BD.item;

import net.minecraft.item.Item;

import com.N00byEdge.BD.lib.Ids;
import com.N00byEdge.BD.lib.Itemname;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadItems {
    public static void load() {
        beardPieceLoad();
        nokiaLoad();
    }
    public static void beardPieceLoad(){
        Item beardPiece;

        beardPiece = new ItemBeardPiece(Ids.BeardPieceID).setUnlocalizedName(Itemname.BEARDPIECE_NAME);
        GameRegistry.registerItem(beardPiece, Reference.MODID + beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(beardPiece, Itemname.BEARDPIECE_NAME);
    }
    public static void nokiaLoad(){
        Item nokia;

        nokia = new ItemNokia(Ids.NokiaID).setUnlocalizedName(Itemname.NOKIA_NAME);
        GameRegistry.registerItem(nokia, Reference.MODID + nokia.getUnlocalizedName());
        LanguageRegistry.addName(nokia, Itemname.NOKIA_NAME);
    }
}
