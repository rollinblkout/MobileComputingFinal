package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
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
				String[] items = { "Guinea Pig", "Hamster","Mouse", "Rabbit","Rat"};
				if (items[position].equals("Rabbit")){
					
						Intent i = new Intent(getApplicationContext(),Rabbit.class);
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
		getMenuInflater().inflate(R.menu.rodents, menu);
		return true;
	}

}
