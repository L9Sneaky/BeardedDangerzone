package com.N00byEdge.BD.handlers;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.N00byEdge.BD.lib.Reference;

public class Creativetab {
    public static CreativeTabs tabBD = new CreativeTabs("tabBD") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Item.diamond.itemID, 1, 0);
        }
    };

    public static void InitializeCreativeTabs() {
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabBD", "en_US", Reference.MODNAME);
    }
}