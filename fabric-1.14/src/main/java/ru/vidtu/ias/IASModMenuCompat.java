package ru.vidtu.ias;

import io.github.prospector.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screens.Screen;
import ru.vidtu.ias.gui.IASConfigScreen;

import java.util.function.Function;

public class IASModMenuCompat implements ModMenuApi {
	@Override
	public Function<Screen, ? extends Screen> getConfigScreenFactory() {
		return IASConfigScreen::new;
	}
	
	@Override
	public String getModId() {
		return "ias";
	}
}