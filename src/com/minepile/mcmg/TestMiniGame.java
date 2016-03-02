package com.minepile.mcmg;

import org.bukkit.World;

import com.minepile.mpmgfw.core.MiniGame;

public class TestMiniGame extends MiniGame {

	public TestMiniGame() {
		dupeWorld();
	}
	
	@Override
	public String loadGameDescription() {
		String desc = "This is a test description!";
		return desc;
	}

	@Override
	public Integer loadGameTimeLength() {
		int time = 30;
		return time;
	}

	@Override
	public void loadKits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public World loadWorld() {
		// TODO Auto-generated method stub
		return getWorldDupe().getMiniGameWorld();
	}
	
	private void dupeWorld() {
		getWorldDupe().loadWorld("MapOITC01_backup");
	}

}
