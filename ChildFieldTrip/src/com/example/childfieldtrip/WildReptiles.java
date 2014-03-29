package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class WildReptiles extends Activity {
ListView Rep;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wild_reptiles);
		
		Rep = (ListView) findViewById(R.id.lvR);

		Rep.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Alligator"};
				if (items[position].equals("Alligator")){
					
						Intent i = new Intent(getApplicationContext(),Alligator.class);
						startActivity(i);
				}
		
					
			}
		});
			
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wild_reptiles, menu);
		return true;
	}

}
