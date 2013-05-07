package com.site580.app;

import android.app.Application;

public class CrashApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		CrashHandler catchHandler = CrashHandler.getInstance();  
        catchHandler.init(getApplicationContext());
	}

}
