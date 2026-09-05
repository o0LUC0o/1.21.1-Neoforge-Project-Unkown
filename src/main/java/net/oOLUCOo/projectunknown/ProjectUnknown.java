package net.oOLUCOo.projectunknown;

import net.minecraft.world.level.block.SoundType;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.oOLUCOo.projectunknown.Items.ModCreativeModeTabs;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.blocks.ModBlocks;
import net.oOLUCOo.projectunknown.util.ModItemProperties;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.oOLUCOo.projectunknown.Items.ModItems.ITEMS;



        @Mod(ProjectUnknown.MODID)
        public class ProjectUnknown {
            public static final String MODID = "projectunknown";
            public static final Logger LOGGER = LogUtils.getLogger();

            public ProjectUnknown(IEventBus modEventBus, ModContainer modContainer) {
                modEventBus.addListener(this::commonSetup);

                ModCreativeModeTabs.register(modEventBus);
                ModItems.register(modEventBus);
                ModBlocks.register(modEventBus);

                modEventBus.addListener(this::addCreative);

                // Client-Setup direkt am EventBus registrieren:
                modEventBus.addListener(this::onClientSetup);

                modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
            }

            private void commonSetup(FMLCommonSetupEvent event) {

            }

            private void onClientSetup(FMLClientSetupEvent event) {
                event.enqueueWork(() -> {
                    ModItemProperties.addCustomItemProperties();
                });
            }

            private void addCreative(BuildCreativeModeTabContentsEvent event) {

            }
        }