package com.example.childfieldtrip;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
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
 
 public void exit(View arg0) {
	 System.exit(0);
	 }
}
