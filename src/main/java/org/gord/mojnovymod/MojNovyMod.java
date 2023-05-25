package org.gord.mojnovymod;

import net.fabricmc.api.ModInitializer;
import org.gord.mojnovymod.block.ModBlocks;
import org.gord.mojnovymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MojNovyMod implements ModInitializer {
	public static final String MOD_ID = "mojnovymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	}
}
