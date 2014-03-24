package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Reptiles extends Activity {
	ListView lvReptiles;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reptiles);
		
		lvReptiles = (ListView) findViewById(R.id.lvR);

		lvReptiles.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Turtle"};
				if (items[position].equals("Turtle")){
					
						Intent i = new Intent(getApplicationContext(),Turtle.class);
						startActivity(i);
				}
					
			}
		});
			}



}
