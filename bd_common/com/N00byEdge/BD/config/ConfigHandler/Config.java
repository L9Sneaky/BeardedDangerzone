package com.N00byEdge.BD.config.ConfigHandler;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.N00byEdge.BD.lib.*;

public class Config {
    public static void Handler(FMLPreInitializationEvent event) {
        /* CONFIG */
        Configuration config = new Configuration(
                event.getSuggestedConfigurationFile());
        config.load();

        Ids.RawBeardID = config.get(Configuration.CATEGORY_BLOCK,
                Blockname.RAWBEARD_NAME, Ids.RawBeardIDDefault).getInt();
        Ids.BeardPieceID = config.get(Configuration.CATEGORY_ITEM,
                Itemname.BEARDPIECE_NAME, Ids.BeardPieceIDDefault).getInt();

        config.save();
        /* CONFIG END */
    }
}
