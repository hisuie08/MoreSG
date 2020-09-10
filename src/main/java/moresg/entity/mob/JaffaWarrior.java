package moresg.entity.mob;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;

import net.minecraft.world.World;
public class JaffaWarrior extends EntityCreature{

    public JaffaWarrior(World worldIn) {
        super(worldIn);
        this.tasks.addTask(1,new EntityAIWander(this,1));
        this.tasks.addTask(2, new EntityAILookIdle(this));
    }
}
