package com.example.childfieldtrip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GuessImage extends Activity {
	List<String> animalsAL = new ArrayList<String>();
	String animal="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guess_image);
		
		  Drawable a = findViewById(R.id.button1).getBackground();
		  Drawable b = findViewById(R.id.button2).getBackground();

		  a.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  
		  b.setColorFilter(0xFF00FF00, PorterDuff.Mode.DARKEN);  

		final EditText guess = (EditText) findViewById(R.id.editText1);
		final TextView correct=(TextView) findViewById(R.id.textView2);
		final TextView incorrect= (TextView) findViewById(R.id.textView3);
		final Button check=(Button) findViewById(R.id.button1);
		final Button next=(Button) findViewById(R.id.button2);
		
		
		try {
			Scanner animalTxt= new Scanner(getAssets().open("animalsearch.txt"));
			 String temp = null;
			 while(animalTxt.hasNextLine())
				{
				 temp = animalTxt.nextLine().toLowerCase();
					animalsAL.add(temp);
				}
				animalTxt.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		next();	
		check.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String temp=guess.getText().toString();
				if(temp.equalsIgnoreCase(animal)){
					Log.d("ADebugTag", "Animal true: " + temp);
					correct.setVisibility(View.VISIBLE);
					next();
				}
				else{
					Log.d("ADebugTag", "Animal False: " + temp);
					incorrect.setVisibility(View.VISIBLE);	
				}
			}
		});
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				next();
			}
		});
	}
	public void next(){
		final TextView correct=(TextView) findViewById(R.id.textView2);
		final TextView incorrect= (TextView) findViewById(R.id.textView3);
		correct.setVisibility(View.INVISIBLE);
		incorrect.setVisibility(View.INVISIBLE);
		Random randomnum = new Random();
		int rn=randomnum.nextInt(animalsAL.size());
		animal=animalsAL.get(rn);
		
		
		ImageView picture = (ImageView) findViewById(R.id.imageView1);
		int id = getResources().getIdentifier(animal, "drawable", GuessImage.this.getPackageName());
		if(id!=0){
			picture.setImageResource(id);
		}
		else{
			Log.d("ADebugTage","Target Image Not Found"+ 404);
			next();
		}
		Log.d("ADebugTag", "Value: " + animal);
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
