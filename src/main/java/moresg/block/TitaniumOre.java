package moresg.block;

import moresg.init.InitBlocks;
import moresg.init.InitItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class TitaniumOre extends BlockBase {

    public TitaniumOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return InitItems.BlockTitaniumOre;
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 1;
        int min = 1;
        return rand.nextInt(max) + min;
    }
}
