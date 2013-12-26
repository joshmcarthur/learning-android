package com.joshmcarthur.android.action_bar_fragment;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getSupportFragmentManager().findFragmentById(android.R.id.content) == null) {
			getSupportFragmentManager().beginTransaction()
					.add(android.R.id.content, new ActionBarFragment())
					.commit();
		}
	}

}
