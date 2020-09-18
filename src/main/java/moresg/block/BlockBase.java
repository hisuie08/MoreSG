package moresg.block;

import moresg.MoreSG;
import moresg.init.InitBlocks;
import moresg.init.InitItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block {
    public BlockBase(String name, Material material)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitBlocks.registeredBlocks.add(this);
        InitItems.registeredItems.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}