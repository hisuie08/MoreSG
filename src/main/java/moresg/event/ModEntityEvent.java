package moresg.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEntityEvent {
    @SubscribeEvent
    public static void onPlayerWearingPersonalShield(LivingEntityUseItemEvent event){
        if(event.getEntity() instanceof EntityPlayer){
             if(event.getItem().getItem() instanceof ItemFood || event.getItem().getItem() instanceof ItemPotion){
               event.setResult(Event.Result.DENY);
             }
        }
    }
    @SubscribeEvent
    public static void onZatBeamShootTNT(BlockEvent event){

    }
}
