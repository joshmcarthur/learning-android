package com.joshmcarthur.android.action_bar_demo;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MainActivity extends SherlockListActivity implements
		OnEditorActionListener {

	private ArrayAdapter<String> adapter;
	private String[] items = { "lorem", "ipsum", "dolor" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		setContentView(R.layout.activity_main);
		initAdapter();

		Drawable d = getResources().getDrawable(
				R.drawable.action_bar_background);
		getSupportActionBar().setBackgroundDrawable(d);
		getSupportActionBar().setSplitBackgroundDrawable(d);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		configureActionItem(menu);
		return (super.onCreateOptionsMenu(menu));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == R.id.reset) {
			initAdapter();
			return true;
		} else {
			return super.onOptionsItemSelected(item);
		}
	}

	private void configureActionItem(Menu menu) {
		EditText add = (EditText) menu.findItem(R.id.add).getActionView()
				.findViewById(R.id.title);

		add.setOnEditorActionListener(this);
	}

	private void initAdapter() {
		ArrayList<String> words = new ArrayList<String>();

		for (String s : items) {
			words.add(s);
		}

		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, words);

		setListAdapter(adapter);
	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (event == null || event.getAction() == KeyEvent.ACTION_UP) {
			adapter.add(v.getText().toString());
			v.setText("");

			InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
		}

		return true;
	}

}
