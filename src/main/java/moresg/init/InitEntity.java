package moresg.init;

import moresg.MoreSG;
import moresg.client.renderer.RenderProjectile;
import moresg.entity.ZatBeam;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class InitEntity{
    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(ZatBeam.class, new IRenderFactory<ZatBeam>() {
            @Override
            public Render<ZatBeam> createRenderFor(RenderManager manager) {
                return new RenderProjectile(manager,0.5F,new ResourceLocation(MoreSG.MODID,"texture/entity/zatbeam.png"));
            }
        });
    }

}
