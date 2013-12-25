package com.joshmcarthur.android.explicitintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}
	
	public void showOther(View v) {
		Intent other = new Intent(this, OtherActivity.class);
		other.putExtra(OtherActivity.EXTRA_MESSAGE, getString(R.string.other_message));
		startActivity(other);
	}

}
