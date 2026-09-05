package net.oOLUCOo.projectunknown.Items;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oOLUCOo.projectunknown.Items.custom.ModArmorItem;
import net.oOLUCOo.projectunknown.ProjectUnknown;
import net.oOLUCOo.projectunknown.blocks.ModBlocks;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectUnknown.MODID);


    public static final DeferredItem<BlockItem> BLOCK_OF_OSMIUM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BLOCK_OF_OSMIUM);
    public static final DeferredItem<BlockItem> RAW_OSMIUM_ORE_BLOCK =
            ITEMS.registerSimpleBlockItem(ModBlocks.RAW_OSMIUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_OSMIUM_ORE =
            ITEMS.registerSimpleBlockItem(ModBlocks.DEEPSLATE_OSMIUM_ORE);




    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> OSMIUM_SWORD = ITEMS.register("osmium_sword",
            () -> new SwordItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OSMIUM, 5, -2.8f))));

    public static final DeferredItem<PickaxeItem> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.OSMIUM, 3.0F, -2.8f))));

    public static final DeferredItem<AxeItem> OSMIUM_AXE = ITEMS.register("osmium_axe",
            () -> new AxeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.OSMIUM, 6.0F, -2.8f))));

    public static final DeferredItem<ShovelItem> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel",
            () -> new ShovelItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.OSMIUM, 2.0F, -2.8f))));

    public static final DeferredItem<HoeItem> OSMIUM_HOE = ITEMS.register("osmium_hoe",
            () -> new HoeItem(ModToolTiers.OSMIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.OSMIUM, 0F, -2.8f))));


    public static final DeferredItem<ArmorItem> OSMIUM_HELMET = ITEMS.register("osmium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.OSMIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));

    public static final DeferredItem<ArmorItem> OSMIUM_CHESTPLATE = ITEMS.register("osmium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OSMIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));

    public static final DeferredItem<ArmorItem> OSMIUM_PANTS = ITEMS.register("osmium_pants",
            () -> new ArmorItem(ModArmorMaterials.OSMIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));

    public static final DeferredItem<ArmorItem> OSMIUM_BOOTS = ITEMS.register("osmium_boots",
            () -> new ArmorItem(ModArmorMaterials.OSMIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static final DeferredItem<BowItem> OSMIUM_BOW = ITEMS.register("osmium_bow",
            () -> new BowItem(new Item.Properties().durability(500)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}