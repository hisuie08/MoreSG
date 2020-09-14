package moresg.init;


import moresg.MoreSG;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = MoreSG.MODID)
public class InitEffects {
    public static List<PotionEffect> registeredEffects = new ArrayList<PotionEffect>();
    public static PotionEffect ZAT_STUN;
}
