package com.joshmcarthur.android.webviewclientsample;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	WebView browser;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		browser = (WebView) findViewById(R.id.webview);
		browser.setWebViewClient(new Callback());
		loadTime();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	void loadTime() {
		String page = "<html><body><a href='clock'>"
				+ DateUtils
						.formatDateTime(this, new Date().getTime(),
								DateUtils.FORMAT_SHOW_DATE
										| DateUtils.FORMAT_SHOW_TIME)
				+ "</a></body></html>";

		browser.loadData(page, "text/html", "utf-8");
	}
	
	private class Callback extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			loadTime();
			return true;
		}
	}

}
