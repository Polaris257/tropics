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
import tropics.registry.TropicsBlocks;
import tropics.registry.TropicsItems;

import static tropics.registry.TropicsBlocks.BALSA_PLANKS;
import static tropics.registry.TropicsItems.MACHETE;

public class Tropics implements ModInitializer {

  public static final String MODID = "tropics";
    
    @Override
    public void onInitialize() {
        TropicsBlocks.registerBlocks();
        TropicsItems.registerItems();

    }
}
