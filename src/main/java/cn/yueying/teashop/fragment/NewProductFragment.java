package cn.yueying.teashop.fragment;

import cn.yueying.teashop.R;
import cn.yueying.teashop.model.TeaModel;
import cn.yueying.waterfalllibrary.view.WaterFallScrollView;
import cn.yueying.waterfalllibrary.view.WaterFallScrollView.OnItemClickListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class NewProductFragment extends Fragment {

	private String[][] a = { { "http://img.faxingw.cn/201305/20121224020347560.jpg", "338", "388" }, { "http://img.faxingw.cn/201305/82959.jpg", "380", "480" },
			{ "http://img.faxingw.cn/201305/4113630.jpg", "380", "438" }, { "http://img.faxingw.cn/201305/b707fc950b2cdcce79c8a55b5713_765_1046.jpg", "380", "420" },
			{ "http://img.faxingw.cn/201305/dd11.jpg", "380", "480" }, { "http://img.faxingw.cn/201305/TI9.jpg", "380", "420" },
			{ "http://img.faxingw.cn/201305/41261_283171_236379.jpg", "380", "428" }, { "http://img.faxingw.cn/201305/3752.jpg", "380", "428" },
			{ "http://img.faxingw.cn/201305/83114.jpg", "380", "482" }, { "http://img.faxingw.cn/201305/95650.jpg", "350", "398" } };

	private WaterFallScrollView<TeaModel> mWaterFallScrollView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@SuppressWarnings("unchecked")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = LayoutInflater.from(getActivity()).inflate(R.layout.new_product, null);
		mWaterFallScrollView = (WaterFallScrollView<TeaModel>) v.findViewById(R.id.staggeredGridView1);
		mWaterFallScrollView.setOnItemClickListener(mOnItemClickListener);

		for (String[] as : a) {
			mWaterFallScrollView.addItem(new TeaModel(as[0], Integer.parseInt(as[1]), Integer.parseInt(as[2])));
		}
		return v;
	}

	private OnItemClickListener mOnItemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(View view) {
			Object obj = view.getTag();
			if (obj != null && obj instanceof TeaModel) {
				TeaModel hs = (TeaModel) obj;
				Toast.makeText(getActivity(), hs.getImageUrl(), Toast.LENGTH_SHORT).show();
			}
		}

	};

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
