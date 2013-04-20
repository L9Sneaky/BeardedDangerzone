package com.N00byEdge.BD.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.N00byEdge.BD.Bearded_Dangerzone;

public class BlockRawBeard extends Block {
    public BlockRawBeard(int id, Material par2Material) {
        super(id, par2Material);
        setHardness(0.5F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public int idDropped(int par1, Random rand, int par2) {
        return Bearded_Dangerzone.beardPieceID;
    }

    @Override
    public int quantityDropped(Random rand) {
        return rand.nextInt(51 - 25) + 25;
    }
}