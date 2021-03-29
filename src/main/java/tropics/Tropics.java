package tropics;

import static tropics.registry.TropicsBlocks.BALSA_PLANKS;
import static tropics.registry.TropicsBlocks.TIKI_TORCH;
import static tropics.registry.TropicsItems.MACHETE;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import tropics.registry.TropicsBlocks;
import tropics.registry.TropicsItems;

public class Tropics implements ModInitializer {

  public static final String MODID = "tropics";
    public static final ItemGroup TROPICS_GROUP;
    static {
        TROPICS_GROUP = FabricItemGroupBuilder.create(new Identifier("tropics", "main")).icon(() -> new ItemStack(BALSA_PLANKS)).appendItems(stacks -> {
            stacks.add(new ItemStack(MACHETE));
            stacks.add(new ItemStack(BALSA_PLANKS));
            stacks.add(new ItemStack(TIKI_TORCH));
        }).build();
    }
    @Override
    public void onInitialize() {
        TropicsBlocks.registerBlocks();
        TropicsItems.registerItems();

    }
}
