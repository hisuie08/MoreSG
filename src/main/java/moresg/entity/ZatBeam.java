package moresg.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;


public class ZatBeam extends EntityThrowable
{

    public ZatBeam(World worldIn){
        super(worldIn);
    }

    public ZatBeam(World worldIn, EntityLivingBase throwerIn) {
        super(worldIn, throwerIn);
    }
    public ZatBeam(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    public static void registerFixesZatBeam(DataFixer fixer, String name){
        registerFixesThrowable(fixer,"EntityZatBeam");
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted > 5) {
            this.setDead();
        }
        this.world.spawnParticle(
                EnumParticleTypes.REDSTONE,
                this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D,
                this.motionX, this.motionY, this.motionZ);

    }


    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
            int i = 100;

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
            }


        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            this.setDead();
        }
    }

    @Override
    protected float getGravityVelocity() {
        return 0.0f;
    }
}


