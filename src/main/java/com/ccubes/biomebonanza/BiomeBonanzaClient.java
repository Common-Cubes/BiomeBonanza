package com.ccubes.biomebonanza;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class BiomeBonanzaClient implements ClientModInitializer {
  public static final String MOD_ID = "biomebonanza";
  public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
  @Override
  public void onInitializeClient() {
    LOGGER.info("A Bonanza of Biomes are Ready to Explore!");

  }
}
