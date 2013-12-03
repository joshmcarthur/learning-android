package com.joshmcarthur.android.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
	
	private TextView selection;
	private static final String[] items = {
		"lorem",
		"ipsum",
		"dolor",
		"sit",
		"amet"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selection = (TextView)findViewById(R.id.selection);
		Spinner spin = (Spinner)findViewById(R.id.spinner);
		spin.setOnItemSelectedListener(this);
		ArrayAdapter<String> aa = new ArrayAdapter<String>(
			this,
			android.R.layout.simple_spinner_item,
			items
		);
		
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spin.setAdapter(aa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
		selection.setText(items[position]);
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		selection.setText("");
	}

}
