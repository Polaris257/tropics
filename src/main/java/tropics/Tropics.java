package tropics;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Tropics implements ModInitializer {

    public static final ItemGroup TROPICS_GROUP;

    public static final Block BALSA_PLANKS = new Block(
            FabricBlockSettings.of(Material.WOOD).strength(1.0F, 1.5F).sounds(BlockSoundGroup.WOOD));
    public static final Identifier BALSA_PLANKS_ID = new Identifier("tropics", "balsa_planks");

    public static final Item MACHETE = new Machete();
        public static final Identifier MACHETE_ID = new Identifier("tropics", "machete");
    
    static {
        TROPICS_GROUP = FabricItemGroupBuilder.create(new Identifier("tropics", "main")).icon(() -> new ItemStack(BALSA_PLANKS)).appendItems(stacks -> {
            stacks.add(new ItemStack(MACHETE));
            stacks.add(new ItemStack(BALSA_PLANKS));
        }).build();
    }
    
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, BALSA_PLANKS_ID, BALSA_PLANKS);
        Registry.register(Registry.ITEM, BALSA_PLANKS_ID, new BlockItem(BALSA_PLANKS, new FabricItemSettings()));

        Registry.register(Registry.ITEM, MACHETE_ID, MACHETE);
    }
}
