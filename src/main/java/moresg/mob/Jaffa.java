package moresg.mob;


import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Jaffa extends EntityMob {
    public Jaffa(World worldIn) {
        super(worldIn);
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
    }

    @Override
    public boolean isAIDisabled() {
        return false;
    }

    public void onUpdate()
    {
        super.onUpdate();

        if (!this.world.isRemote && this.world.getDifficulty() == EnumDifficulty.PEACEFUL)
        {
            this.setDead();
        }
    }
}
