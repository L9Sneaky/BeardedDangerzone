package com.N00byEdge.BD.creativetab;

import com.N00byEdge.BD.lib.Ids;

import net.minecraft.creativetab.*;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabBD extends CreativeTabs {
    public CreativeTabBD(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return Ids.BeardPieceID;
    }
}