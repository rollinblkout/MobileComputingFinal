package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AnimalTitle extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_animal_title);
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.animal_title, menu);
  return true;
 }
 
 public void search(View arg0){
	 
	 EditText message = (EditText)findViewById(R.id.editText1);
		String animal = message.getText().toString();
		
		if (animal.equalsIgnoreCase("dog"))
		{
			 Intent i = new Intent(getApplicationContext(),Dog.class);
			  startActivity(i);
		}else {
		
		if (animal.equalsIgnoreCase("cat"))
		{
			 Intent i = new Intent(getApplicationContext(),Cat.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("rabbit"))
		{
			 Intent i = new Intent(getApplicationContext(),Rabbit.class);
			  startActivity(i);
		} else
		
		if (animal.equalsIgnoreCase("horse"))
		{
			 Intent i = new Intent(getApplicationContext(),Horse.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("cow"))
		{
			 Intent i = new Intent(getApplicationContext(),Cow.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("parrot"))
		{
			 Intent i = new Intent(getApplicationContext(),Parrot.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("turtle"))
		{
			 Intent i = new Intent(getApplicationContext(),Turtle.class);
			  startActivity(i);
		} else {
			Toast.makeText(getApplicationContext(),"Oops! " + animal + " is not in the database!", Toast.LENGTH_SHORT).show();
		}
		}
		}
		}
		}
		}
		}
 
 public void goToDomesticScreen(View arg0) {
  Intent i = new Intent(getApplicationContext(),Domestic.class);
  startActivity(i);
 }
}