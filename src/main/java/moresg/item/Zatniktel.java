package moresg.item;

import moresg.MoreSG;
import moresg.entity.ZatBeam;
import moresg.init.InitItems;

import net.minecraft.item.ItemSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Zatniktel extends Item {
    public Zatniktel(){
        super();
        String name = "zatniktel";
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxDamage(16);
        this.setMaxStackSize(1);
        this.setNoRepair();
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItems.add(this);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
        if (!worldIn.isRemote) {
            ZatBeam beam = new ZatBeam(worldIn, playerIn);
            beam.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0, 5.5F, 0.0F);
            worldIn.spawnEntity(beam);
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}

