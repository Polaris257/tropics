package tropics;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Machete extends AxeItem {
    private static final Set<Material> effectiveMaterials;

    static {
        effectiveMaterials = Sets.newHashSet(Material.PLANT, Material.REPLACEABLE_PLANT, Material.BAMBOO, Material.BAMBOO_SAPLING, Material.LEAVES);
    }

    public Machete() {
        super(MacheteToolMaterial.INSTANCE, -1, -1.8F, new Item.Settings().group(ItemGroup.MISC));
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (effectiveMaterials.contains(state.getMaterial()))
            return 8f;
        else
            return 0.1f;
    }

    private static class MacheteToolMaterial implements ToolMaterial {
        public static final MacheteToolMaterial INSTANCE = new MacheteToolMaterial();

        @Override
        public int getDurability() {
            return 1002;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return 4;
        }

        @Override
        public float getAttackDamage() {
            return 5;
        }

        @Override
        public int getMiningLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.IRON_INGOT);
        }
    }
}
