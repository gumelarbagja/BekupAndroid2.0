package com.bekup.materialtabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.bekup.materialtabs.R;
import com.bekup.materialtabs.fragment.EightFragment;
import com.bekup.materialtabs.fragment.FiveFragment;
import com.bekup.materialtabs.fragment.FourFragment;
import com.bekup.materialtabs.fragment.NineFragment;
import com.bekup.materialtabs.fragment.OneFragment;
import com.bekup.materialtabs.fragment.SevenFragment;
import com.bekup.materialtabs.fragment.SixFragment;
import com.bekup.materialtabs.fragment.TenFragment;
import com.bekup.materialtabs.fragment.ThreeFragment;
import com.bekup.materialtabs.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class ScrollableTabsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "ONE");
        adapter.addFrag(new TwoFragment(), "TWO");
        adapter.addFrag(new ThreeFragment(), "THREE");
        adapter.addFrag(new FourFragment(), "FOUR");
        adapter.addFrag(new FiveFragment(), "FIVE");
        adapter.addFrag(new SixFragment(), "SIX");
        adapter.addFrag(new SevenFragment(), "SEVEN");
        adapter.addFrag(new EightFragment(), "EIGHT");
        adapter.addFrag(new NineFragment(), "NINE");
        adapter.addFrag(new TenFragment(), "TEN");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
