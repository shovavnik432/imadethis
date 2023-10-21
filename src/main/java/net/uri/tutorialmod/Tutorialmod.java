package net.uri.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.uri.tutorialmod.block.ModBlocks;
import net.uri.tutorialmod.item.ModItemGroups;
import net.uri.tutorialmod.item.moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		moditems.registermoditems();

		ModBlocks.registerModBlocks();

		LOGGER.info("Hello Fabric world!");
	}
}