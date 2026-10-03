
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.weiplus.hotelzero.init;

import net.weiplus.hotelzero.HotelZeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HotelZeroModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HotelZeroMod.MODID);
	public static final RegistryObject<CreativeModeTab> HOTEL_ZERO = REGISTRY.register("hotel_zero",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hotel_zero.hotel_zero")).icon(() -> new ItemStack(HotelZeroModBlocks.TILE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HotelZeroModBlocks.TILE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(HotelZeroModBlocks.TILE.get().asItem());
		}
	}
}
