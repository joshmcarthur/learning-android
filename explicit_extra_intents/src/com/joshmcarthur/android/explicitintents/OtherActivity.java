package com.joshmcarthur.android.explicitintents;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	
	public static final String EXTRA_MESSAGE = "msg";

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		
		TextView textView = (TextView)findViewById(R.id.other_message);
		textView.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
	}


}
