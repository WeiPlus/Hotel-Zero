
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.weiplus.hotelzero.init;

import net.weiplus.hotelzero.block.TileBlock;
import net.weiplus.hotelzero.HotelZeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class HotelZeroModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HotelZeroMod.MODID);
	public static final RegistryObject<Block> TILE = REGISTRY.register("tile", () -> new TileBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
