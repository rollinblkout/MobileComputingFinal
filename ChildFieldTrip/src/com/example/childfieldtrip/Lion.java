package com.example.childfieldtrip;

import java.io.File;
import java.io.IOException;
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

@SuppressLint("SimpleDateFormat")
public class Lion extends Activity {
	private int currentImage = 0;
	private int numImages = 3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lion);
		  File stuff = Environment.getExternalStorageDirectory();
		    
		    File thing = new File (stuff.getAbsolutePath());
		    File file = new File (thing, "lionimage.jpg");
		    String path = stuff + "/lionimage.jpg";
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
		        	File directory = new File(Environment.getExternalStorageDirectory(), "lionimage.jpg");
		        	File directory2 = new File(Environment.getExternalStorageDirectory(), "oldlionimage.jpg");
		        	if(directory.exists()){
		        		if (directory2.exists()) {
		        			directory2.delete();
		        			File blah = new File(Environment.getExternalStorageDirectory(), "oldlionimage.jpg");
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
	    	    File file2 = new File (thing2, "oldlionimage.jpg");
	    	    if (file2.exists())
	    	    {
	    	    	String p2 = thing2 + "/oldlionimage.jpg";
	      	        BitmapFactory.Options opt = new BitmapFactory.Options();
		            opt.inSampleSize = 8;
	      	      init = BitmapFactory.decodeFile(p2, opt);
	   
	    	    }
		    	    File stuff = Environment.getExternalStorageDirectory();
		    	    
		    	    File thing = new File (stuff.getAbsolutePath());
		    	    File file = new File (thing, "lionimage.jpg");
		        	  if (file.exists())
		      	    {
			      	    	Date lastModDate = new Date(file.lastModified());  
		      	    		String date = lastModDate.toString();
		      	            TextView t = (TextView)findViewById(R.id.textView3);  
		      	            t.setText("Last picture taken on: " + date);
		      	          String p = thing + "/lionimage.jpg";
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
		            case 0:  imageI.setImageResource(R.drawable.lion);
		                     break;
		            case 1:  imageI.setImageResource(R.drawable.lion2);
		            break;
		            case 2: if (file.exists())
	            	{ imageI.setImageBitmap(initial); }
		            else { imageI.setImageResource(R.drawable.lion);
		            currentImage = 0;
		            }
	 	            break;
		            case 3: if (file2.exists())
	            	{ imageI.setImageBitmap(init); }
		            else { imageI.setImageResource(R.drawable.lion);
		            currentImage = 0;
		            }
	 	            break;
		            default: imageI.setImageResource(R.drawable.lion);
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
	    File file = new File (thing, "lionimage.jpg");
	    String path = stuff + "/lionimage.jpg";
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
}