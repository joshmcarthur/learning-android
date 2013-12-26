package com.joshmcarthur.android.dynamic_fragments;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.SherlockListFragment;

public class OtherFragment extends SherlockListFragment {

	private static final String[] items = { "lorem", "ipsum", "dolor", "sit",
			"amet", "ligula", "placerat", "vel", "etiam" };

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, items));
	}

}
