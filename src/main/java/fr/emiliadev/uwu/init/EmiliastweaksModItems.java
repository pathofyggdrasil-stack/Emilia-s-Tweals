package fr.emiliadev.uwu.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import fr.emiliadev.uwu.item.BigPooitemItem;
import fr.emiliadev.uwu.EmiliastweaksMod;

public class EmiliastweaksModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EmiliastweaksMod.MODID);
	public static final DeferredItem<Item> BIG_POOITEM;
	static {
		BIG_POOITEM = REGISTRY.register("big_pooitem", BigPooitemItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}
