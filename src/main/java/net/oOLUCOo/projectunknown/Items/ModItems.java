package net.oOLUCOo.projectunknown.Items;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oOLUCOo.projectunknown.ProjectUnknown;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectUnknown.MODID);

    public static final DeferredItem<Item> RAW_OSMIUM_ORE = ITEMS.register("raw_osmium_ore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties()));




    public static final  DeferredItem<SwordItem> OSMIUM_SWORD = ITEMS.register("osmium_sword",
            () -> new SwordItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OSMIUM, 5, -2.8f))));

    public static final  DeferredItem<PickaxeItem> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.OSMIUM, 3.0F, -2.8f))));

    public static final  DeferredItem<AxeItem> OSMIUM_AXE = ITEMS.register("osmium_axe",
            () -> new AxeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.OSMIUM, 6.0F, -2.8f))));

    public static final  DeferredItem<ShovelItem> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel",
            () -> new ShovelItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.OSMIUM, 2.0F, -2.8f))));

    public static final  DeferredItem<HoeItem> OSMIUM_HOE = ITEMS.register("osmium_hoe",
            () -> new HoeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.OSMIUM, 0F, -2.8f))));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
