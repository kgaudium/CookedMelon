package kgaudium.cookedmelon;

import kgaudium.cookedmelon.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookedMelon implements ModInitializer{
    public static final String MOD_ID = "cookedmelon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
