package com.evzhadko.musickgroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evzhadko.musickgroup.R;

public class ScreenOne extends Fragment {

	public ScreenOne() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.screen_one, container,
				false);

		return rootView;
	}

}
