package cn.yueying.teashop;

import org.apache.http.impl.client.DefaultHttpClient;
import android.app.Application;
import android.content.Context;

public class TeashopApplication extends Application {

	public static final boolean DEBUG = true;
	public static final boolean LOGCAT = false;

	private DefaultHttpClient mDefaultHttpClient;

	@Override
	public void onCreate() {
		super.onCreate();
	}

	public synchronized DefaultHttpClient getDefaultHttpClient() {
		if (mDefaultHttpClient == null) {
			mDefaultHttpClient = new DefaultHttpClient();
		}
		return mDefaultHttpClient;
	}

	public static TeashopApplication getApplication(Context context) {
		return (TeashopApplication) context.getApplicationContext();
	}

}
