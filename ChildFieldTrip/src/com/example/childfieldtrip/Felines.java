package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
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
				String[] items = { "Cheetah","Lion","Tiger"};
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
					
			}
		});
			}
//huh
}
