package com.N00byEdge.BD.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.N00byEdge.BD.handlers.Creativetab;

public class BlockRawBeard extends Block {
    public BlockRawBeard(int id, Material par2Material) {
        super(id, par2Material);
        setHardness(0.5F);
        this.setCreativeTab(Creativetab.tabBD);
    }
}