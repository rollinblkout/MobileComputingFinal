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

public class Felines extends Activity {

	ListView Felines;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_felines);
		
		Felines = (ListView) findViewById(R.id.lvF);

		Felines.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Cheetah","Leopard","Lion","Ocelot","Panther","Tiger"};
				if (items[position].equals("Cheetah")){
					
						Intent i = new Intent(getApplicationContext(),Cheetah.class);
						startActivity(i);
				}
				if (items[position].equals("Lion")){
					
					Intent i = new Intent(getApplicationContext(),Lion.class);
					startActivity(i);
			}
				if (items[position].equals("Tiger")){
					
					Intent i = new Intent(getApplicationContext(),Tiger.class);
					startActivity(i);
			}
	if (items[position].equals("Leopard")){
					
					Intent i = new Intent(getApplicationContext(),Leopard.class);
					startActivity(i);
			}
	if (items[position].equals("Ocelot")){
		
		Intent i = new Intent(getApplicationContext(),Ocelot.class);
		startActivity(i);
}
			
			if (items[position].equals("Panther")){
				
				Intent i = new Intent(getApplicationContext(),Panther.class);
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
