package cn.yueying.teashop.fragment;

import cn.yueying.teashop.R;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends Fragment1 {

	private FragmentTabHost mTabHost;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		mTabHost = new FragmentTabHost(getActivity());
		mTabHost.setup(getActivity(), getChildFragmentManager(),
				R.id.action_settings);

		Bundle b = new Bundle();
		b.putString("key", "Simple");
		mTabHost.addTab(mTabHost.newTabSpec("simple").setIndicator("Simple"),
				Fragment1.class, b);
		//
		b = new Bundle();
		b.putString("key", "Contacts");
		mTabHost.addTab(mTabHost.newTabSpec("contacts")
				.setIndicator("Contacts"), Fragment1.class, b);
		return mTabHost;
	}
}
