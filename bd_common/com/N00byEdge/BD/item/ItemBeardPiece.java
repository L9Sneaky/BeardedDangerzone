package com.N00byEdge.BD.item;

import com.N00byEdge.BD.creativetab.CreativeTabBD;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBeardPiece extends Item {
    public ItemBeardPiece(int id) {
        super(id);
        this.setCreativeTab(CreativeTabBD());
    }

    @Override
    public void updateIcons(IconRegister iconReg) {
        iconIndex = iconReg.registerIcon(this.getUnlocalizedName());
    }
}