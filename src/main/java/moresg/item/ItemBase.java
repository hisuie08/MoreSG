package moresg.item;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItems.add(this);
    }

}
