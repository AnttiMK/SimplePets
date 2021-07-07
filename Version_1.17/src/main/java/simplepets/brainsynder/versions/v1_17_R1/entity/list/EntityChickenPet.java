package simplepets.brainsynder.versions.v1_17_R1.entity.list;

import net.minecraft.world.entity.EntityType;
import simplepets.brainsynder.api.entity.passive.IEntityChickenPet;
import simplepets.brainsynder.api.pet.PetType;
import simplepets.brainsynder.api.user.PetUser;
import simplepets.brainsynder.versions.v1_17_R1.entity.EntityAgeablePet;

/**
 * NMS: {@link net.minecraft.server.v1_16_R3.EntityChicken}
 */
public class EntityChickenPet extends EntityAgeablePet implements IEntityChickenPet {
    public EntityChickenPet(PetType type, PetUser user) {
        super(EntityType.CHICKEN, type, user);
    }
}
