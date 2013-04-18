package com.N00byEdge.BD.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import com.N00byEdge.BD.*;

public class BlockRawBeard extends Block {
    public BlockRawBeard(int id, Material par2Material) {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random rand, int par2) {
        return Bearded_Dangerzone.beardPieceID;
    }

    public int quantityDropped(Random rand) {
        return rand.nextInt(51 - 25) + 25;
    }
}