package net.oOLUCOo.projectunknown.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.oOLUCOo.projectunknown.ProjectUnknown;



public class ModTags {




    public static class Blocks {

        public static final TagKey<Block> NEEDS_OSMIUM_TOOL = createTag("needs_osmium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OSMIUM_TOOL = createTag("incorrect_for_osmium_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ProjectUnknown.MODID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ProjectUnknown.MODID, name));
        }
    }
}
