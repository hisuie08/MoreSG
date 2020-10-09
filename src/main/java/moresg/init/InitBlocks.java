package moresg.init;

import moresg.MoreSG;
import moresg.block.NaquadahGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitBlocks {
    public static List<Block> registeredBlocks = new ArrayList<>();
    public static Block NaquadahGenerator;

    public static void init(){
        NaquadahGenerator = new NaquadahGenerator("naquadah_generator",Material.ROCK);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(registeredBlocks.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void registerRenderers(ModelRegistryEvent event){
        registeredBlocks.forEach(InitBlocks::registerRenderer);
    }
    private static void registerRenderer(Block block){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                Objects.requireNonNull(block.getRegistryName()), "inventory"));
    }

}
