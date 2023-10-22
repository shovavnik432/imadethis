package net.uri.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.uri.tutorialmod.Tutorialmod;
import net.uri.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Tutorialmod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(moditems.RUBY)).entries((displayContext, entries) ->{
                        entries.add(moditems.RUBY);

                        entries.add(moditems.RUBY_SWORD);

                        entries.add(ModBlocks.RUBY_BLOCK);


                    }).build());
    public static void registerItemGroups() {
        Tutorialmod.LOGGER.info("Registering Item Groups for " +Tutorialmod.MOD_ID);
    }
}
