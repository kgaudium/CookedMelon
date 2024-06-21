package kgaudium.cookedmelon.recipes;

import kgaudium.cookedmelon.interfaces.IRecipeGenerator;
import kgaudium.cookedmelon.item.ModItems;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.text.Text;

import java.util.List;

import static net.minecraft.data.server.recipe.RecipeProvider.conditionsFromItem;
import static net.minecraft.data.server.recipe.RecipeProvider.hasItem;

public class CookedMelonSliceRecipeGenerator implements IRecipeGenerator {
    public static final ItemConvertible SMELTABLE_TO_COOKED_MELON_SLICE = Items.MELON_SLICE;

    public void GenerateRecipe(RecipeExporter exporter) {
        String cookedFromName = SMELTABLE_TO_COOKED_MELON_SLICE.asItem().getName().getString().toLowerCase().replace(' ', '_');

        RecipeProvider.offerFoodCookingRecipe(exporter, "smelting_" + cookedFromName, RecipeSerializer.SMELTING, SmeltingRecipe::new,
                140, SMELTABLE_TO_COOKED_MELON_SLICE, ModItems.COOKED_MELON_SLICE, 0.1f);

        RecipeProvider.offerFoodCookingRecipe(exporter, "smoking_" + cookedFromName, RecipeSerializer.SMOKING, SmokingRecipe::new,
                70, SMELTABLE_TO_COOKED_MELON_SLICE, ModItems.COOKED_MELON_SLICE, 0.1f);

        RecipeProvider.offerFoodCookingRecipe(exporter, "campfire_cooking_" + cookedFromName, RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                200, SMELTABLE_TO_COOKED_MELON_SLICE, ModItems.COOKED_MELON_SLICE, 0.1f);
    }
}
