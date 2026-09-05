package net.oOLUCOo.projectunknown.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.ProjectUnknown;
import net.oOLUCOo.projectunknown.util.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ProjectUnknown.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.OSMIUM_INGOT.get())
                .add(ModItems.RAW_OSMIUM_ORE.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

        tag(ItemTags.SWORDS)
                .add(ModItems.OSMIUM_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.OSMIUM_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.OSMIUM_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.OSMIUM_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.OSMIUM_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OSMIUM_HELMET.get())
                .add(ModItems.OSMIUM_CHESTPLATE.get())
                .add(ModItems.OSMIUM_PANTS.get())
                .add(ModItems.OSMIUM_BOOTS.get());


    }
}
