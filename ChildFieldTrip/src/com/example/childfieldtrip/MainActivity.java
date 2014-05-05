package com.example.childfieldtrip;



import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends Activity{

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  Button b1 = (Button) findViewById(R.id.button1);
  Button b2 = (Button) findViewById(R.id.button2);
  Button b3 = (Button) findViewById(R.id.button3);
  Button b4 = (Button) findViewById(R.id.button5);


  b1.setOnClickListener(animal);
  b2.setOnClickListener(spell);
  b3.setOnClickListener(exit);
  b4.setOnClickListener(def);
  

 }


@Override
public boolean onCreateOptionsMenu(Menu menu) {
 // Inflate the menu; this adds items to the action bar if it is present.
	 MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.birds, menu);
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
View.OnClickListener def = new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		  Intent x = new Intent(getApplicationContext(),Definitions.class);
		  startActivity(x);
	}
};


 View.OnClickListener exit = new View.OnClickListener() {
	
	 public void onClick(View arg0) {
		 finish();//try activityname.finish instead of this
		 Intent intent = new Intent(Intent.ACTION_MAIN);
		 intent.addCategory(Intent.CATEGORY_HOME);
		 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		 startActivity(intent);
		 }
};



}
