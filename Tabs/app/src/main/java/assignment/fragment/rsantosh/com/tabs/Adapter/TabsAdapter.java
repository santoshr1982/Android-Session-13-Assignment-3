package assignment.fragment.rsantosh.com.tabs.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

import assignment.fragment.rsantosh.com.tabs.Fragment.Audio;
import assignment.fragment.rsantosh.com.tabs.Fragment.Video;

/**
 * Created by C S Ramachandran on 25-08-2016.
 */
public class TabsAdapter extends FragmentPagerAdapter {

   private String[] mTabName;

    public TabsAdapter(FragmentManager fm, String[] TabName) {
        super(fm);

        this.mTabName = TabName;
    }

    @Override
    public Fragment getItem(int position) {

        Log.e("tab", String.valueOf(position));

        switch (position) {

            case 0:
                return new Audio();

            case 1:
                return new Video();

            //default:
            //return new Audio();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mTabName.length;
    }
}
