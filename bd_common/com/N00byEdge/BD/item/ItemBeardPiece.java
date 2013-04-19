package com.N00byEdge.BD.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBeardPiece extends Item {
    public ItemBeardPiece(int id) {
        super(id);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    public void updateIcons(IconRegister iconReg) {
        iconIndex = iconReg.registerIcon(this.getUnlocalizedName());
    }

}