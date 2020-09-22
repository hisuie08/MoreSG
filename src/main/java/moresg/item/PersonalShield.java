package moresg.item;
import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class PersonalShield extends ItemArmor {
    public PersonalShield() {
        super(PERSONALSHIELDMATERIAL, 1, EntityEquipmentSlot.CHEST);
        String name = "personal_shield";
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItems.add(this);
    }

    private static final ItemArmor.ArmorMaterial PERSONALSHIELDMATERIAL =  EnumHelper.addArmorMaterial(
            "personal_shield", MoreSG.MODID + ":personal_shield", 10000000,
            new int[] {10000,10000,10000,10000}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 300.0F);

}
