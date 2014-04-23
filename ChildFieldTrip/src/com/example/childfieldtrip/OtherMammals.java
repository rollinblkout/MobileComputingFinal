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

public class OtherMammals extends Activity {
ListView OtherMammals;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other_mammals);
		
		OtherMammals = (ListView) findViewById(R.id.lvOM);

		OtherMammals.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Baboon","Bear","Boar","Buffalo","Deer","Elephant","Gazelle","Giraffe","Gorilla","Hippo","Monkey","Zebra"};
				if (items[position].equals("Bear")){
					
						Intent i = new Intent(getApplicationContext(),Bear.class);
						startActivity(i);
				}
				if (items[position].equals("Deer")){
					
					Intent i = new Intent(getApplicationContext(),Deer.class);
					startActivity(i);
			}
				if (items[position].equals("Elephant")){
					
					Intent i = new Intent(getApplicationContext(),Elephant.class);
					startActivity(i);
			}
	if (items[position].equals("Monkey")){
					
					Intent i = new Intent(getApplicationContext(),Monkey.class);
					startActivity(i);
			}
	if (items[position].equals("Gorilla")){
		
		Intent i = new Intent(getApplicationContext(),Gorilla.class);
		startActivity(i);
}
	if (items[position].equals("Baboon")){
		
		Intent i = new Intent(getApplicationContext(),Baboon.class);
		startActivity(i);
}
	if (items[position].equals("Buffalo")){
		
		Intent i = new Intent(getApplicationContext(),Buffalo.class);
		startActivity(i);
}
	if (items[position].equals("Boar")){
		
		Intent i = new Intent(getApplicationContext(),Boar.class);
		startActivity(i);
}
	if (items[position].equals("Gazelle")){
					
					Intent i = new Intent(getApplicationContext(),Gazelle.class);
					startActivity(i);
			}
	
	if (items[position].equals("Giraffe")){
		
		Intent i = new Intent(getApplicationContext(),Giraffe.class);
		startActivity(i);
}
	
	if (items[position].equals("Hippo")){
		
		Intent i = new Intent(getApplicationContext(),Hippo.class);
		startActivity(i);
}
	
	if (items[position].equals("Zebra")){
		
		Intent i = new Intent(getApplicationContext(),Zebra.class);
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
