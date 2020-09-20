package moresg.init;

import moresg.MoreSG;
import moresg.entity.ZatBeam;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(MoreSG.MODID)
public class InitEntity{
    public static EntityEntry ZAT_BEAM;
    private static int entityID = 0;

    @Mod.EventBusSubscriber(modid = MoreSG.MODID)
    public static class InitEntityHandler{

        @SubscribeEvent
        public static void registerEntity(final RegistryEvent.Register<EntityEntry> event){
            final EntityEntry[] entries = {
                    createBuilder("ZatBeam")
                            .entity(ZatBeam.class)
                            .tracker(64, 1, false)
                            .build(),
            };
            event.getRegistry().registerAll(entries);
        }
    }

    private static <E extends Entity> EntityEntryBuilder<E> createBuilder(final String name) {
        final EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
        final ResourceLocation registryName = new ResourceLocation(MoreSG.MODID, name);
        return builder.id(registryName, entityID++).name(registryName.toString());
    }
}
