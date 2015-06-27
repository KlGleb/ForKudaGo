package com.klgleb.forkudago;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by klgleb on 27.06.15.
 *
 * Adapter for ViewPager (for ImageFragment)
 */
public class ImageAdapter extends FragmentPagerAdapter {
    public ImageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return ImageFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return 5;
    }


}
