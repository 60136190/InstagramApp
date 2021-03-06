package thainam.instagramapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Message extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager_message);

        ViewPagerAdappterMessage viewPagerAdappterMessage = new ViewPagerAdappterMessage(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdappterMessage);
        tabLayout.setupWithViewPager(viewPager);
    }
}