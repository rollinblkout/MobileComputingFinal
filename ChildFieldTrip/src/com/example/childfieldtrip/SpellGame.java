package com.example.childfieldtrip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class SpellGame extends Activity {
String animal="bear";
int count=0;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		

		Words startGame = new Words();

		//startGame.playGame();
		//startGame.checkResult(input from edit box);
		
		SpellGameDrawing lines = new SpellGameDrawing(SpellGame.this);
		lines.setWord(animal);
		lines.setWordlength(animal.length());
		setContentView(lines);
		setContentView(R.layout.activity_spell_game);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spell_game, menu);
		return true;
	}

}
