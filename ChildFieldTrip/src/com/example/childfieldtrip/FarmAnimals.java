package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class FarmAnimals extends Activity{
	
	ListView lvFarmAnimals;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farm_animals);
		
		lvFarmAnimals = (ListView) findViewById(R.id.lvFA);

		lvFarmAnimals.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Cow","Horse", "Pig","Sheep"};
				if (items[position].equals("Horse")){
					
						Intent i = new Intent(getApplicationContext(),Horse.class);
						startActivity(i);
				}
				if (items[position].equals("Cow")){
					
					Intent i = new Intent(getApplicationContext(),Cow.class);
					startActivity(i);
			}
				if (items[position].equals("Sheep")){
					
					Intent i = new Intent(getApplicationContext(),Sheep.class);
					startActivity(i);
			}
	if (items[position].equals("Pig")){
					
					Intent i = new Intent(getApplicationContext(),Pig.class);
					startActivity(i);
			}
			}
		});
			}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.farm_animals, menu);
		return true;
	}

}
