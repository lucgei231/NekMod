/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucas.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.lucas.client.gui.HelloScreen;

@EventBusSubscriber(Dist.CLIENT)
public class LucasModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(LucasModMenus.HELLO.get(), HelloScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}