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

public class SeaWater extends Activity {
ListView Sea;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sea_water);
		Sea = (ListView) findViewById(R.id.lvSea);

		Sea.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Clown fish", "Crab","Dolphin","Lobster","Octopus", "Sea Turtle", "Shark","Whale"};
				if (items[position].equals("Dolphin")){
					
						Intent i = new Intent(getApplicationContext(), Dolphin.class);
						startActivity(i);
				}
				if (items[position].equals("Octopus")){
					
					Intent i = new Intent(getApplicationContext(), Octopus.class);
					startActivity(i);
			}
		if (items[position].equals("Clown fish")){
					
					Intent i = new Intent(getApplicationContext(), ClownFish.class);
					startActivity(i);
			}
		if (items[position].equals("Crab")){
			
			Intent i = new Intent(getApplicationContext(), Crab.class);
			startActivity(i);
	}
		if (items[position].equals("Lobster")){
			
			Intent i = new Intent(getApplicationContext(), Lobster.class);
			startActivity(i);
	}
		if (items[position].equals("Sea Turtle")){
			
			Intent i = new Intent(getApplicationContext(), SeaTurtle.class);
			startActivity(i);
	}
		if (items[position].equals("Shark")){
			
			Intent i = new Intent(getApplicationContext(), Shark.class);
			startActivity(i);
	}
		if (items[position].equals("Whale")){
			
			Intent i = new Intent(getApplicationContext(), Whale.class);
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