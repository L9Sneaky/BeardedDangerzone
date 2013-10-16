package com.N00byEdge.BD.item;

import com.N00byEdge.BD.lib.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LoadItems {
    public static void load() {
        beardPieceLoad();
        nokiaLoad();
    }
    public static void beardPieceLoad(){
        BDItems.beardPiece = new ItemBeardPiece(Ids.BeardPieceID).setUnlocalizedName(Itemname.BEARDPIECE_NAME);
        GameRegistry.registerItem(BDItems.beardPiece, Reference.MODID + BDItems.beardPiece.getUnlocalizedName());
        LanguageRegistry.addName(BDItems.beardPiece, Itemname.BEARDPIECE_NAME);
    }
    
    public static void nokiaLoad(){
        BDItems.nokia = new ItemNokia(Ids.NokiaID).setUnlocalizedName(Itemname.NOKIA_NAME);
        GameRegistry.registerItem(BDItems.nokia, Reference.MODID + BDItems.nokia.getUnlocalizedName());
        LanguageRegistry.addName(BDItems.nokia, Itemname.NOKIA_NAME);
    }
    
    public static void nokiaPieceLoad(){
        BDItems.rawNokia = new ItemNokia(Ids.RawNokiaID).setUnlocalizedName(Itemname.RAWNOKIA_NAME);
        GameRegistry.registerItem(BDItems.rawNokia, Reference.MODID + BDItems.rawNokia.getUnlocalizedName());
        LanguageRegistry.addName(BDItems.rawNokia, Itemname.RAWNOKIA_NAME);
    }
}
