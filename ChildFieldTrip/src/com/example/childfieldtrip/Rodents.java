package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Rodents extends Activity{
	
	ListView lvRodents;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rodents);
		
		lvRodents = (ListView) findViewById(R.id.lvRo);

		lvRodents.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Guinea Pig", "Ferret","Hamster","Mouse", "Rabbit","Rat"};
				if (items[position].equals("Rabbit")){
					
						Intent i = new Intent(getApplicationContext(),Rabbit.class);
						startActivity(i);
				}
				if (items[position].equals("Ferret")){
					
					Intent i = new Intent(getApplicationContext(),Ferret.class);
					startActivity(i);
			}
				
				if (items[position].equals("Mouse")){
					
					Intent i = new Intent(getApplicationContext(),Mouse.class);
					startActivity(i);
			}
				
				if (items[position].equals("Rat")){
					
					Intent i = new Intent(getApplicationContext(),Rat.class);
					startActivity(i);
			}
				
	if (items[position].equals("Guinea Pig")){
					
					Intent i = new Intent(getApplicationContext(),Guineapig.class);
					startActivity(i);
			}
	
	if (items[position].equals("Hamster")){
		
		Intent i = new Intent(getApplicationContext(),Hamster.class);
		startActivity(i);
}
					
			}
		});
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

}
