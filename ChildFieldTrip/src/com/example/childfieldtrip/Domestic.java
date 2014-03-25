package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Domestic extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_domestic);
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.domestic, menu);
  return true;
 }
 
 public void goToDog(View arg0) {
  Intent i = new Intent(getApplicationContext(),Dog.class);
  startActivity(i);
 }
 
 public void goToCat(View arg0) {
  Intent i = new Intent(getApplicationContext(),Cat.class);
  startActivity(i);
 }
 
 public void goToReptiles(View arg0) {
  Intent i = new Intent(getApplicationContext(),Reptiles.class);
  startActivity(i);
 }

 public void goToRodents(View arg0) {
  Intent i = new Intent(getApplicationContext(),Rodents.class);
  startActivity(i);
 }
 
 public void goToFarmAnimals(View arg0) {
  Intent i = new Intent(getApplicationContext(),FarmAnimals.class);
  startActivity(i);
 }
 
 public void goToBirds(View arg0) {
  Intent i = new Intent(getApplicationContext(),Birds.class);
  startActivity(i);
 }
}
