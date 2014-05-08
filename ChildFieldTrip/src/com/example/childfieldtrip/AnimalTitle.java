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
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.view.KeyEvent;


@SuppressLint("DefaultLocale")
public class AnimalTitle extends Activity {

 @SuppressLint("CutPasteId")
@Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_animal_title);

 Button b1 = (Button) findViewById(R.id.button1);
 Button b2 = (Button) findViewById(R.id.button2);
 Button b3 = (Button) findViewById(R.id.button3);

  b1.setOnClickListener(domestic);
  b2.setOnClickListener(wild);
  b3.setOnClickListener(aquatic);

  EditText view = (EditText)findViewById(R.id.editText1);
  view.setOnEditorActionListener(exampleListener);
  
  String[] list = {"Alligator","Baboon","Bear","Boar","Buffalo","Birds","Canines","Capybara","Cat","Chameleon","Cheetah", "Chicken", "ClownFish","Corn Snake", "Cow"
		  , "Coyote", "Crab","Crocodile","Deer","Dog","Dolphin","Duck","Eagle","Elephant","Felines","Ferret","Fox","Gazelle","Giraffe","Goldfish","Gorilla","Groundhog","Guineapig","Hamster","Hippo","Horse",
		  "Hyena","Iguana","Leopard","Lion","Lizard","Lobster","Meerkat","Monkey","Mouse","Ocelot","Octopus","Panther","Parakeet","Parrot", "Penguin","Pig","Rabbit","Rat","Rattlesnake","Reptiles","Rodents","Salmon","SeaTurtle","Seagull","Shark","Sheep",
		  "Skunk","Tiger","Toad","Turtle","Whale","Wolf","Zebra"};
  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_dropdown_item_1line, list);
  AutoCompleteTextView textView = (AutoCompleteTextView)
          findViewById(R.id.editText1);
  textView.setAdapter(adapter);
  textView.setThreshold(1);
  
 }


 
 public void search(View arg0) throws IOException, ClassNotFoundException{


	 String animal = ((EditText)findViewById(R.id.editText1)).getText().toString().toLowerCase();
	  AutoCompleteTextView editText = (AutoCompleteTextView)
	          findViewById(R.id.editText1);
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
				Toast.makeText(getApplicationContext(),"SUCCESS! " + output + " is in the app!", Toast.LENGTH_SHORT).show();
				Intent ti = new Intent(getApplicationContext(),CornSnake.class);
				startActivity(ti); 
			} 

			if (!(output.equals("Cornsnake"))){
				
				if (output.equals("Rattlesnake")){
					Toast.makeText(getApplicationContext(),"SUCCESS! " + output + " is in the app!", Toast.LENGTH_SHORT).show();
					Intent tii = new Intent(getApplicationContext(),Rattlesnamke.class);
					startActivity(tii); 
				}
				if (!(output.equals("Rattlesnake"))){
			Toast.makeText(getApplicationContext(),"SUCCESS! " + output + " is in the app!", Toast.LENGTH_SHORT).show();

		Class<?> clazz = Class.forName("com.example.childfieldtrip."+output);

			Intent i = new Intent(getApplicationContext(),clazz);
			editText.setText("");
		startActivity(i); 
				}
		
			}

		}
		else
		{
			Toast.makeText(getApplicationContext(),"Oops! " + animal2 + " is not in the app!", Toast.LENGTH_SHORT).show();
			editText.setText("");
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
TextView.OnEditorActionListener exampleListener = new TextView.OnEditorActionListener(){
	
	public boolean onEditorAction(TextView exampleView, int actionId, KeyEvent event) {
		   try {
			search(exampleView);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return true;
		}
}
;
@Override
public boolean onCreateOptionsMenu(Menu menu) {
 // Inflate the menu; this adds items to the action bar if it is present.
	 MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.animal_title, menu);
	    return super.onCreateOptionsMenu(menu);
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    // Handle presses on the action bar items
    switch (item.getItemId()) {
        case R.id.action_back:
        	finish();
            return true;
        case R.id.action_home:
        	Intent i = new Intent(getApplicationContext(),MainActivity.class);
  		  startActivity(i);
            return true;
        case R.id.action_spell:
        	Intent c = new Intent(getApplicationContext(),GuessImage.class);
  		  startActivity(c);
  		  return true;
        case R.id.action_domestic:
        	Intent d = new Intent(getApplicationContext(),Domestic.class);
  		  startActivity(d);
  		  return true;
        case R.id.action_aquatic:
        	Intent a = new Intent(getApplicationContext(),Aquatic.class);
  		  startActivity(a);
  		  return true;
        case R.id.action_wild:
        	Intent x = new Intent(getApplicationContext(),WildAnimals.class);
  		  startActivity(x);
  		  return true;
        default:
            return super.onOptionsItemSelected(item);
    }
}

}