package assignment.fragment.rsantosh.com.tabs;

import android.os.Build;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import assignment.fragment.rsantosh.com.tabs.Adapter.TabsAdapter;


public class MainActivity extends AppCompatActivity implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
    private ViewPager mViewPager;
    private String[] mTabNames = {"Audio", "Video"};
    private Integer[] mTabImages = {R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private android.support.v7.app.ActionBar mActionBar;
    private TabsAdapter mTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.tab_view_pager);
        mActionBar = getSupportActionBar();
        mTabsAdapter= new TabsAdapter(getSupportFragmentManager(),mTabNames);
        mViewPager.setAdapter(mTabsAdapter);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            mActionBar.setHomeButtonEnabled(true);
        }

        mActionBar.setNavigationMode(android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS);

        int i =0;
        for(String TabName:mTabNames){

            mActionBar.addTab(mActionBar.newTab().setText(TabName).setTabListener(this).setIcon(mTabImages[i]));

            i++;

        }

        mViewPager.setOnPageChangeListener(this);

    }
    @Override
    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

        mViewPager.setCurrentItem(tab.getPosition());

    }

    @Override
    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        mActionBar.setSelectedNavigationItem(position);

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
