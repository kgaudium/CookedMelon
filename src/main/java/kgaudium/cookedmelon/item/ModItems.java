package kgaudium.cookedmelon.item;

import kgaudium.cookedmelon.CookedMelon;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COOKED_MELON_SLICE = registerItem("cooked_melon_slice",
            new Item(new Item.Settings()
                    .food(ModFoodComponents.COOKED_MELON_SLICE)
                    .maxCount(64)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CookedMelon.MOD_ID, name), item);
    }

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(COOKED_MELON_SLICE);
    }

    public static void registerModItems(){
        CookedMelon.LOGGER.info("Register Mod Items for " + CookedMelon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
