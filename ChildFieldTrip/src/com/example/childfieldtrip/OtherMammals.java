package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
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
				String[] items = { "Bear","Deer","Elephant","Gazelle","Giraffe","Hippo","Zebra"};
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
		getMenuInflater().inflate(R.menu.other_mammals, menu);
		return true;
	}

}
