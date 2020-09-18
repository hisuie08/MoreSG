package moresg.init;

import moresg.MoreSG;
import moresg.item.ArmorBase;
import moresg.item.StuffGun;
import moresg.item.Zatniktel;
import moresg.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitItems {
    public static List<Item> registeredItems = new ArrayList<Item>();
    public static Item BlockTitaniumOre;
    public static Item NAQUADAH_AXE;
    public static Item NAQUADAH_HOE;
    public static Item NAQUADAH_PICKAXE;
    public static Item NAQUADAH_SWORD;
    public static Item NAQUADAH_SPADE;
    public static Item ZATNIKTEL;
    public static Item STUFFGUN;
    public static Item JAFFA_HELMET;
    public static Item JAFFA_CHESTPLATE;
    public static Item JAFFA_LEGGINGS;
    public static Item JAFFA_BOOTS;

    public static final Item.ToolMaterial NAQUADAHTOOLMATERIAL = EnumHelper.addToolMaterial(
            "ingotNaquadahAlloy",5,100000,20.0F,5.0F,1);

    public static final ItemArmor.ArmorMaterial NAQUADAHARMORMATERIAL =  EnumHelper.addArmorMaterial("jaffa_armor", MoreSG.MODID + ":jaffa", 14,
            new int[] {6, 15, 21, 9}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

    public static void init() {
        //Blocks

        //Tools
        NAQUADAH_AXE = new ToolAxe("naquadah_axe", NAQUADAHTOOLMATERIAL);
        NAQUADAH_HOE = new ToolHoe("naquadah_hoe",NAQUADAHTOOLMATERIAL);
        NAQUADAH_PICKAXE = new ToolPickaxe("naquadah_pickaxe",NAQUADAHTOOLMATERIAL);
        NAQUADAH_SPADE = new ToolSpade("naquadah_shovel",NAQUADAHTOOLMATERIAL);
        NAQUADAH_SWORD = new ToolSword("naquadah_sword",NAQUADAHTOOLMATERIAL);
        ZATNIKTEL = new Zatniktel();
        STUFFGUN = new StuffGun();
        //Armor
        JAFFA_HELMET = new ArmorBase("jaffa_helmet",NAQUADAHARMORMATERIAL,1, EntityEquipmentSlot.HEAD);
        JAFFA_CHESTPLATE = new ArmorBase("jaffa_chestplate",NAQUADAHARMORMATERIAL,1,EntityEquipmentSlot.CHEST);
        JAFFA_LEGGINGS = new ArmorBase("jaffa_leggings",NAQUADAHARMORMATERIAL,2,EntityEquipmentSlot.LEGS);
        JAFFA_BOOTS = new ArmorBase("jaffa_boots",NAQUADAHARMORMATERIAL,1,EntityEquipmentSlot.FEET);


    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(registeredItems.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerRenderers(ModelRegistryEvent event){
        registeredItems.forEach(InitItems::registerRenderer);
    }

    private static void registerRenderer(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }


}
