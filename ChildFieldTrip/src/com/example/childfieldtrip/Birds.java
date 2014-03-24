package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Birds extends Activity {
	ListView lvBirds;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_birds);
		
		lvBirds= (ListView) findViewById(R.id.lvB);

		lvBirds.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Parrot"};
				if (items[position].equals("Parrot")){
					
						Intent i = new Intent(getApplicationContext(),Parrot.class);
						startActivity(i);
				}
					
			}
		});
			}



}
