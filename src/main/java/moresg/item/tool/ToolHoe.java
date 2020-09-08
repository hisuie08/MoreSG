package moresg.item.tool;

import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe {
    public ToolHoe(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
