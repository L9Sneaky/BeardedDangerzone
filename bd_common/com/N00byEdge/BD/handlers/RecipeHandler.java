package com.N00byEdge.BD.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.N00byEdge.BD.lib.*;
import com.N00byEdge.BD.block.BDBlocks;
import com.N00byEdge.BD.item.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	private static ItemStack singleBeardPiece = new ItemStack(BDItems.beardPiece, 1);
	private static ItemStack singleNokia = new ItemStack(BDItems.nokia, 1);
	//private static ItemStack singleRawNokia = new ItemStack(BDItems.rawNokia, 1);
	private static ItemStack singleBeardBlock = new ItemStack(BDBlocks.beardBlock, 1);
	private static ItemStack singleRawBeard = new ItemStack(BDBlocks.rawBeard, 1);
	private static ItemStack singleObsidian = new ItemStack(Block.obsidian, 1);
	private static ItemStack singleDiamond = new ItemStack(Item.diamond, 1);
	private static ItemStack singleDiamondBlock = new ItemStack(Block.blockDiamond, 1);
	private static ItemStack singleIronBlock = new ItemStack(Block.blockIron, 1);
	
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
		GameRegistry.addSmelting(Ids.RawBeardID, singleBeardPiece, 0.1f);
	}
	
	private static void craftingRecipesLoad(){
		register9OfSameKindCrafting(singleBeardPiece, singleBeardBlock);
		
		register4OfSameKindCrafting(singleRawBeard, singleBeardPiece);
		try{
			//ringAroundSometingCrafting(singleDiamond, singleObsidian, new ItemStack(BDItems.rawNokia, 0));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		if(Reference.IC2INTEGRATION){
			ic2Recipes();
		}else{
			noic2Recipes();
		}
	}
	
	private static void register9OfSameKindCrafting(ItemStack input, ItemStack output){
		GameRegistry.addRecipe(output, "xxx", "xxx", "xxx",
		        'x', input);
	}
	
	private static void register4OfSameKindCrafting(ItemStack input, ItemStack output){
		GameRegistry.addRecipe(output, "xx", "xx",
		        'x', input);
	}
	/*
	private static void ringAroundNothingCrafting(ItemStack input, ItemStack output){
		GameRegistry.addRecipe(output, "xxx", "x x", "xxx",
		        'x', input);
	}
	*/
	private static void ringAroundSometingCrafting(ItemStack ring, ItemStack middle, ItemStack output){
		GameRegistry.addRecipe(output, "xxx", "xyx", "xxx",
		        'x', ring, 'y', middle);
	}
	/*
	private static void customSmelting(int inputID, int inputMetadata, ItemStack output, int xp){
		FurnaceRecipes.smelting().addSmelting(inputID, inputMetadata, output, xp);
	}
	*/
	
	
	/* 
	 * MOD INTEGRATION:
	 * 
	 * *IC2
	 */
	
	
	private static void ic2Recipes(){
		//ringAroundSometingCrafting(singleRawNokia, singleElectronicCircuit, singleNokia);
	}
	
	private static void noic2Recipes(){
		//ringAroundSometingCrafting(new ItemStack(BDItems.rawNokia, 1), singleIronBlock, singleNokia);
	}
}
