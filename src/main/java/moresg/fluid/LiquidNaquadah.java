package moresg.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fluids.Fluid;

import java.awt.*;

public class LiquidNaquadah extends Fluid {

    public LiquidNaquadah(String fluidName, ResourceLocation still, ResourceLocation flowing, Color color) {
        super(fluidName, still, flowing, color);
    }
}
