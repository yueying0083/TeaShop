package cn.yueying.teashop;

import com.umeng.analytics.MobclickAgent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class BaseFragmentActivity extends FragmentActivity {

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
