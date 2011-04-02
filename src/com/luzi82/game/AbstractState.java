package com.luzi82.game;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract class AbstractState {

	public abstract void onTouchEvent(MotionEvent event);

	public abstract void onKeyDown(int keyCode, KeyEvent msg);

	public abstract void onKeyUp(int keyCode, KeyEvent msg);

	public abstract void resume();

	public abstract void pause();

	public abstract void surfaceChanged(int format, int width, int height);

	public abstract void draw(Canvas c);

	public abstract void tick();

}
