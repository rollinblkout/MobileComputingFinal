package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Cow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cow);
	}
	public void goToCamera(View arg0) {
		Intent i = new Intent(getApplicationContext(),CameraActivity.class);
		startActivity(i);
	}


}
