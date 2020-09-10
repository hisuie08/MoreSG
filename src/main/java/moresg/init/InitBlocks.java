package moresg.init;

import moresg.MoreSG;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitBlocks {
    public static List<Block> registeredBlock = new ArrayList<Block>();

}
