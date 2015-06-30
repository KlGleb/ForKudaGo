package com.klgleb.forkudago;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viewpagerindicator.UnderlinePageIndicator;

/**
 * Created by klgleb on 27.06.15.
 *
 * Main fragment with slider and list.
 */
public class MyFragment extends Fragment {

    public static final String USE_REST = "use_rest";

    public static MyFragment newInstance(boolean useRest) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putBoolean(USE_REST, useRest);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ViewPager mPager = (ViewPager) view.findViewById(R.id.pager);

        mPager.setAdapter(new ImageAdapter(getFragmentManager()));


        UnderlinePageIndicator indicator = (UnderlinePageIndicator)view.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);
        indicator.setFades(false);
        indicator.setSelectedColor(getResources().getColor(R.color.main_color));

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
   /*     ((MainActivity) activity).onSectionAttached(
                getArguments().getBoolean(USE_REST));*/
    }
}



