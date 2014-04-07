package com.example.childfieldtrip;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GuessImage extends Activity {
	List<String> animalsAL = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guess_image);
		ImageView picture = (ImageView) findViewById(R.id.imageView1);
		//picture.setImage;
		Words getAnimal = new Words();
		
		//getAnimal.fill(); //create the list of animals to choose from
		//TextView t = new TextView(this);
		//t=(TextView)findViewById(R.id.textView1);
		//t.setText(getAnimal.getNewAnimal());
		//Log.d("ADebugTag", "Value: " + getAnimal.getNewAnimal());
		//Log.d("RandomNum", "This is the random number" + getAnimal.checkNum());
		final Button check=(Button) findViewById(R.id.button1);
		check.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guess_image, menu);
		return true;
	}

}
