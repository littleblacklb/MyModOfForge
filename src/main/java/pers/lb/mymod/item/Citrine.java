package pers.lb.mymod.item;

import net.minecraft.world.item.Item;
import pers.lb.mymod.tab.ModTab;

public class Citrine extends Item {
    public Citrine() {
        super(new Item.Properties().tab(ModTab.CITRINE_TAB));
    }
}
