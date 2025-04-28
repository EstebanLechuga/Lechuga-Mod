package net.esteban.lechugamod;

import net.esteban.lechugamod.block.ModBlocks;
import net.esteban.lechugamod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LechugaMod implements ModInitializer {

	public static final String MOD_ID = "lechugamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//---registers---//
		ModItems.register();
		ModBlocks.register();

	}
}