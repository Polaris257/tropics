package tropics.registry;

import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tropics.tools.Machete;

import static tropics.Tropics.MODID;

public class TropicsItems {
    public static final Item MACHETE = new Machete();
    public static ToolItem FISHING_SPEAR = new SwordItem(ToolMaterials.IRON, 3, 90F, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "machete"), MACHETE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fishing_spear"), FISHING_SPEAR);
    }

}
