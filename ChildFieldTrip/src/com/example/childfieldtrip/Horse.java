package com.example.childfieldtrip;

public class Horse extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_horse);
	}
	public void goToCamera(View arg0) {
		Intent i = new Intent(getApplicationContext(),CameraActivity.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.horse, menu);
		return true;
	}

}