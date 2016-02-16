package com.zbardwell.madhos.handlers;

import com.badlogic.gdx.InputAdapter;

public class MyInputProcessor extends InputAdapter {

	public boolean keyDown(int k) {
		if(k == Keys.Z){
			MyInput.setKey(MyInput.BUTTON1, true);
			
		}
		return true;
	}
	public boolean keyUp(int k){
		return true;
	}
}
