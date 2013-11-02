package com.N00byEdge.BD.handlers;

import com.N00byEdge.BD.WorldGen.WorldGen_BD;
import com.N00byEdge.BD.block.LoadBlocks;
import com.N00byEdge.BD.item.LoadItems;
import com.N00byEdge.BD.lib.Reference;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class InitHandler {
    public static void pre(FMLPreInitializationEvent event) {
    	/* N00beh Check */
    	n00behCheck();
    	
    	/* Other Mods*/
    	checkIntegration();
    	
        /* Configuration */
        Config.Handler(event);

        /* Blocks */
        LoadBlocks.load();

        /* Items */
        LoadItems.load();
        
    }

    public static void init(FMLInitializationEvent event) {
        /* Recipes */
        RecipeHandler.loadRecipies();
    }

    public static void post(FMLPostInitializationEvent event) {
        /* WorldGen */
        WorldGen_BD.registerGen();
    }
    
    public static void n00behCheck(){
        if (checkMod("n00beh")){
        	LogHelper.info("N00beh Core Found! Good Dog!");
        }else{
        	LogHelper.info("N00beh Core is not installed!"
        			+ " The mod will ues its own, built in N00beh API.");
        }
    }
    
    public static boolean checkMod(String mod){
    	if(Loader.isModLoaded(mod)){
        	LogHelper.info("I found " + mod + ". YAY!");
        	return true;
        }else{
        	LogHelper.info("The mod " + mod + " was not found.");
        	return false;
        }
    }
    
    public static void checkIntegration(){
    	if(checkMod("IC2")){
    		Reference.IC2INTEGRATION = true;
    	}else{
    		Reference.IC2INTEGRATION = false;
    	}
    }
}
