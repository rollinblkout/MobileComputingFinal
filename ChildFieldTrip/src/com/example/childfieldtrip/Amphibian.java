package com.example.childfieldtrip;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Amphibian extends Activity {
ListView Amp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_amphibian);
	
		Amp = (ListView) findViewById(R.id.lvAmp);

		Amp.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Frog"};
				if (items[position].equals("Frog")){
					
						Intent i = new Intent(getApplicationContext(), Frog.class);
						startActivity(i);
				}
		
					
			}
		});
			
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.amphibian, menu);
		return true;
	}

}

