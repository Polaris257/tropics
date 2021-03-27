package tropics.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static tropics.Tropics.MODID;


public class TropicsBlocks
{
    public static final Block BALSA_PLANKS = new Block(
            FabricBlockSettings.of(Material.WOOD).strength(1.0F, 1.5F).sounds(BlockSoundGroup.WOOD));

    public static final Identifier BALSA_PLANKS_ID = new Identifier("tropics", "balsa_planks");

    public static void registerBlocks()
    {
        Registry.register(Registry.ITEM, BALSA_PLANKS_ID, new BlockItem(BALSA_PLANKS, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "basla_planks"), BALSA_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "basla_planks"), new BlockItem(BALSA_PLANKS, new FabricItemSettings()));
    }

}
