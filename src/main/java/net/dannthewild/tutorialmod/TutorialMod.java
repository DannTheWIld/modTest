package net.dannthewild.tutorialmod;

import net.dannthewild.tutorialmod.block.ModBlocks;
import net.dannthewild.tutorialmod.item.ModItemGroups;
import net.dannthewild.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.regiserModItems();
		ModBlocks.registerModBlocks();

	}
}