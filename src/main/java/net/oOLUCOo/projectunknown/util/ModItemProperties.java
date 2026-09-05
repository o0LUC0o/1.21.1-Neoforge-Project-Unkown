package net.oOLUCOo.projectunknown.util;

import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.oOLUCOo.projectunknown.Items.ModItems;

public class ModItemProperties {

    public static void addCustomItemProperties() {
        makeCustomBow(ModItems.OSMIUM_BOW.get());
    }

    private static void makeCustomBow(Item item) {

        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (stack, level, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            }
            return entity.getUseItem() != stack ? 0.0F : (float) (stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0F;
        });


        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (stack, level, entity, seed) ->
                entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F
        );
    }
}