package pcamov01cv.healthfood.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import pcamov01cv.healthfood.R;
import pcamov01cv.healthfood.fragment.CafeteriaFragment;
import pcamov01cv.healthfood.fragment.HeladeriaFragment;
import pcamov01cv.healthfood.fragment.OrganicosFragment;

public class VerProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_productos);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.navi_cafeteria);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.navi_cafeteria:
                        CafeteriaFragment cafeteriaFragment = new CafeteriaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, cafeteriaFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                        break;
                    case R.id.navi_heladeria:
                        HeladeriaFragment heladeriaFragment = new HeladeriaFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, heladeriaFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.navi_organicos:
                        OrganicosFragment organicosFragment = new OrganicosFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, organicosFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                }
            }
        });

    }
}