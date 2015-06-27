package com.klgleb.forkudago;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by klgleb on 27.06.15.
 * <p/>
 * Fragment that contains images (from drawable).
 */
public class ImageFragment extends Fragment {

    public static final String IMAGE_NUM = "image_num";

    public static ImageFragment newInstance(int imageNum) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt(IMAGE_NUM, imageNum);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageView view = (ImageView) inflater.inflate(R.layout.fragment_image, container, false);

        int[] arr = {R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4,
                R.drawable.img5};

        view.setImageResource(arr[getArguments().getInt(IMAGE_NUM)]);



        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
   /*     ((MainActivity) activity).onSectionAttached(
                getArguments().getBoolean(USE_REST));*/
    }
}



