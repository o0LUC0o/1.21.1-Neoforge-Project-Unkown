package net.oOLUCOo.projectunknown.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.oOLUCOo.projectunknown.ProjectUnknown;
import net.oOLUCOo.projectunknown.blocks.ModBlocks;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectUnknown.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLOCK_OF_OSMIUM);
        blockWithItem(ModBlocks.RAW_OSMIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_OSMIUM_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {

        ModelFile blockModel = cubeAll(deferredBlock.get());
        simpleBlock(deferredBlock.get(), blockModel);


        simpleBlockItem(deferredBlock.get(), blockModel);
    }
}