package com.joshmcarthur.android.dynamic_selection;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	private static final String[] items = { "lorem", "ipsum", "dolor", "sit",
			"amet", "elit", "morbi", "vitae", "mollis", "purus", "augue" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setListAdapter(new IconicAdapter());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class IconicAdapter extends ArrayAdapter<String> {
		IconicAdapter() {
			super(MainActivity.this, R.layout.row, R.id.label, items);

		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View row = super.getView(position, convertView, parent);
			ViewHolder holder = (ViewHolder) row.getTag();

			if (holder == null) {
				holder = new ViewHolder(row);
				row.setTag(holder);
			}

			if (getModel(position).length() > 4) {
				holder.icon.setImageResource(android.R.drawable.ic_delete);
			} else {
				holder.icon.setImageResource(android.R.drawable.ic_input_add);
			}

			holder.size.setText(String.format(
					getString(R.string.string_size_template),
					items[position].length()));

			return row;
		}

		private String getModel(int position) {
			return (((IconicAdapter) getListAdapter()).getItem(position));
		}
	}

}
