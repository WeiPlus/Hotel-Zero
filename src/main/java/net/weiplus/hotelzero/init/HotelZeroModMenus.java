
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.weiplus.hotelzero.init;

import net.weiplus.hotelzero.HotelZeroMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class HotelZeroModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HotelZeroMod.MODID);
	public static final RegistryObject<MenuType<ElevatorGUIMenu>> ELEVATOR_GUI = REGISTRY.register("elevator_gui", () -> IForgeMenuType.create(ElevatorGUIMenu::new));
}
