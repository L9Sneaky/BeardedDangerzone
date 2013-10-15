package com.N00byEdge.BD.handlers;

import net.minecraft.item.ItemStack;

import com.N00byEdge.BD.lib.*;
import com.N00byEdge.BD.block.BDBlocks;
import com.N00byEdge.BD.item.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void loadRecipies(){
		loadSmelting();
		loadCrafting();
	}
	
	private static void loadCrafting(){
		craftingRecipesLoad();
	}
	
	private static void loadSmelting(){
		smeltingRecipesLoad();
	}
	
	private static void smeltingRecipesLoad(){
		GameRegistry.addSmelting(Ids.RawBeardID, new ItemStack(BDItems.beardPiece, 1), 0.1f);
	}
	
	private static void craftingRecipesLoad(){
		allOfOneKindRecipe(new ItemStack(BDItems.beardPiece), new ItemStack(BDBlocks.beardBlock));
	}
	
	private static void allOfOneKindRecipe(ItemStack input, ItemStack output){
		GameRegistry.addShapelessRecipe(output,
                input, input, input,
                input, input, input,
                input, input, input);
	}
}
