package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Domestic extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_domestic);
  

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
