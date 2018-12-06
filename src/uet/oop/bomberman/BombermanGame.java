package uet.oop.bomberman;

import uet.oop.bomberman.gui.Frame;

import java.io.File;

public class BombermanGame {
	
	public static void main(String[] args) {
		//music
		String path = new File("").getAbsolutePath() + "\\res\\sound\\boomnen.wav";
		Sound soundBase = new Sound(path);
		soundBase.play(-1); //vòng lặp

		new Frame();

	}
}
