package tropics.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tropics.tools.Machete;


public class TropicsItems
{
    public static final Item MACHETE = new Machete();

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier("tropics", "machete"), MACHETE);
    }

}
