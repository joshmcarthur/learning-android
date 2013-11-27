package com.joshmcarthur.android.basic_check_box;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends Activity implements
		CompoundButton.OnCheckedChangeListener {

	CheckBox cb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		cb = (CheckBox) findViewById(R.id.check);
		cb.setOnCheckedChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			cb.setText(R.string.checked);
		} else {
			cb.setText(R.string.unchecked);

		}
	}

}
