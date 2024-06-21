package kgaudium.cookedmelon.datagen;

import kgaudium.cookedmelon.interfaces.IRecipeGenerator;
import kgaudium.cookedmelon.recipes.CookedMelonSliceRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        useGenerator(exporter, new CookedMelonSliceRecipeGenerator());

    }

    private void useGenerator(RecipeExporter exporter, IRecipeGenerator recipeGenerator){
        recipeGenerator.GenerateRecipe(exporter);
    }
}
