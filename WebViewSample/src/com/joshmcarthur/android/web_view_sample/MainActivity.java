package com.joshmcarthur.android.web_view_sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView browser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		browser = (WebView)findViewById(R.id.webkit);
		// Javascript is disabled by default - uncomment this line if you
		// want to enable it.
		//browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("http://joshmcarthur.com");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
