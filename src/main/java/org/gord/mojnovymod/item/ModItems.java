package org.gord.mojnovymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.gord.mojnovymod.MojNovyMod;
import org.gord.mojnovymod.item.custom.NewCustomItem;
import org.gord.mojnovymod.item.material.armor.NewArmorMaterial;

public class ModItems {

    public static final Item NEW_ITEM = registerItem(
            "new_item",
            new Item(new FabricItemSettings()),
            ModItemGroups.NEW_GROUP
    );
    public static final Item ANOTHER_ITEM = registerItem(
            "another_item",
            new Item(new FabricItemSettings()),
            ModItemGroups.ANOTHER_GROUP
    );
    public static final Item MAGIC_ITEM = registerItem(
            "magic_item",
            new NewCustomItem(new FabricItemSettings().maxDamage(64)),
            ModItemGroups.NEW_GROUP
    );
    public static final Item NEW_HELMET = registerItem(
            "new_helmet",
            new ArmorItem(new NewArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings()),
            ModItemGroups.NEW_GROUP
    );
    public static final Item NEW_CHESTPLATE = registerItem(
            "new_chestplate",
            new ArmorItem(new NewArmorMaterial(), ArmorItem.Type.CHESTPLATE, new FabricItemSettings()),
            ModItemGroups.NEW_GROUP
    );
    public static final Item NEW_LEGGINGS = registerItem(
            "new_leggings",
            new ArmorItem(new NewArmorMaterial(), ArmorItem.Type.LEGGINGS, new FabricItemSettings()),
            ModItemGroups.NEW_GROUP
    );
    public static final Item NEW_BOOTS = registerItem(
            "new_boots",
            new ArmorItem(new NewArmorMaterial(), ArmorItem.Type.BOOTS, new FabricItemSettings()),
            ModItemGroups.NEW_GROUP
    );

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MojNovyMod.MOD_ID, id), item);
    }
    public static Item registerItem(String id, Item item, ItemGroup itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(MojNovyMod.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        return returnItem;
    }

    public static void register() {
        MojNovyMod.LOGGER.debug("Registering items for: " + MojNovyMod.MOD_ID);
    }

}
