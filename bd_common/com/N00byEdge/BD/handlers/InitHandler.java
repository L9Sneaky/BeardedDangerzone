package com.N00byEdge.BD.handlers;

import com.N00byEdge.BD.checkN00beh;
import com.N00byEdge.BD.WorldGen.WorldGen_BD;
import com.N00byEdge.BD.block.LoadBlocks;
import com.N00byEdge.BD.item.LoadItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class InitHandler {
    public static void pre(FMLPreInitializationEvent event) {
    	/* N00beh Check */
    	n00behCheck();
    	
        /* Configuration */
        Config.Handler(event);

        /* Blocks */
        LoadBlocks.load();

        /* Items */
        LoadItems.load();
        
        /* Recipes */
        RecipeHandler.loadRecipies();
        
        /* WorldGen */
        WorldGen_BD.registerGen();
        
    }

    public static void init(FMLInitializationEvent event) {

    }

    public static void post(FMLPostInitializationEvent event) {

    }
    
    public static void n00behCheck(){
        if (checkN00beh.checkNow()){
        	LogHelper.info("N00beh Core Found! Good Dog!");
        }else{
        	LogHelper.info("N00beh Core is not installed!"
        			+ " The mod will ues its own, built in N00beh API.");
        }
    }
}
