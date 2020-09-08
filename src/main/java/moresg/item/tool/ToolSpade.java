package moresg.item.tool;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade{
    public ToolSpade(String name, ToolMaterial material){
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
