package com.ccubes.biomebonanza.item;

import com.ccubes.biomebonanza.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.ccubes.biomebonanza.BiomeBonanza;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
  public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
  public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
  public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
  public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));

  private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    entries.add(JADE);
    entries.add(ROSE_GOLD_INGOT);
    entries.add(COPPER_NUGGET);
    entries.add(NETHERITE_NUGGET);
  }
  private static void addItemsToBuilingBlocksItemGroup(FabricItemGroupEntries entries) {
    entries.add(ModBlocks.RAW_JADE);
  }
  
private static Item registerItem(String name, Item item) {
  return Registry.register(Registries.ITEM, new Identifier(BiomeBonanza.MOD_ID, name), item);
}
  
  public static void registerModItems() {
    BiomeBonanza.LOGGER.info("Registering a bonanza of mod items! (" + BiomeBonanza.MOD_ID + ")");

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuilingBlocksItemGroup);
  }
}
