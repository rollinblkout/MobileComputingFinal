package com.example.childfieldtrip;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Aquatic extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aquatic);
		  Drawable a = findViewById(R.id.button1).getBackground();
		  Drawable b = findViewById(R.id.button2).getBackground();
		  Drawable c = findViewById(R.id.button3).getBackground();
		  Button b1 = (Button) findViewById(R.id.button1);
		  Button b2 = (Button) findViewById(R.id.button2);
		  Button b3 = (Button) findViewById(R.id.button3);
		  
		  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  c.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b1.setOnClickListener(fresh);
		  b2.setOnClickListener(sea);
		  b3.setOnClickListener(amp);
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
	 
	 View.OnClickListener fresh = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),FreshWater.class);
			  startActivity(i);
			 }
	};
	
	 View.OnClickListener sea = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),SeaWater.class);
			  startActivity(i);
			 }
			 
	};

	View.OnClickListener amp = new View.OnClickListener() {
		
		@Override
		 public void onClick(View arg0) {
			  Intent i = new Intent(getApplicationContext(),Amphibian.class);
			  startActivity(i);
			 }

	};
}
