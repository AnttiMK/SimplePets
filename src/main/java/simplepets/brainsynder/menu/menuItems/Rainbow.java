package simplepets.brainsynder.menu.menuItems;

import org.bukkit.Material;
import simplepets.brainsynder.api.entity.IEntityPet;
import simplepets.brainsynder.api.entity.IRainbow;
import simplepets.brainsynder.menu.menuItems.base.MenuItemAbstract;
import simplepets.brainsynder.pet.PetDefault;
import simplepets.brainsynder.utils.ItemBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rainbow extends MenuItemAbstract {
    //This material is temp... I want to use the SKULL_ITEM with the texture below as the default
    //http://textures.minecraft.net/texture/cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5


    public Rainbow(PetDefault type, IEntityPet entityPet) {
        super(type, entityPet);
    }
    public Rainbow(PetDefault type) {
        super(type);
    }

    @Override
    public ItemBuilder getItem() {
        ItemBuilder item = type.getDataItemByName("rainbow", 0);
        if (entityPet instanceof IRainbow) {
            IRainbow var = (IRainbow) entityPet;
            item.withName(String.valueOf(item.toJSON().get("name")).replace("%value%", String.valueOf(var.isRainbow())));
        }
        return item;
    }

    @Override
    public List<ItemBuilder> getDefaultItems() {
        ItemBuilder item = new ItemBuilder(Material.REDSTONE_ORE);
        item.withName("&6Rainbow: &e%value%");
        return new ArrayList<>(Collections.singleton(item));
    }

    @Override
    public void onLeftClick() {
        if (entityPet instanceof IRainbow) {
            IRainbow pet = (IRainbow) entityPet;
            pet.setRainbow(!pet.isRainbow());
        }
    }
}