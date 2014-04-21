package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Domestic extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_domestic);
  
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
  Button b1 = (Button) findViewById(R.id.button1);
  Button b2 = (Button) findViewById(R.id.button2);
  Button b3 = (Button) findViewById(R.id.button3);
  Button b4 = (Button) findViewById(R.id.button4);
  Button b5 = (Button) findViewById(R.id.button5);
  Button b6 = (Button) findViewById(R.id.button6);
  b1.setOnClickListener(canines);
  b2.setOnClickListener(felines);
  b3.setOnClickListener(rep);
  b4.setOnClickListener(rod);
  b5.setOnClickListener(birds);
  b6.setOnClickListener(farm);
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.domestic, menu);
  return true;
 }
 
View.OnClickListener canines = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Dog.class);
		  startActivity(i);
		 }
};
 
View.OnClickListener felines = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Cat.class);
		  startActivity(i);
		 }
};


 
View.OnClickListener rep = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Reptiles.class);
		  startActivity(i);
		 }

};

View.OnClickListener rod = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Rodents.class);
		  startActivity(i);
		 }
};
 
View.OnClickListener farm = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),FarmAnimals.class);
		  startActivity(i);
		 }
};
 
View.OnClickListener birds = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Birds.class);
		  startActivity(i);
		 }
};
}
