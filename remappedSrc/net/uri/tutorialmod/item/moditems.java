package net.uri.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.uri.tutorialmod.Tutorialmod;

public class moditems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new Item(new FabricItemSettings()));
    public static final Item RUBY_BLOCK = registerItem("ruby_block", new Item(new  FabricItemSettings()));

    private static void addItemsToIngridentItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RUBY_SWORD);

    }
    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tutorialmod.MOD_ID, name), item);
    }
    public static void registermoditems() {
        Tutorialmod.LOGGER.info("registering mod items for " + Tutorialmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(moditems::addItemsToIngridentItemGroup);
    }
}
