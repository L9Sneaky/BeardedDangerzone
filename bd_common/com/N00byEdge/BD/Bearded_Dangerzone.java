package com.N00byEdge.BD;

import com.N00byEdge.BD.lib.*;
import com.N00byEdge.BD.handlers.InitHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Bearded_Dangerzone {

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        InitHandler.pre(event);
    }

    @Init
    public void load(FMLInitializationEvent event) {
        InitHandler.init(event);
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        InitHandler.post(event);
    }
}