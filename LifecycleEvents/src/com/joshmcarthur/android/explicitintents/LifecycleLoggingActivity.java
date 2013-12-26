package com.joshmcarthur.android.explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class LifecycleLoggingActivity extends SherlockFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Log.d(getClass().getSimpleName(), "onCreate");
		
	}
	
	@Override
	public void onRestart() {
		super.onRestart();
		Log.d(getClass().getSimpleName(), "onRestart");
	}
	
	@Override
	public void onStart() {
		super.onStart();
		Log.d(getClass().getSimpleName(), "onStart");
	}
	
	@Override
	public void onStop() {
		super.onStop();
		Log.d(getClass().getSimpleName(), "onStop");
	}
	
	@Override
	public void onPause() {
		super.onPause();
		Log.d(getClass().getSimpleName(), "onPause");
	}
	
	@Override
	public void onResume() {
		super.onResume();
		Log.d(getClass().getSimpleName(), "onResume");
	}
	
	@Override
	public void onDestroy() {
		Log.d(getClass().getSimpleName(), "onDestroy");
		super.onDestroy();
	}
	
	
	public void showOther(View v) {
		startActivity(new Intent(this, OtherActivity.class));
	}

}
