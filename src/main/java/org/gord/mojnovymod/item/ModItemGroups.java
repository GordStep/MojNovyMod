package org.gord.mojnovymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.gord.mojnovymod.MojNovyMod;

public class ModItemGroups {
    public static final ItemGroup NEW_GROUP = FabricItemGroup.builder(new Identifier(MojNovyMod.MOD_ID, "new_group")).icon(() -> new ItemStack(ModItems.NEW_ITEM)).build();
    public static final ItemGroup ANOTHER_GROUP = FabricItemGroup.builder(new Identifier(MojNovyMod.MOD_ID, "another_group")).icon(() -> new ItemStack(ModItems.ANOTHER_ITEM)).build();

}
