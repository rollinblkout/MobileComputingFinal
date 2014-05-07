package com.example.childfieldtrip;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Seagull extends Activity {
	private int currentImage = 0;
	private int numImages = 3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seagull);
		 File stuff = Environment.getExternalStorageDirectory();
		    
		    File thing = new File (stuff.getAbsolutePath());
		    File file = new File (thing, "seagullimage.jpg");
		    String path = stuff + "/seagullimage.jpg";
		    if (file.exists())
		    {
		    		Date lastModDate = new Date(file.lastModified());  
		    		String date = lastModDate.toString();
		            TextView t = (TextView)findViewById(R.id.textView3); 
		            BitmapFactory.Options options = new BitmapFactory.Options();
		            options.inSampleSize = 8;
		            t.setText("Last picture taken on: " + date);
		    		Bitmap initial = BitmapFactory.decodeFile(path, options);
		    		 ImageView imageI =(ImageView) findViewById(R.id.imageView1);
		    	        imageI.setImageBitmap(initial);
		   
		    }
		}
		        public void goToCamera(View arg0)
		        {
		        	File directory = new File(Environment.getExternalStorageDirectory(), "seagullimage.jpg");
		        	File directory2 = new File(Environment.getExternalStorageDirectory(), "oldseagullimage.jpg");
		        	if(directory.exists()){
		        		if (directory2.exists()) {
		        			directory2.delete();
		        			File blah = new File(Environment.getExternalStorageDirectory(), "oldseagullimage.jpg");
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
		        Bitmap init = null;

	    	    File stuff2 = Environment.getExternalStorageDirectory();
	    	    
	    	    File thing2 = new File (stuff2.getAbsolutePath());
	    	    File file2 = new File (thing2, "oldseagullimage.jpg");
	    	    if (file2.exists())
	    	    {
	    	    
	      	          String p2 = thing2 + "/oldseagullimage.jpg";
	      	        BitmapFactory.Options opt = new BitmapFactory.Options();
		            opt.inSampleSize = 8;
	      	      init = BitmapFactory.decodeFile(p2, opt);
	   

	      	    	   
	      	
	    	    }
		    	    File stuff = Environment.getExternalStorageDirectory();
		    	    
		    	    File thing = new File (stuff.getAbsolutePath());
		    	    File file = new File (thing, "seagullimage.jpg");
		        	  if (file.exists())
		      	    {
		      	    		Date lastModDate = new Date(file.lastModified());  
		      	    		String date = lastModDate.toString();
		      	            TextView t = (TextView)findViewById(R.id.textView3);  
		      	            t.setText("Last picture taken on: " + date);
		      	          String p = thing + "/seagullimage.jpg";
		      	        BitmapFactory.Options opt = new BitmapFactory.Options();
			            opt.inSampleSize = 8;
		      	      initial = BitmapFactory.decodeFile(p, opt);
		   

		      	    	   
		    
		      	    }
		 
		        	  
		            //Increase Counter to move to next Image
		            currentImage++;
		            currentImage = currentImage % numImages;
		            		 ImageView imageI =(ImageView) findViewById(R.id.imageView1);
		            //Set the image depending on the counter.
		            switch (currentImage) {
		            case 0:  imageI.setImageResource(R.drawable.seagull);
		                     break;
		            case 1: if (file.exists())
	            	{ imageI.setImageBitmap(initial); }
		            else { imageI.setImageResource(R.drawable.seagull);
		            currentImage = 0;
		            }
	 	            break;
		            case 2: if (file2.exists())
	            	{ imageI.setImageBitmap(init); }
		            else { imageI.setImageResource(R.drawable.seagull);
		            currentImage = 0;
		            }
	 	            break;
		            default: imageI.setImageResource(R.drawable.seagull);
		            currentImage = 0;
		            }
		            }
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
	    super.onActivityResult(requestCode, resultCode, data);
	    if( requestCode == 5)
	    {   

	    File stuff = Environment.getExternalStorageDirectory();
	    
	    File thing = new File (stuff.getAbsolutePath());
	    File file = new File (thing, "seagullimage.jpg");
	    String path = stuff + "/seagullimage.jpg";
	    if (file.exists())
	    {
	    	Date lastModDate = new Date(file.lastModified());  
	    		String date = lastModDate.toString();
	            TextView t = (TextView)findViewById(R.id.textView3); 
	            BitmapFactory.Options options = new BitmapFactory.Options();
	            options.inSampleSize = 8;
	            t.setText("Last picture taken on: " + date);
	    		Bitmap initial = BitmapFactory.decodeFile(path, options);
	    		 ImageView imageI =(ImageView) findViewById(R.id.imageView1);
	    	        imageI.setImageBitmap(initial);
	    
	    }
	}
	else 
	{
	Toast.makeText(getApplicationContext(),"Oops! You forgot to take the picture!", Toast.LENGTH_SHORT).show();
	}
	}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
//Inflate the menu; this adds items to the action bar if it is present.
	 MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.birds, menu);
	    return super.onCreateOptionsMenu(menu);
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
//Handle presses on the action bar items
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
