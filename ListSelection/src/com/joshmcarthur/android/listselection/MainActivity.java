package com.joshmcarthur.android.listselection;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	
	private TextView selection;
	private static final String[] items = {
		"lorem",
		"ipsum",
		"dolor",
		"sit", 
		"amet",
		"elit",
		"morbi",
		"vitae",
		"mollis",
		"purus",
		"augue"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
		selection = (TextView)findViewById(R.id.selection);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onListItemClick(ListView parent, View v, int position, long id) {
		selection.setText(items[position]);
	}	

}
