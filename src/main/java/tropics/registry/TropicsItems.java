package tropics.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tropics.tools.Machete;

public class TropicsItems {
    public static final Item MACHETE = new Machete();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("tropics", "machete"), MACHETE);
    }

}
