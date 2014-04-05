package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SpellGame extends Activity {
String animal="bear";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spell_game);
		
		SpellGameDrawing lines = new SpellGameDrawing(SpellGame.this);
		lines.setWord(animal);
		lines.setWordlength(animal.length());
		setContentView(lines);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spell_game, menu);
		return true;
	}

}
