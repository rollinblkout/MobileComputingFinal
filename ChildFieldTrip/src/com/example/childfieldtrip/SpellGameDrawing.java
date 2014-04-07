package com.example.childfieldtrip;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

public class SpellGameDrawing extends View {
Paint paint =new Paint();
String animal="";
int wordLength=0;
int middlex=0;
int middley=0;
final int space=10; // sets the distance between the lines and letters
final int lineLength=50; // sets the length of the line

	public SpellGameDrawing(Context context) {
		super(context);
		setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT));
		paint.setColor(Color.BLACK);
		// TODO Auto-generated constructor stub
	}
	public SpellGameDrawing(Context context, AttributeSet attrs){
		super(context,attrs);
	}
	
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		middlex=(canvas.getWidth())/2;
		middley=(canvas.getHeight())/2;

		
		if(wordLength%2==0){
			canvas.drawLine(middlex+5, middley, middlex+45, middley, paint); //establishes the middle line for offset
			canvas.drawText(animal.substring((wordLength/2),(wordLength/2)+1), middlex+25, middley-20, paint);
				for(int x=1; x<=((wordLength/2)-1);x++){
					canvas.drawLine(middlex+((lineLength)*x), middley, middlex+((lineLength*x)+40), middley, paint);
					canvas.drawText(animal.substring((wordLength/2)+x,(wordLength/2)+(x+1)),(middlex+((lineLength)*x)+middlex+((lineLength*x)+40))/2, middley-20, paint);
					
				}
				for(int x=1; x<=(wordLength/2);x++){
					canvas.drawLine(middlex-((lineLength)*x), middley, middlex-((lineLength*x)-40), middley, paint);
				}
		}
		else{
			canvas.drawLine(middlex, middley, middlex+40, middley, paint); //establishes the middle line for offset
				for(int x=1; x<=((wordLength-1)/2);x++){
					canvas.drawLine(middlex+((lineLength)*x), middley, middlex+((lineLength*x)+40), middley, paint);
				}
				for(int x=1; x<=((wordLength-1)/2);x++){
					canvas.drawLine(middlex-((lineLength)*x), middley, middlex-((lineLength*x)-40), middley, paint);
				}
		}
	}
	public void setWord(String word){
		animal=word;
		
	}
	public void setWordlength(int len){
		wordLength=len;
	}
		
}
