package tropics.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static tropics.registry.TropicsBlocks.BALSA_PLANKS;
import static tropics.registry.TropicsItems.MACHETE;

public class TropicsGroup {
    public static final ItemGroup TROPICS_GROUP;
    static {
        TROPICS_GROUP = FabricItemGroupBuilder.create(new Identifier("tropics", "main"))
                .icon(() -> new ItemStack(BALSA_PLANKS)).appendItems(stacks -> {
                    stacks.add(new ItemStack(MACHETE));
                    stacks.add(new ItemStack(BALSA_PLANKS));
                }).build();
    }
}
