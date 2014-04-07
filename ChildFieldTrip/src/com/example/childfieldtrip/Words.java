package com.example.childfieldtrip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import android.app.Activity;

public class Words extends Activity {
	List<String> animalsAL = new ArrayList<String>();
	
	int testnum=0;
	
	public void playGame(){
		fill();
		
	}
	public void fill(){
	
		try {
			Scanner animalTxt= new Scanner(getAssets().open("animalsearch.txt"));
			 String temp = null;
			 while(animalTxt.hasNextLine())
				{
				 temp = animalTxt.nextLine().toLowerCase();
					animalsAL.add(temp);


				}
				animalTxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getNewAnimal(){
		Random randomnum = new Random();
		int rn=randomnum.nextInt(animalsAL.size());
		String animal="";
		//animal=animalsAL[rn];
		testnum=rn;
		return animal;
	}
	public void checkResult(String userGuess){
		
	}
	public int checkNum(){
		return animalsAL.size();
	}
}
