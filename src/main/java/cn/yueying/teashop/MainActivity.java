package cn.yueying.teashop;

import cn.yueying.teashop.fragment.Fragment1;
import cn.yueying.teashop.fragment.NewProductFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends BaseFragmentActivity {

	private FragmentTabHost mTabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initTabs();
	}

	/**
	 * 初始化tabs
	 */
	private void initTabs() {
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

		Bundle b = new Bundle();
		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("新品上市"), NewProductFragment.class, b);
		b = new Bundle();
		b.putString("key", "sell");
		mTabHost.addTab(mTabHost.newTabSpec("contacts").setIndicator("最新优惠"), Fragment1.class, b);
		b = new Bundle();
		b.putString("key", "Custom");
		mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator("交流专区"), Fragment1.class, b);
		b = new Bundle();
		b.putString("key", "Custom");
		mTabHost.addTab(mTabHost.newTabSpec("custom").setIndicator("个人中心"), Fragment1.class, b);
		
		
	}

}