package net.oOLUCOo.projectunknown.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oOLUCOo.projectunknown.ProjectUnknown;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectUnknown.MODID);

    public static final DeferredItem<Item> Test_Item = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
