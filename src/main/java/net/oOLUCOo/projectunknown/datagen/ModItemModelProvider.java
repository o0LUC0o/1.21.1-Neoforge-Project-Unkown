package net.oOLUCOo.projectunknown.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.ProjectUnknown;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectUnknown.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.RAW_OSMIUM_ORE_BLOCK.get());
        basicItem(ModItems.OSMIUM_INGOT.get());
        basicItem(ModItems.OSMIUM_HELMET.get());
        basicItem(ModItems.OSMIUM_CHESTPLATE.get());
        basicItem(ModItems.OSMIUM_PANTS.get());
        basicItem(ModItems.OSMIUM_BOOTS.get());


        handheldItem(ModItems.OSMIUM_SWORD.get());
        handheldItem(ModItems.OSMIUM_PICKAXE.get());
        handheldItem(ModItems.OSMIUM_AXE.get());
        handheldItem(ModItems.OSMIUM_SHOVEL.get());
        handheldItem(ModItems.OSMIUM_HOE.get());
    }


    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(ProjectUnknown.MODID, "item/" + item.getId().getPath()));
    }
}