package com.site580.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Ӧ�ó���Activity����
 * @version 1.0
 * @created 2012-9-18
 */
public class BaseActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AppManager.getAppManager().addActivity(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppManager.getAppManager().finishActivity(this);
	}
	
}
