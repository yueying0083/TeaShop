package cn.yueying.teashop;

import com.umeng.analytics.MobclickAgent;
import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (TeashopApplication.LOGCAT) {
			MobclickAgent.onError(this);
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		MobclickAgent.onResume(this);
	}

	protected void onPause() {
		super.onPause();
		MobclickAgent.onPause(this);
	}

}