package moresg.init;

import moresg.MoreSG;
import moresg.item.ItemBase;
import moresg.item.Zatniktel;
import moresg.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitItems {

    public static Item NAQUADAH_AXE;
    public static Item NAQUADAH_HOE;
    public static Item NAQUADAH_PICKAXE;
    public static Item NAQUADAH_SWORD;
    public static Item NAQUADAH_SPADE;
    public static Item NAQUADAH_INGOT;
    public static Item ZATNIKTEL;

    public static final CreativeTabs creativeTabs = new CreativeTabs("moresg:MoreSG") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(NAQUADAH_AXE);
        }
    };

    public static final Item.ToolMaterial NAQUADAHTOOLMATERIAL = EnumHelper.addToolMaterial(
            "ingotNaquadahAlloy",3,3000,16.0F,5.0F,1);

    public static void init() {
        NAQUADAH_AXE = new ToolAxe("naquadah_axe", NAQUADAHTOOLMATERIAL).setCreativeTab(creativeTabs);
        NAQUADAH_HOE = new ToolHoe("naquadah_hoe",NAQUADAHTOOLMATERIAL).setCreativeTab(creativeTabs);
        NAQUADAH_PICKAXE = new ToolPickaxe("naquadah_pickaxe",NAQUADAHTOOLMATERIAL).setCreativeTab(creativeTabs);
        NAQUADAH_SPADE = new ToolSpade("naquadah_shovel",NAQUADAHTOOLMATERIAL).setCreativeTab(creativeTabs);
        NAQUADAH_SWORD = new ToolSword("naquadah_sword",NAQUADAHTOOLMATERIAL).setCreativeTab(creativeTabs);
        NAQUADAH_INGOT = new ItemBase("naquadah_ingot").setCreativeTab(creativeTabs);
        ZATNIKTEL = new Zatniktel().setCreativeTab(creativeTabs);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(NAQUADAH_AXE,NAQUADAH_HOE,NAQUADAH_PICKAXE,NAQUADAH_SPADE,NAQUADAH_SWORD,
                NAQUADAH_INGOT,ZATNIKTEL);
    }

    @SubscribeEvent
    public static void registerRenderers(ModelRegistryEvent event){
        registerRenderer(NAQUADAH_AXE);
        registerRenderer(NAQUADAH_HOE);
        registerRenderer(NAQUADAH_PICKAXE);
        registerRenderer(NAQUADAH_SPADE);
        registerRenderer(NAQUADAH_SWORD);
        registerRenderer(NAQUADAH_INGOT);
        registerRenderer(ZATNIKTEL);

    }

    private static void registerRenderer(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }


}
