package com.joshmcarthur.android.action_bar_fragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.joshmcarthur.android.action_bar_demo.R;

public class ActionBarFragment extends SherlockListFragment implements
OnEditorActionListener {

	private ArrayAdapter<String> adapter;
	private String[] items = {
			"lorem", 
			"ipsum",
			"dolor"
	};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		setRetainInstance(true);
		setHasOptionsMenu(true);
		
		if (adapter == null) {
			initAdapter();
		}
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.main, menu);
		configureActionItem(menu);
		super.onCreateOptionsMenu(menu, inflater);
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

	
	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (event == null || event.getAction() == KeyEvent.ACTION_UP) {
			adapter.add(v.getText().toString());
			v.setText("");
			
			InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
		}

		return true;
	}
	
	private void initAdapter() {
		ArrayList<String> words = new ArrayList<String>();

		for (String s : items) {
			words.add(s);
		}

		adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, words);
		
		setListAdapter(adapter);
	}
	
	

	


}
