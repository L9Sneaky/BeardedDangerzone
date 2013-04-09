import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Bearded_Dangerzone.modid, name = "Bearded Dangerzone", version = "0.1a")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Bearded_Dangerzone
{
    public static final String modid = "N00byEdge_BeardedDangerzone";
    
    public static Block beardBlock;
    
    @Init
    public void load(FMLInitializationEvent event)
    { 
        //LOADING BEARD BLOCK
        beardBlock = new BlockBeardBlock(461, Material.rock).setUnlocalizedName("Beard Block");
        
        GameRegistry.registerBlock(beardBlock, modid + beardBlock.getUnlocalizedName2());
        
        LanguageRegistry.addName(beardBlock, "Beard Block");
    }
            
}