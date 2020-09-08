package moresg.item;

import net.minecraft.item.ItemBow;

public class Zatniktel extends ItemBow{
    public Zatniktel(){
        String name = "zatniktel";
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxDamage(4);
        this.setMaxStackSize(1);
        this.setNoRepair();
    }
}
