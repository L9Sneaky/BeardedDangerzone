package com.N00byEdge.BD;

import cpw.mods.fml.common.Loader;

public class checkN00beh {
	public static boolean checkNow(){
		try{
			if(Loader.isModLoaded("n00beh")){
	        	return true;
			}
		}catch(Exception e){
			e.printStackTrace(System.err);
		}
		return false;
	}
}
