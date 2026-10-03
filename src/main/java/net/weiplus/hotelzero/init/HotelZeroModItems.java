
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.weiplus.hotelzero.init;

import net.weiplus.hotelzero.HotelZeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class HotelZeroModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HotelZeroMod.MODID);
	public static final RegistryObject<Item> TILE = block(HotelZeroModBlocks.TILE);
	public static final RegistryObject<Item> FLOOR = block(HotelZeroModBlocks.FLOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
