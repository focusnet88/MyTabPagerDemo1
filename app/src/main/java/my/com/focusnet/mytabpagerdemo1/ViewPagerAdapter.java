package my.com.focusnet.mytabpagerdemo1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by Edmund on 7/23/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTatles = new ArrayList<>();

    public void addFragments(Fragment fragments, String titles){
        this.fragments.add(fragments);
        this.tabTatles.add(titles);
    }

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public CharSequence getPageTitle(int position){
        return tabTatles.get(position);
    }
}
