package moresg.item;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.item.ItemBow;

public class Zatniktel extends ItemBow{
    public Zatniktel(){
        super();
        String name = "zatniktel";
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxDamage(4);
        this.setMaxStackSize(1);
        this.setNoRepair();
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItem.add(this);
    }

}
