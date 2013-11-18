package com.N00byEdge.BD.handlers;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

import com.N00byEdge.BD.lib.Ids;


public class BDFuelHandler implements IFuelHandler{
	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.itemID == Ids.BeardBlockID){
			return 7200;
		}else if(fuel.itemID == Ids.RawNokiaID){
			return 12800;
		}else{
			return 0;
		}
	}
}
