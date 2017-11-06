package iglobe.apple.com.tabimagetext;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends FragmentActivity {
    BottomBar mbottomBar;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbottomBar = BottomBar.attach(this, savedInstanceState);
        mbottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.Bottombaritemone) {
                    Peoplefragment f = new Peoplefragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.Bottombaritemtwo) {
                    Favouritesfragment f = new Favouritesfragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.Bottombaritemthree) {
                    Phonefragment f = new Phonefragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.Bottombaritemfour) {
                    Settingsfragment f = new Settingsfragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.Bottombaritemfive) {
                    Aboutfragment f = new Aboutfragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }


            }

            public void onMenuTabReSelected(@IdRes int i) {

            }
        });
        mbottomBar.mapColorForTab(0, "#F44336");
        mbottomBar.mapColorForTab(1, "#F44336");
        mbottomBar.mapColorForTab(2, "#F44336");
        mbottomBar.mapColorForTab(3, "#F44336");
        mbottomBar.mapColorForTab(4, "#F44336");

        BottomBarBadge unread;
        unread = mbottomBar.makeBadgeForTabAt(3, "#F44336", 13);
        unread.show();


    }

}
