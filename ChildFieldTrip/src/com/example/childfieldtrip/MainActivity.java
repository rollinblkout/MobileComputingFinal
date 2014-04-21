package com.example.childfieldtrip;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  Button b1 = (Button) findViewById(R.id.button1);
  Button b2 = (Button) findViewById(R.id.button2);
  Button b3 = (Button) findViewById(R.id.button3);
  Drawable a = findViewById(R.id.button1).getBackground();
  Drawable b = findViewById(R.id.button2).getBackground();
  Drawable c = findViewById(R.id.button3).getBackground();
  Drawable d = findViewById(R.id.button4).getBackground();
  Drawable e = findViewById(R.id.button5).getBackground();
  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  c.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  d.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  e.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  b1.setOnClickListener(animal);
  b2.setOnClickListener(spell);
  b3.setOnClickListener(exit);
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
 }
 
 View.OnClickListener animal = new View.OnClickListener() {
 public void onClick(View arg0) {
  Intent i = new Intent(getApplicationContext(),AnimalTitle.class);
  startActivity(i);
 }
 };

 View.OnClickListener spell = new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		  Intent x = new Intent(getApplicationContext(),GuessImage.class);
		  startActivity(x);
	}
};

 View.OnClickListener exit = new View.OnClickListener() {
	
	 public void onClick(View arg0) {
		 System.exit(0);
		 }
};



}
