package tropics;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MacheteToolMaterial implements ToolMaterial {

    public static final MacheteToolMaterial INSTANCE;

    static {
        INSTANCE = new MacheteToolMaterial();
    }

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
