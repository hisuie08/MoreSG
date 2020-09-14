package moresg.entity;

import moresg.MoreSG;
import moresg.init.InitItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderZatBeam extends Render<ZatBeam> {
    private float scale;
    public RenderZatBeam(RenderManager manager, float scaleIn){
        super(manager);
        this.scale=scaleIn;
    }
    @Override
    protected ResourceLocation getEntityTexture(ZatBeam entity){
        return new ResourceLocation(MoreSG.MODID, "textures/entities/projectiles/zatbeam.png");
    }
    @Override
    public void doRender(final ZatBeam entity,double x,double y, double z, float entityYaw, float partialTicks){
        super.doRender(entity, x, y, z, entityYaw, partialTicks);try {
            GlStateManager.pushMatrix();
            GlStateManager.translate(x, y + 0.5, z);

            GlStateManager.translate(0, -entity.height / 2, 0);

            GlStateManager.rotate(entityYaw, 0, 1, 0);

            GlStateManager.rotate(90 - entity.rotationPitch, 1, 0, 0);

            final ItemStack stack = new ItemStack(InitItems.ZATNIKTEL);

            IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(stack, entity.getEntityWorld(), null);
            model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.NONE, false);

            this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
            Minecraft.getMinecraft().getRenderItem().renderItem(stack, model);

        } finally {
            GlStateManager.popMatrix();
        }
    }

}