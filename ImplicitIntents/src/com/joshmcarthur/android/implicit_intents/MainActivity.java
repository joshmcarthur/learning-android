package com.joshmcarthur.android.implicit_intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText lat;
	private EditText lon;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lat = (EditText)findViewById(R.id.lat);
		lon = (EditText)findViewById(R.id.lon);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void showMe(View v) {
		String _lat = lat.getText().toString();
		String _lon = lon.getText().toString();
		Uri uri = Uri.parse("geo:" + _lat + "," + _lon + "?z=15");
		
		startActivity(new Intent(Intent.ACTION_VIEW, uri));
	}

}
