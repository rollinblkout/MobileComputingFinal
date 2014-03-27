package com.example.childfieldtrip;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AnimalTitle extends Activity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_animal_title);
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.animal_title, menu);
  return true;
 }
 
 public void search(View arg0){
	 
	 EditText message = (EditText)findViewById(R.id.editText1);
		String animal = message.getText().toString();
		
		if (animal.equalsIgnoreCase("dog"))
		{
			 Intent i = new Intent(getApplicationContext(),Dog.class);
			  startActivity(i);
		}else {
		
		if (animal.equalsIgnoreCase("cat"))
		{
			 Intent i = new Intent(getApplicationContext(),Cat.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("rabbit"))
		{
			 Intent i = new Intent(getApplicationContext(),Rabbit.class);
			  startActivity(i);
		} else
		
		if (animal.equalsIgnoreCase("horse"))
		{
			 Intent i = new Intent(getApplicationContext(),Horse.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("cow"))
		{
			 Intent i = new Intent(getApplicationContext(),Cow.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("parrot"))
		{
			 Intent i = new Intent(getApplicationContext(),Parrot.class);
			  startActivity(i);
		} else {
		
		if (animal.equalsIgnoreCase("turtle"))
		{
			 Intent i = new Intent(getApplicationContext(),Turtle.class);
			  startActivity(i);
		} else{
			if (animal.equalsIgnoreCase("pig"))
			{
				 Intent i = new Intent(getApplicationContext(),Pig.class);
				  startActivity(i);
			}else {
				if (animal.equalsIgnoreCase("guinea pig"))
				{
					 Intent i = new Intent(getApplicationContext(),Guineapig.class);
					  startActivity(i);
				} else{if (animal.equalsIgnoreCase("corn snake"))
				{
					 Intent i = new Intent(getApplicationContext(),CornSnake.class);
					  startActivity(i);
				} else{
					if (animal.equalsIgnoreCase("hamster"))
					{
						 Intent i = new Intent(getApplicationContext(),Hamster.class);
						  startActivity(i);
					
				} else {
					
					if (animal.equalsIgnoreCase("rat"))
					{
						 Intent i = new Intent(getApplicationContext(),Rat.class);
						  startActivity(i);
					} else{
						
						if (animal.equalsIgnoreCase("mouse"))
						{
							 Intent i = new Intent(getApplicationContext(),Mouse.class);
							  startActivity(i);
						} else {
							
							if (animal.equalsIgnoreCase("parakeet"))
							{
								 Intent i = new Intent(getApplicationContext(),Parakeet.class);
								  startActivity(i);
							} else {
								
								if (animal.equalsIgnoreCase("sheep"))
								{
									 Intent i = new Intent(getApplicationContext(),Sheep.class);
									  startActivity(i);
								} else {
									if (animal.equalsIgnoreCase("tiger"))
									{
										 Intent i = new Intent(getApplicationContext(),Tiger.class);
										  startActivity(i);
									} else {
										
										if (animal.equalsIgnoreCase("lion"))
										{
											 Intent i = new Intent(getApplicationContext(),Lion.class);
											  startActivity(i);
										}
										else {
											
											if (animal.equalsIgnoreCase("cheetah"))
											{
												 Intent i = new Intent(getApplicationContext(),Cheetah.class);
												  startActivity(i);
											} else {
												
												if (animal.equalsIgnoreCase("bear"))
												{
													 Intent i = new Intent(getApplicationContext(),Bear.class);
													  startActivity(i);
												} else {
													
													if (animal.equalsIgnoreCase("deer"))
													{
														 Intent i = new Intent(getApplicationContext(),Deer.class);
														  startActivity(i);
													} else
													{
														
														if (animal.equalsIgnoreCase("elephant"))
														{
															 Intent i = new Intent(getApplicationContext(),Elephant.class);
															  startActivity(i);
														} else {
															
															if (animal.equalsIgnoreCase("Gazelle"))
															{
																 Intent i = new Intent(getApplicationContext(),Gazelle.class);
																  startActivity(i);
															} else {
																
																if (animal.equalsIgnoreCase("giraffe"))
																{
																	 Intent i = new Intent(getApplicationContext(),Giraffe.class);
																	  startActivity(i);
																} else {
																	if (animal.equalsIgnoreCase("hippo"))
																	{
																		 Intent i = new Intent(getApplicationContext(),Hippo.class);
																		  startActivity(i);
																	
																} else {
																	if (animal.equalsIgnoreCase("zebra"))
																	{
																		 Intent i = new Intent(getApplicationContext(),Zebra.class);
																		  startActivity(i);
																	
																}else {
	
			Toast.makeText(getApplicationContext(),"Oops! " + animal + " is not in the database!", Toast.LENGTH_SHORT).show();
		}
		}
		}
		}
		}
		}
		}
								}
							}
						}
					}
				}
				}
				}
			}
		}
		}
		}
		}
		}
		}
		}
		}
		}
		}
 
 public void goToDomesticScreen(View arg0) {
  Intent i = new Intent(getApplicationContext(),Domestic.class);
  startActivity(i);
 }
 public void goToWildAnimalScreen(View arg0) {
	  Intent i = new Intent(getApplicationContext(),WildAnimals.class);
	  startActivity(i);
	 }
}