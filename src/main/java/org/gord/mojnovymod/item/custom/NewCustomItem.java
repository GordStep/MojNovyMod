package org.gord.mojnovymod.item.custom;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class NewCustomItem extends Item {
    public NewCustomItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient && hand == Hand.MAIN_HAND) { //Если сервер и используется правая рука, то
            entity.setCustomName(Text.literal("Dinnerbone"));
            stack.damage(1, user, e -> e.sendToolBreakStatus(hand));
        }
        return ActionResult.PASS;
    }

}
