package com.example.childfieldtrip;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CornSnake extends Activity {
	int CAMERA_ACTIVATE = 5; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_corn_snake);
	}

    public void goToCamera(View arg0)
    {
        Intent Intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(Intent, CAMERA_ACTIVATE);
    }


@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) 
{
super.onActivityResult(requestCode, resultCode, data);
if( requestCode == CAMERA_ACTIVATE)
{   
Bitmap picture = (Bitmap) data.getExtras().get("data");
ImageView image =(ImageView) findViewById(R.id.imageView1);
image.setImageBitmap(picture);
}
else 
{
Toast.makeText(getApplicationContext(),"Oops! You forgot to take the picture!", Toast.LENGTH_SHORT).show();
}

}

}