package com.example.childfieldtrip;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Aquatic extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aquatic);
		  Drawable a = findViewById(R.id.button1).getBackground();
		  Drawable b = findViewById(R.id.button2).getBackground();
		  Drawable c = findViewById(R.id.button3).getBackground();
		  Button b1 = (Button) findViewById(R.id.button1);
		  Button b2 = (Button) findViewById(R.id.button2);
		  Button b3 = (Button) findViewById(R.id.button3);
		  
		  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  c.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b1.setOnClickListener(fresh);
		  b2.setOnClickListener(sea);
		  b3.setOnClickListener(amp);
	 }

	 @Override
	 public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.domestic, menu);
	  return true;
	 }
	 
	 View.OnClickListener fresh = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),FreshWater.class);
			  startActivity(i);
			 }
	};
	
	 View.OnClickListener sea = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),SeaWater.class);
			  startActivity(i);
			 }
			 
	};

	View.OnClickListener amp = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),Amphibian.class);
			  startActivity(i);
			 }

	};
}
