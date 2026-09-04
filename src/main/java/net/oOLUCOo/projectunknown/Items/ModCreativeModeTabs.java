package net.oOLUCOo.projectunknown.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.oOLUCOo.projectunknown.ProjectUnknown;
import net.oOLUCOo.projectunknown.blocks.ModBlocks;

import java.awt.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectUnknown.MODID);

    public static final Supplier<CreativeModeTab> PROJECT_UNKNOWN_TAB = CREATIVE_MODE_TAB.register("projectunknown_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DEEPSLATE_OSMIUM_ORE_ITEM.get()))
                    .title(Component.translatable("creativetab.projectunknown.projectunknown_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_OSMIUM_ORE);
                        output.accept(ModItems.OSMIUM_INGOT);
                        output.accept(ModBlocks.DEEPSLATE_OSMIUM_ORE);
                        output.accept(ModBlocks.RAW_OSMIUM_ORE);
                        output.accept(ModBlocks.BLOCK_OF_OSMIUM);
                        output.accept(ModItems.OSMIUM_SWORD);
                        output.accept(ModItems.OSMIUM_PICKAXE);
                        output.accept(ModItems.OSMIUM_AXE);
                        output.accept(ModItems.OSMIUM_SHOVEL);
                        output.accept(ModItems.OSMIUM_HOE);
                    })


                    .build());

    //.withTabsBefore(ResourceLocation.fromNamespaceAndPath(ProjectUnknown.MODID, "project_unknkown_tab" )) for a next tab i need to put that in there

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
