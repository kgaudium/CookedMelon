package kgaudium.cookedmelon;

import kgaudium.cookedmelon.datagen.ModModelProvider;
import kgaudium.cookedmelon.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.data.DataProvider;

public class CookedMelonDataGenerator implements DataGeneratorEntrypoint {
    /**
     * Register {@link DataProvider} with the {@link FabricDataGenerator} during this entrypoint.
     */
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}
