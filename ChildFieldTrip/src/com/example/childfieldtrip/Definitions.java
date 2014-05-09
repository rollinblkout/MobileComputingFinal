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
					.setMessage("Amphibians are ectothermic, tetrapod vertebrates of the class Amphibia.They inhabit a wide variety of habitats with most species living within terrestrial,fossorial, arboreal or freshwater aquatic ecosystems. ")
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
					.setMessage("The Canidae are the biological family of carnivorans that includes domestic dogs, wolves, foxes, jackals, coyotes, and many other lesser known extant and extinct dog-like mammals. A member of this family is called a canid.")
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
					.setMessage("A carnivore meaning 'meat eater' is an organism that derives its energy and nutrient requirements from a diet consisting mainly or exclusively of animal tissue, whether through predation or scavenging.")
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
					.setMessage("Felidae is the biological family of the cats; a member of this family is called a felid. The most familiar felid is the domestic cat.")
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
					.setMessage("A herbivore is an animal anatomically and physiologically adapted to eating plant material, for example foliage, for the main component of its diet.")
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
					.setMessage("Nocturnal creatures generally have highly developed senses of hearing, smell, and specially adapted eyesight.")
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
					.setMessage("Mammals are a clade of endothermic amniotes distinguished from the reptiles and the birds by the possession of hair, three middle ear bones, mammary glands in females, and a neocortex (a region of the brain).")
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
					.setMessage("An omnivore meaning 'all-eater' is an animal that can derive its energy and nutrients from a diet consisting of a variety of food sources that may include plants, animals, algae, fungi and select bacteria.")
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
					.setMessage("Reptiles, the class Reptilia, are an evolutionary grade of animals, comprising today's turtles, crocodilians, snakes, lizards and tuatara, as well as many extinct groups.")
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
					.setMessage("Rodents are mammals of the order Rodentia, characterised by a single pair of continuously growing incisors in each of the upper and lower jaws that must be kept short by gnawing.")
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
