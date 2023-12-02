package com.ccubes.biomebonanza;

import com.ccubes.biomebonanza.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeBonanza implements ModInitializer {
    public static final String MOD_ID = "biomebonanza";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("A Bonanza of Biomes are Ready to Explore! (And More!)");
		ModItems.registerModItems();

	}
}
