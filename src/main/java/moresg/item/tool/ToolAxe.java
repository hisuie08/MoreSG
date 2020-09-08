package moresg.item.tool;


import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe{
    public ToolAxe(String name, ToolMaterial material) {
        super(material, 6.0F, -3.2F);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);

    }

}