package tropics.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static tropics.Tropics.MODID;


public class TropicsBlocks
{
    public static final Block BALSA_PLANKS = new Block(
            FabricBlockSettings.of(Material.WOOD).strength(1.0F, 1.5F).sounds(BlockSoundGroup.WOOD));

    public static final Block TIKI_TORCH = new Block(AbstractBlock.Settings.copy(Blocks.SAND));

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "balsa_planks"), BALSA_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "balsa_planks"), new BlockItem(BALSA_PLANKS, new FabricItemSettings()));

        Registry.register(Registry.BLOCK, new Identifier(MODID, "tiki_torch"), TIKI_TORCH);
        Registry.register(Registry.ITEM, new Identifier(MODID, "tiki_torch"), new BlockItem(TIKI_TORCH, new FabricItemSettings()));
    }

}
