package com.klgleb.forkudago;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
   /*     ((MainActivity) activity).onSectionAttached(
                getArguments().getBoolean(USE_REST));*/
    }
}



