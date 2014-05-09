package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class Definitions extends Activity {
	ListView def;
	String[] definitions;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_definitions);
		definitions = getResources().getStringArray(R.array.def);
		def = (ListView) findViewById(R.id.lvdef);

		def.setOnItemClickListener(new OnItemClickListener() {
		
			@Override
			public void onItemClick(AdapterView<?> adapter, View v,
					int position, long id) {
				String[] items = { "Amphibian", "Canines","Carnivore", "Feline","Herbivore","Nocturnal","Mammal","Omnivore","Reptile","Rodent"};
				if (items[position].equals("Amphibian")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("AMPHIBIAN")
					.setMessage("Amphibians are a species that live in freshwater ecosystems. They normally start off as larva living in the water and then later go into metamorphosis. They are like reptiles but they require water to breed. ")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}

				if (items[position].equals("Canines")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("CANINES")
					.setMessage("Canines are a biological family made up of dogs, foxes, wolves and coyotes. They consist of other dog-like mammals as well.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Carnivore")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("CARNIVORE")
					.setMessage("Organism that eats meat.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Feline")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("FELINE")
					.setMessage("Felines are a family that consists of cat-like animals such as cats, cheetahs, and lions.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Herbivore")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("HERBIVORE")
					.setMessage("Organisms that eat plants and not meat.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Nocturnal")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("NOCTURNAL")
					.setMessage("Animals active during the night and that sleep during the day.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Mammal")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("MAMMAL")
					.setMessage("Mammals are animals that have their brain regulate body temperature. The females always nurse their young with their milk.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Omnivore")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("OMNIVORE")
					.setMessage("An omnivore eats everything from plants to meat.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Reptile")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("REPTILE")
					.setMessage("Reptiles consist of lizards, crocodiles, and turtles. They arecold blooded and their eggs have an extra membrane. Their skin has scales.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
				if (items[position].equals("Rodent")){
					AlertDialog.Builder builder = new AlertDialog.Builder(Definitions.this);
					builder.setTitle("RODENT")
					.setMessage("Rodents are mammals that use sharp incisors to defend themselves and break into food. They are found in great numbers in many countries. Most rodents are tiny.")
					.setCancelable(false)
					.setNegativeButton("Close",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							dialog.cancel();
						}
					});
					AlertDialog alert = builder.create();
					alert.show();
				}
		}
			
	
		
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.birds, menu);
		return true;
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
