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


    public static final DeferredBlock<Block> TEST_BLOCK =
            BLOCKS.register("test_block", () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3.0f)
                    .sound(SoundType.STONE)));


    public static final DeferredItem<BlockItem> TEST_BLOCK_ITEM =
            ModItems.ITEMS.register("test_block", () -> new BlockItem(TEST_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
