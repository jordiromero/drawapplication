package com.iesebre.drawapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SingleTouchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SingleTouchEventView(this, null));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.single_touch, menu);
		return true;
	}

}
