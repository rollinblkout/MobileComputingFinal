package com.example.childfieldtrip;




import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


@SuppressLint("DefaultLocale")
public class AnimalTitle extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_animal_title);
  Drawable a = findViewById(R.id.button1).getBackground();
  Drawable b = findViewById(R.id.button2).getBackground();
  Drawable c = findViewById(R.id.button3).getBackground();
  Drawable d = findViewById(R.id.button4).getBackground();
 Button b1 = (Button) findViewById(R.id.button1);
 Button b2 = (Button) findViewById(R.id.button2);
 Button b3 = (Button) findViewById(R.id.button3);
  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  c.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  d.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
  b1.setOnClickListener(domestic);
  b2.setOnClickListener(wild);
  b3.setOnClickListener(aquatic);

  
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.animal_title, menu);
  return true;
 }
 
 public void search(View arg0) throws IOException, ClassNotFoundException{
	 

	 String animal = ((EditText)findViewById(R.id.editText1)).getText().toString().toLowerCase();
	 String animal2 = ((EditText)findViewById(R.id.editText1)).getText().toString();
	 animal = animal.replaceAll(" ", "");
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
			
			String output = Character.toUpperCase(animal.charAt(0)) + animal.substring(1);
			
			
			if ( output.equals("Cornsnake"))
			{
				Toast.makeText(getApplicationContext(),"SUCCESS! " + output + " is in the database!", Toast.LENGTH_SHORT).show();
				Intent ti = new Intent(getApplicationContext(),CornSnake.class);
				startActivity(ti); 
			} 
			
			if (!(output.equals("Cornsnake"))){
			Toast.makeText(getApplicationContext(),"SUCCESS! " + output + " is in the database!", Toast.LENGTH_SHORT).show();
			
		Class<?> clazz = Class.forName("com.example.childfieldtrip."+output);

			Intent i = new Intent(getApplicationContext(),clazz);

		startActivity(i); 
			}
			
		}
		else
		{
			Toast.makeText(getApplicationContext(),"Oops! " + animal2 + " is not in the database!", Toast.LENGTH_SHORT).show();
		}
	}
 View.OnClickListener aquatic = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		
		  Intent i = new Intent(getApplicationContext(),Aquatic.class);
		  startActivity(i);
		 }
};

View.OnClickListener domestic = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		  Intent i = new Intent(getApplicationContext(),Domestic.class);
		  startActivity(i);
		 }
};

View.OnClickListener wild = new View.OnClickListener() {
	
	@Override
	 public void onClick(View arg0) {
		
		  Intent i = new Intent(getApplicationContext(),WildAnimals.class);
		  startActivity(i);
		 }
};

}