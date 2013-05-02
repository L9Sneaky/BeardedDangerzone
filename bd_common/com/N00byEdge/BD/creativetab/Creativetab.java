package com.N00byEdge.BD.creativetab;

import com.N00byEdge.BD.lib.Ids;

import net.minecraft.creativetab.*;
import net.minecraft.item.ItemStack;

public class Creativetab {
    public static CreativeTabs tabBD = new CreativeTabs("tabCustom") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Ids.RawBeardID, 1, 0);
        }
    };
}