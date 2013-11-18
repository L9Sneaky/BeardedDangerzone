package com.N00byEdge.BD.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import com.N00byEdge.BD.handlers.Creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBeardInfusion extends Block{
	public BlockBeardInfusion(int id, Material par2Material) {
		super(id, par2Material);
		setHardness(0.5F);
		this.setCreativeTab(Creativetab.tabBD);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(BDBlockTextures.TEXTURE_LOCATION + ":" + BDBlockTextures.BEARDINFUSION_TOP);
		botIcon = register.registerIcon(BDBlockTextures.TEXTURE_LOCATION + ":" + BDBlockTextures.BEARDINFUSION_BOT);
		sideIcon = register.registerIcon(BDBlockTextures.TEXTURE_LOCATION + ":" + BDBlockTextures.BEARDINFUSION_SIDE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta){
		if (side == 0){
			return botIcon;
		}else if(side == 1){
			return topIcon;
		}else{
			return sideIcon;
		}
	}
}