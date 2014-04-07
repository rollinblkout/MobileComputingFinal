package com.example.childfieldtrip;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  
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
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.main, menu);
  return true;
 }
 public void goToAnimalScreen(View arg0) {
  Intent i = new Intent(getApplicationContext(),AnimalTitle.class);
  startActivity(i);
 }
 public void goToSpellGame(View arg0){
	  Intent x = new Intent(getApplicationContext(),GuessImage.class);
	  startActivity(x);
 }
 public void exit(View arg0) {
	 System.exit(0);
	 }
}
