import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBeardBlock extends Block
{
    public BlockBeardBlock(int id, Material par2Material) {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}