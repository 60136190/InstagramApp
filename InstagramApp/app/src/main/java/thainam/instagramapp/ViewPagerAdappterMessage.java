package thainam.instagramapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdappterMessage extends FragmentStatePagerAdapter {
    public ViewPagerAdappterMessage(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AllFragment();
            case 1:
                return new MeetFragment();
            case 2:
                return new WaitMessageFragment();
            default:
                return new AllFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch ( position){
            case 0:
                title= "Tất cả";
                break;
            case 1:
                title= "Phòng họp mặt ";
                break;
            case 2:
                title= "Tin nhắn đang chờ";
                break;
        }
        return title;
    }
}
