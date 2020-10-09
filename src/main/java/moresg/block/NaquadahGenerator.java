package moresg.block;

import moresg.init.InitBlocks;
import net.minecraft.block.material.Material;

public class NaquadahGenerator extends BlockBase{
    public NaquadahGenerator(String name, Material material) {
        super(name, material);
        InitBlocks.registeredBlocks.add(this);
    }
}
