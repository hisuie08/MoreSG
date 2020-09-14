package moresg.item.tool;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe {
    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItems.add(this);
    }
}
