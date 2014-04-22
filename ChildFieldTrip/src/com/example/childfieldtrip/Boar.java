package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Boar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_boar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.boar, menu);
		return true;
	}

}
