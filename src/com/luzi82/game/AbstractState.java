package com.luzi82.game;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract class AbstractState<P extends StateParent> implements StateParent {

	protected final P mParent;

	protected AbstractState(P parent) {
		mParent = parent;
	}

	public abstract void onTouchEvent(MotionEvent event);

	public abstract void onKeyDown(int keyCode, KeyEvent msg);

	public abstract void onKeyUp(int keyCode, KeyEvent msg);

	public abstract void onGameResume();

	public abstract void onGamePause();

	public abstract void onStateStart();

	public abstract void onStateEnd();

	public abstract void surfaceChanged(int format, int width, int height);

	public abstract void draw(Canvas c);

	public abstract void tick();

}
