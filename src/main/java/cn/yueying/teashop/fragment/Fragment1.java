package cn.yueying.teashop.fragment;

import cn.yueying.teashop.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {

	private TextView text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = LayoutInflater.from(getActivity()).inflate(R.layout.layout, null);
		text = (TextView) v.findViewById(R.id.text);
		if (getArguments() != null) {
			try {
				String value = getArguments().getString("key");
				text.setText("Current Tab is: " + value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
