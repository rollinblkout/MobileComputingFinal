package com.example.childfieldtrip;




import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


@SuppressLint("DefaultLocale")
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
 
 public void search(View arg0) throws IOException{
	 

	 String animal = ((EditText)findViewById(R.id.editText1)).getText().toString().toLowerCase();
	 String animal2 = ((EditText)findViewById(R.id.editText1)).getText().toString();
	 Scanner s = new Scanner(getAssets().open("animalsearch.txt"));
	 List<String> list = new ArrayList<String>();


	 String t = null;
	 while(s.hasNextLine())
		{
		 t = s.nextLine().toLowerCase();
			list.add(t);


		}
		s.close();
		if (list.contains(animal))
		{
			Toast.makeText(getApplicationContext(),"SUCCESS! " + animal2 + " is in the database!", Toast.LENGTH_SHORT).show();
			//Intent i = new Inten(getApplicationContext(),animal.class);
			//startActivity(i);
		}
		else
		{
			Toast.makeText(getApplicationContext(),"Oops! " + animal2 + " is not in the database!", Toast.LENGTH_SHORT).show();
		}
	}
 
 public void goToDomesticScreen(View arg0) {
  Intent i = new Intent(getApplicationContext(),Domestic.class);
  startActivity(i);
 }
 public void goToWildAnimalScreen(View arg0) {
	
	  Intent i = new Intent(getApplicationContext(),WildAnimals.class);
	  startActivity(i);
	 }
}