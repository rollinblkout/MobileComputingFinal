package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;

public class WildAnimals extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wild_animals);
		
		  Drawable a = findViewById(R.id.button1).getBackground();
		  Drawable b = findViewById(R.id.button2).getBackground();
		  Drawable c = findViewById(R.id.button3).getBackground();
		  Drawable d = findViewById(R.id.button4).getBackground();
		  Drawable e = findViewById(R.id.button5).getBackground();
		  Drawable f = findViewById(R.id.button6).getBackground();
		  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  c.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  d.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  e.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  f.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wild_animals, menu);
		return true;
	}
	 
	 public void goToCanines(View arg0) {
	  Intent i = new Intent(getApplicationContext(),Canines.class);
	  startActivity(i);
	 }
	 
	 public void goToFelines(View arg0) {
	  Intent i = new Intent(getApplicationContext(),Felines.class);
	  startActivity(i);
	 }
	 
	 public void goToWildReptiles(View arg0) {
	  Intent i = new Intent(getApplicationContext(),WildReptiles.class);
	  startActivity(i);
	 }

	 public void goToWildRodents(View arg0) {
	  Intent i = new Intent(getApplicationContext(),WildRodents.class);
	  startActivity(i);
	 }
	 
	 public void goToOtherMammals(View arg0) {
	  Intent i = new Intent(getApplicationContext(),OtherMammals.class);
	  startActivity(i);
	 }
	 
	 public void goToWildBirds(View arg0) {
	  Intent i = new Intent(getApplicationContext(),WildBirds.class);
	  startActivity(i);
	 }
	}


