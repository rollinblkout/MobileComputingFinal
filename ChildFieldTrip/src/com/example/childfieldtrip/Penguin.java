package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Penguin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_penguin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.penguin, menu);
		return true;
	}

}
