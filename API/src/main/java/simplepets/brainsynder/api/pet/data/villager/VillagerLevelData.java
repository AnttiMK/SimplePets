package simplepets.brainsynder.api.pet.data.villager;

import simplepets.brainsynder.api.Namespace;
import simplepets.brainsynder.api.entity.passive.IEntityVillagerPet;
import simplepets.brainsynder.api.pet.PetData;
import simplepets.brainsynder.api.wrappers.villager.VillagerLevel;

@Namespace(namespace = "level")
public class VillagerLevelData extends PetData<IEntityVillagerPet> {
    public VillagerLevelData() {
        for (VillagerLevel type : VillagerLevel.values()) {
            addDefaultItem(type.name(), type.getIcon()
                    .withName("&#c8c8c8{name}: &a"+type.name()));
        }
    }

    @Override
    public Object getDefaultValue() {
        return VillagerLevel.NOVICE;
    }

    @Override
    public void onLeftClick(IEntityVillagerPet entity) {
        entity.setLevel(VillagerLevel.getNext(entity.getLevel()));
    }

    @Override
    public void onRightClick(IEntityVillagerPet entity) {
        entity.setLevel(VillagerLevel.getPrevious(entity.getLevel()));
    }

    @Override
    public Object value(IEntityVillagerPet entity) {
        return entity.getLevel();
    }
}
