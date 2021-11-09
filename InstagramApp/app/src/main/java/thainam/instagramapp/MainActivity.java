package thainam.instagramapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mnavigationView;
    private ViewPager mviewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnavigationView = findViewById(R.id.bottom_nav);
        mviewPager = findViewById(R.id.view_pager);
        setUpViewPager();

        mnavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        mviewPager.setCurrentItem(0);
                        break;
                    case R.id.action_search:
                        mviewPager.setCurrentItem(1);
                        break;
                    case R.id.action_video:
                        mviewPager.setCurrentItem(2);
                        break;
                    case R.id.action_heart:
                        mviewPager.setCurrentItem(3);
                        break;
                    case R.id.action_profile:
                        mviewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
    }
    private void setUpViewPager(){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(viewPagerAdapter);

        mviewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position){
                    case 0:
                        mnavigationView.getMenu().findItem(R.id.action_home).setChecked(true);
                        break;
                    case 1:
                        mnavigationView.getMenu().findItem(R.id.action_search).setChecked(true);
                        break;
                    case 2:
                        mnavigationView.getMenu().findItem(R.id.action_video).setChecked(true);
                        break;
                    case 3:
                        mnavigationView.getMenu().findItem(R.id.action_heart).setChecked(true);
                        break;
                    case 4:
                        mnavigationView.getMenu().findItem(R.id.action_profile).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}