package com.joshmcarthur.gridviewsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
	private TextView selection;
	private static final String[] items  = {
		"lorem",
		"ipsum",
		"dolor",
		"sit",
		"amet",
		"elit",
		"morbi",
		"vel",
		"ligula"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		selection =  (TextView)findViewById(R.id.selection);
		GridView g = (GridView)findViewById(R.id.grid);
		g.setAdapter(new ArrayAdapter<String>(this, R.layout.cell, items));
		g.setOnItemClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		selection.setText(items[position]);
		
	}

}
