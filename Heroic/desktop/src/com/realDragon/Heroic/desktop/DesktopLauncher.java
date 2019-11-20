package com.realDragon.Heroic.desktop;

import org.mini2Dx.desktop.DesktopMini2DxConfig;

import com.badlogic.gdx.backends.lwjgl.DesktopMini2DxGame;
import com.realDragon.Heroic.MyHeroic;

public class DesktopLauncher {
	public static void main (String[] arg) {
		DesktopMini2DxConfig config = new DesktopMini2DxConfig(MyHeroic.GAME_IDENTIFIER);
		config.vSyncEnabled = true;
		config.width = 1600;
		config.height = 900;
		new DesktopMini2DxGame(new MyHeroic(), config);
	}
}
