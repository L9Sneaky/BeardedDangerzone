package com.N00byEdge.BD.handlers;

import com.N00byEdge.BD.lib.Ids;

import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.creativetab.*;
import net.minecraft.item.ItemStack;

public class Creativetab {
    public static CreativeTabs tabBD = new CreativeTabs("tabBD") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Ids.RawBeardID, 1, 0);
        }
    };

    public static void InitializeCreativeTabs() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabBD", "en_US", "Bearded Dangerzone");
    }
}