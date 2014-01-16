package com.homesafe.booking;



import org.apache.cordova.DroidGap;


import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends DroidGap {
	
	private static final String HTML_ROOT = "file:///android_asset/www/";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setIntegerProperty("splashscreen",R.drawable.homesafe_logo);
		super.loadUrl(HTML_ROOT+"index.html",15000);
		//super.setIntegerProperty("loadUrlTimeoutValue", 10000); 
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}
	
	

}
