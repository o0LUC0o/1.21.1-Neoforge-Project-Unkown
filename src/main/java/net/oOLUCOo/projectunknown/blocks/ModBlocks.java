package net.oOLUCOo.projectunknown.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.ProjectUnknown;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ProjectUnknown.MODID);


    public static final DeferredBlock<Block> DEEPSLATE_OSMIUM_ORE =
            BLOCKS.register("deepslate_osmium_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));


    public static final DeferredItem<BlockItem> DEEPSLATE_OSMIUM_ORE_ITEM =
            ModItems.ITEMS.register("deepslate_osmium_ore_item", () -> new BlockItem(DEEPSLATE_OSMIUM_ORE.get(), new Item.Properties()));


    public static final DeferredBlock<Block> BLOCK_OF_OSMIUM =
            BLOCKS.register("block_of_osmium", () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.ANVIL)));


    public static final DeferredItem<BlockItem> BLOCK_OF_OSMIUM_ITEM =
            ModItems.ITEMS.register("block_of_osmium_item", () -> new BlockItem(BLOCK_OF_OSMIUM.get(), new Item.Properties()));


    public static final DeferredBlock<Block> RAW_OSMIUM_ORE =
            BLOCKS.register("raw_osmium_ore", () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)));


    public static final DeferredItem<BlockItem> RAW_OSMIUM_ORE_ITEM =
            ModItems.ITEMS.register("raw_osmium_ore_item", () -> new BlockItem(RAW_OSMIUM_ORE.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
