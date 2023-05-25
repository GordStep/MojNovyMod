package org.gord.mojnovymod.item.material.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class NewArmorMaterial implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    public static final int[] PROTECTION_VALUES = new int[] {1, 2, 2, 1};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 3;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.BLOCK_WOOD_BREAK;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OAK_LOG);
    }

    @Override
    public String getName() {
        return "new_armor";
    }

    @Override
    public float getToughness() {
        return 2.0f;//x.0f
    }

    @Override
    public float getKnockbackResistance() {
        return 0.4f;//0.xf
    }
}
