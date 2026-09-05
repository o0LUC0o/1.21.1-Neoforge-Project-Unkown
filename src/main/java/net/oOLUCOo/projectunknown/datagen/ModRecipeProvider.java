package net.oOLUCOo.projectunknown.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.oOLUCOo.projectunknown.Items.ModItems;
import net.oOLUCOo.projectunknown.ProjectUnknown;
import net.oOLUCOo.projectunknown.blocks.ModBlocks;

import net.minecraft.world.item.crafting.*;



import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> OSMIUM_SMELTABLES = List.of(
                ModBlocks.RAW_OSMIUM_ORE.get(),
                ModBlocks.DEEPSLATE_OSMIUM_ORE.get()
        );

        // --- BLÖCKE & BARREN ---

        // Osmium Block aus 9x Ingots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_OSMIUM.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // 9x Ingots aus Osmium Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 9)
                .requires(ModBlocks.BLOCK_OF_OSMIUM.get())
                .unlockedBy("has_osmium_block", has(ModBlocks.BLOCK_OF_OSMIUM.get()))
                .save(recipeOutput);





        // --- WERKZEUGE (TOOLS) ---

        // Spitzhacke (Pickaxe)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OSMIUM_PICKAXE.get())
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Axt (Axe)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OSMIUM_AXE.get())
                .pattern("II")
                .pattern("IS")
                .pattern(" S")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Schaufel (Shovel)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OSMIUM_SHOVEL.get())
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Schwert (Sword)
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_SWORD.get())
                .pattern("I")
                .pattern("I")
                .pattern("S")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Hacke (Hoe)
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OSMIUM_HOE.get())
                .pattern("II")
                .pattern(" S")
                .pattern(" S")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // --- RÜSTUNG (ARMOR) ---

        // Helm (Helmet)
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_HELMET.get())
                .pattern("III")
                .pattern("I I")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Brustplatte (Chestplate)
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_CHESTPLATE.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Hose (Leggings)
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_PANTS.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // Schuhe (Boots)
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OSMIUM_BOOTS.get())
                .pattern("I I")
                .pattern("I I")
                .define('I', ModItems.OSMIUM_INGOT.get())
                .unlockedBy("has_osmium_ingot", has(ModItems.OSMIUM_INGOT.get()))
                .save(recipeOutput);

        // --- SCHMELZEN & SCHMELZOFEN ---
        oreSmelting(recipeOutput, OSMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.25f, 200, "osmium");
        oreBlasting(recipeOutput, OSMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.OSMIUM_INGOT.get(), 0.25f, 100, "osmium");
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ProjectUnknown.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}