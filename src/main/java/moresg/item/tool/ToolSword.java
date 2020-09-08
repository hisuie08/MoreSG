package moresg.item.tool;

import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword {
    public ToolSword(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
