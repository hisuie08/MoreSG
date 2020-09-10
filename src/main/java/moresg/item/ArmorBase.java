package moresg.item;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor{
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn){
        super(materialIn,renderIndexIn,equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItem.add(this);
    }
}
