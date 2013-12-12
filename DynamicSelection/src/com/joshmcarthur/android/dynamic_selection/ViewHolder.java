package com.joshmcarthur.android.dynamic_selection;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
	TextView size = null;
	ImageView icon = null;

	public ViewHolder(View row) {
		this.icon = (ImageView)row.findViewById(R.id.icon);
		this.size = (TextView)row.findViewById(R.id.size);
	}

}
