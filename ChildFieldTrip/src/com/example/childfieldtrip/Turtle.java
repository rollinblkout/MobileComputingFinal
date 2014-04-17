package com.example.childfieldtrip;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Turtle extends Activity {
	private int currentImage = 0;
	private int numImages = 2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_turtle);
	    File stuff = Environment.getExternalStorageDirectory();
	    
	    File thing = new File (stuff.getAbsolutePath());
	    File file = new File (thing, "turtleimage.jpg");
	    
	    if (file.exists())
	    {
	    	try {
	    		FileInputStream insert = new FileInputStream(file);
	    		Date lastModDate = new Date(file.lastModified());  
	    		String date = lastModDate.toString();
	            TextView t = (TextView)findViewById(R.id.textView3);  
	            t.setText("Last picture taken on: " + date);
	    		Bitmap initial = BitmapFactory.decodeStream(insert);
	    		 ImageView imageI =(ImageView) findViewById(R.id.imageView1);
	    	        imageI.setImageBitmap(initial);
	    	} catch (IOException e){
	    		e.printStackTrace();
	    	}
	    }
	}
	        public void goToCamera(View arg0)
	        {
	        	File directory = new File(Environment.getExternalStorageDirectory(), "turtleimage.jpg");
	        	File directory2 = new File(Environment.getExternalStorageDirectory(), "oldturtleimage.jpg");
	        	if(directory.exists()){
	        		if (directory2.exists()) {
	        			directory2.delete();
	        			File blah = new File(Environment.getExternalStorageDirectory(), "oldturtleimage.jpg");
	        			directory.renameTo(blah);
	        			directory.delete();
	        		} else {
	        			
	        		directory.renameTo(directory2);
	        		directory.delete();
	        		
	        	}}else {
	        			try{
	        				directory.createNewFile();
	        			} catch (IOException e){
	        				e.printStackTrace();
	        			}
	        		}
	        	Uri image = Uri.fromFile(directory);
	            Intent Intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	            Intent.putExtra(MediaStore.EXTRA_OUTPUT, image);
	            startActivityForResult(Intent, 5);
	        }
      
	        
	        public void onPictureClick(View v) {
	       	        	
	       		        Bitmap initial = null;

	       		        	
	       		    	    File stuff = Environment.getExternalStorageDirectory();
	       		    	    
	       		    	    File thing = new File (stuff.getAbsolutePath());
	       		    	    File file = new File (thing, "turtleimage.jpg");
	       		        	  if (file.exists())
	       		      	    {
	       		      	    	try {
	       		      	    		FileInputStream insert = new FileInputStream(file);
	       		      	    		Date lastModDate = new Date(file.lastModified());  
	       		      	    		String date = lastModDate.toString();
	       		      	            TextView t = (TextView)findViewById(R.id.textView3);  
	       		      	            t.setText("Last picture taken on: " + date);
	       		      	    		 initial = BitmapFactory.decodeStream(insert);

	       		      	    	   
	       		      	    	} catch (IOException e){
	       		      	    		e.printStackTrace();
	       		      	    	}
	       		      	    }
	       		 
	       		            //Increase Counter to move to next Image
	       		            currentImage++;
	       		            currentImage = currentImage % numImages;
	       		            		 ImageView imageI =(ImageView) findViewById(R.id.imageView1);
	       		            //Set the image depending on the counter.
	       		            switch (currentImage) {
	       		            case 0:  imageI.setImageResource(R.drawable.turtle);
	       		                     break;

	       		      
	       		            case 1: if (file.exists())
	       	            	{ imageI.setImageBitmap(initial); }
	       		            else { imageI.setImageResource(R.drawable.turtle);
	       		            currentImage = 0;
	       		            }
	       	 	            break;
	       		            default: imageI.setImageResource(R.drawable.turtle);
	       		            currentImage = 0;
	       		            }
	       		            }
@SuppressLint("SimpleDateFormat")
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) 
{
    super.onActivityResult(requestCode, resultCode, data);
    if( requestCode == 5)
    {   
        Bitmap picture = (Bitmap) data.getExtras().get("data");
        ImageView image =(ImageView) findViewById(R.id.imageView1);
        image.setImageBitmap(picture);

        SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyyy");  
        String c = formatter.format(new Date());
        TextView t = (TextView)findViewById(R.id.textView3);  
        t.setText("Last picture taken on: " + c);
    }
    else 
    {
    	Toast.makeText(getApplicationContext(),"Oops! You forgot to take the picture!", Toast.LENGTH_SHORT).show();
    }

}

}
