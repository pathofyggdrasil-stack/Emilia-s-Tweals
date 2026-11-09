/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.emiliadev.uwu.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.emiliadev.uwu.EmiliastweaksMod;

public class EmiliastweaksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmiliastweaksMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EMILIASTAB = REGISTRY.register("emiliastab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.emiliastweaks.emiliastab")).icon(() -> new ItemStack(EmiliastweaksModItems.BIG_POOITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EmiliastweaksModItems.BIG_POOITEM.get());
			}).build());
}