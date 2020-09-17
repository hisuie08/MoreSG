package moresg.item;

import moresg.MoreSG;
import moresg.entity.StuffBeam;
import moresg.init.InitItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class StuffGun extends Item{
    public StuffGun(){
        super();
        String name = "stuff";
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxDamage(64);
        this.setMaxStackSize(1);
        this.setCreativeTab(MoreSG.creativeTabs);
        InitItems.registeredItems.add(this);
    }

    public static boolean isUsable(ItemStack stack)
    {
        return stack.getItemDamage() < stack.getMaxDamage() - 1;
    }
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.getItem() == Items.LAVA_BUCKET;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!worldIn.isRemote && isUsable(itemstack)) {
            StuffBeam beam = new StuffBeam(worldIn, playerIn);
            beam.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0, 1.5F, 0.0F);
            itemstack.damageItem(1,playerIn);
            worldIn.spawnEntity(beam);
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}

