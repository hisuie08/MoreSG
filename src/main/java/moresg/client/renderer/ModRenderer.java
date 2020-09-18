package moresg.client.renderer;

import moresg.MoreSG;
import moresg.entity.ZatBeam;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ModRenderer {
    public static void register(){
        RenderingRegistry.registerEntityRenderingHandler(
                ZatBeam.class, new IRenderFactory<ZatBeam>() {
                    @Override
                    public Render<ZatBeam> createRenderFor(RenderManager manager) {
                        return new RenderProjectile(
                                manager,0.3F,new ResourceLocation(MoreSG.MODID,"textures/entity/zatbeam.png")
                        );
                    }
                }
                );
    }
}
