package moresg.particle;

import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;

public class ZatParticle extends Particle{
    protected ZatParticle(World worldIn, double posXIn, double posYIn, double posZIn) {
        super(worldIn, posXIn, posYIn, posZIn);
    }

    public void setMaxAge() {
        super.setMaxAge(10);
    }
}
