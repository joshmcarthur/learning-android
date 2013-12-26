package com.joshmcarthur.android.explicitintents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class ContentFragment extends SherlockFragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View result = inflater.inflate(R.layout.main_fragment, container, false);
		result.findViewById(R.id.showOther).setOnClickListener(this);
		return result;
	}

	@Override
	public void onClick(View view) {
		((LifecycleLoggingActivity) getActivity()).showOther(view);
		
	}

}
