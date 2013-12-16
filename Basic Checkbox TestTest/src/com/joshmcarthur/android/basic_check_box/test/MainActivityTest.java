package com.joshmcarthur.android.basic_check_box.test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.view.ViewGroup;

import com.joshmcarthur.android.basic_check_box.MainActivity;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mActivity;

	public MainActivityTest() {
		super("com.joshmcarthur.android.basic_check_box", MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		mActivity = getActivity();
	}
	
	public void testPreConditions() {
		assertSame(
				mActivity.findViewById(com.joshmcarthur.android.basic_check_box.R.id.LinearLayout1),
				getContentView()
		);
	}
	
	private View getContentView() {
		return ((ViewGroup) mActivity.findViewById(android.R.id.content)).getChildAt(0);
	}
}
