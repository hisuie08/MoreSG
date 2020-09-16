package moresg.entity;

import moresg.MoreSG;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
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

    public void setNoGravity() {
    }
}


