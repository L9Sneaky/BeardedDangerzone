package com.N00byEdge.BD.handlers;

import com.N00byEdge.BD.block.LoadBlocks;
import com.N00byEdge.BD.item.LoadItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class InitHandler {
    public static void pre(FMLPreInitializationEvent event){
        /* Configuration */
        Config.Handler(event);

        /* Blocks */
        LoadBlocks.load();

        /* Items */
        LoadItems.load();
    }
    public static void init(FMLInitializationEvent event){

    }
    public static void post(FMLPostInitializationEvent event){

    }
}
