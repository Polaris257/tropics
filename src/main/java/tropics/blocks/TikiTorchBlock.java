package tropics.blocks;

import java.util.Random;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TikiTorchBlock extends Block {
    public static final VoxelShape BOUNDING_SHAPE = Block.createCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 32.0D, 9.0D);

    public TikiTorchBlock() {
        super(AbstractBlock.Settings.of(Material.SUPPORTED).noCollision().breakInstantly().luminance((state) -> {
            return 20;
        }).sounds(BlockSoundGroup.WOOD));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BOUNDING_SHAPE;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double x = (double) pos.getX() + 0.5;
        double y = (double) pos.getY() + 2.05;
        double z = (double) pos.getZ() + 0.5;
        world.addParticle(ParticleTypes.SMOKE, x, y, z, 0.0D, 0.0D, 0.0D);
        world.addParticle(ParticleTypes.FLAME, x, y, z, 0.0D, 0.0D, 0.0D);
    }
}
