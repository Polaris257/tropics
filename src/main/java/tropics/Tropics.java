package tropics;

import net.fabricmc.api.ModInitializer;
import tropics.registry.TropicsBlocks;
import tropics.registry.TropicsItems;

public class Tropics implements ModInitializer {

  public static final String MODID = "tropics";
    
    @Override
    public void onInitialize() {
        TropicsBlocks.registerBlocks();
        TropicsItems.registerItems();

    }
}
