package com.example.childfieldtrip;


import java.io.File;



import android.os.Bundle;

import android.app.Activity;


public class CameraActivity extends Activity {

    protected boolean _taken = true;
    File sdImageMainDirectory;

    protected static final String PHOTO_TAKEN = "photo_taken";

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);
       
    }


    

   
}
