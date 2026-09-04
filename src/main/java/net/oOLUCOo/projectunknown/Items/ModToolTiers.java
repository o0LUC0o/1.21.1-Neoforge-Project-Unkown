package net.oOLUCOo.projectunknown.Items;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.oOLUCOo.projectunknown.util.ModTags;

public class ModToolTiers {
    public static final Tier OSMIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_OSMIUM_TOOL,
            1400, 4f, 3f, 26, () -> Ingredient.of(ModItems.OSMIUM_INGOT));

}
