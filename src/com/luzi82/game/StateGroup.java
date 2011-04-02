package com.luzi82.game;

import java.util.TreeMap;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract class StateGroup extends AbstractState {

	private TreeMap<String, AbstractState> mStateMap;

	private AbstractState mCurrentState;

	public void addState(String key, AbstractState state) {
		mStateMap.put(key, state);
	}

	public void removeState(String key) {
		mStateMap.remove(key);
	}

	public void setCurrentState(String key) {
		mCurrentState = mStateMap.get(key);
	}

	@Override
	public void draw(Canvas c) {
		if (mCurrentState != null) {
			mCurrentState.draw(c);
		}
	}

	@Override
	public void onKeyDown(int keyCode, KeyEvent msg) {
		if (mCurrentState != null) {
			mCurrentState.onKeyDown(keyCode, msg);
		}
	}

	@Override
	public void onKeyUp(int keyCode, KeyEvent msg) {
		if (mCurrentState != null) {
			mCurrentState.onKeyUp(keyCode, msg);
		}
	}

	@Override
	public void onTouchEvent(MotionEvent event) {
		if (mCurrentState != null) {
			mCurrentState.onTouchEvent(event);
		}
	}

	@Override
	public void pause() {
		if (mCurrentState != null) {
			mCurrentState.pause();
		}
	}

	@Override
	public void resume() {
		if (mCurrentState != null) {
			mCurrentState.resume();
		}
	}

	@Override
	public void surfaceChanged(int format, int width, int height) {
		if (mCurrentState != null) {
			mCurrentState.surfaceChanged(format, width, height);
		}
	}

	@Override
	public void tick() {
		if (mCurrentState != null) {
			mCurrentState.tick();
		}
	}

}
