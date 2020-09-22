package moresg.event;

import moresg.MoreSG;
import moresg.entity.ZatBeam;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModEntityEvent {
    @SubscribeEvent
    public static void onCreeperHitByZat(LivingAttackEvent event){
        if (event.getSource() == ZatBeam.zatshoot && event.getEntity() instanceof EntityCreeper){
        }
    }
}
