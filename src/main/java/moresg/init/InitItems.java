package moresg.init;

import moresg.MoreSG;
import moresg.item.*;
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
import java.util.Objects;


@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitItems {
    public static List<Item> registeredItems = new ArrayList<>();
    public static Item Compact_Naquadah_Circuit;
    public static Item Jaffa_Helmet;
    public static Item Jaffa_Chestplate;
    public static Item Jaffa_Leggings;
    public static Item Jaffa_Boots;
    public static Item LiquidNaquadahCell;
    public static Item Naquadah_Axe;
    public static Item Naquadah_Energy_Barrel;
    public static Item Naquadah_Hoe;
    public static Item Naquadah_Pickaxe;
    public static Item Naquadah_Sword;
    public static Item Naquadah_Spade;
    public static Item Personal_Shield;
    public static Item Staff_Gun;
    public static Item Zatniktel;

    public static final Item.ToolMaterial NAQUADAHTOOLMATERIAL = EnumHelper.addToolMaterial(
            "ingotNaquadahAlloy",5,100000,20.0F,5.0F,1);

    public static final ItemArmor.ArmorMaterial NAQUADAHARMORMATERIAL =  EnumHelper.addArmorMaterial("jaffa_armor", MoreSG.MODID + ":jaffa", 14,
            new int[] {6, 15, 21, 9}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

    public static void init() {
        //Blocks

        //Tools
        Naquadah_Axe = new ToolAxe("naquadah_axe", NAQUADAHTOOLMATERIAL);
        Naquadah_Hoe = new ToolHoe("naquadah_hoe",NAQUADAHTOOLMATERIAL);
        Naquadah_Pickaxe = new ToolPickaxe("naquadah_pickaxe",NAQUADAHTOOLMATERIAL);
        Naquadah_Spade = new ToolSpade("naquadah_shovel",NAQUADAHTOOLMATERIAL);
        Naquadah_Sword = new ToolSword("naquadah_sword",NAQUADAHTOOLMATERIAL);
        Zatniktel = new Zatniktel();
        Staff_Gun = new StaffGun();
        //Armor
        Jaffa_Helmet = new ArmorBase("jaffa_helmet",NAQUADAHARMORMATERIAL,1, EntityEquipmentSlot.HEAD);
        Jaffa_Chestplate = new ArmorBase("jaffa_chestplate",NAQUADAHARMORMATERIAL,1,EntityEquipmentSlot.CHEST);
        Jaffa_Leggings = new ArmorBase("jaffa_leggings",NAQUADAHARMORMATERIAL,2,EntityEquipmentSlot.LEGS);
        Jaffa_Boots = new ArmorBase("jaffa_boots",NAQUADAHARMORMATERIAL,1,EntityEquipmentSlot.FEET);
        Personal_Shield = new PersonalShield();
        //Items
        Compact_Naquadah_Circuit = new ItemBase("compact_naquadah_circuit");
        LiquidNaquadahCell = new LiquidNaquadahCell("liquid_naquadah_cell");
        Naquadah_Energy_Barrel = new ItemBase("naquadah_energy_barrel");


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
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }
}
