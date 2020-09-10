package moresg.item.tool;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword {
    public ToolSword(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItem.add(this);
    }
}
