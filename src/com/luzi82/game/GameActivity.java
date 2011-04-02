package com.luzi82.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public abstract class GameActivity extends Activity {

	GameView view;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(getLayoutId());

		view = (GameView) findViewById(getViewId());
	}

	protected abstract AbstractGame createGame();
	
	@Override
	protected void onResume() {
		super.onResume();
		view.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		view.onPause();
	}

	abstract protected int getLayoutId();

	abstract protected int getViewId();

	abstract public long getPeriodMs();

}
