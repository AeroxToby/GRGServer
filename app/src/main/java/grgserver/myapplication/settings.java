package grgserver.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Aerox on 15.04.2016.
 */
public class settings extends Fragment {

  /*  Button btimp;
    Button btsup;
    Button btae;
    Button btcache;
    Button btasl;
    CheckBox checkBox;*/


    public settings() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
      /*  View rootView = inflater.inflate(R.layout.fragment_settings, container, false);

        btimp = (Button) rootView.findViewById(R.id.btimp);
        btsup = (Button) rootView.findViewById(R.id.btsup);
        btae = (Button) rootView.findViewById(R.id.btae);
        btcache = (Button) rootView.findViewById(R.id.btcache);
        btasl = (Button) rootView.findViewById(R.id.btasl);
        checkBox = (CheckBox) rootView.findViewById(R.id.checkBox);
        return rootView;*/
    }

   /* public void clickbtimp(MenuItem menuItem) {
        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {

            case R.id.nav_settings:
                fragmentClass = Impressum.class;
                break;
            default:
                fragmentClass = settings.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        menuItem.setChecked(true);
    }*/

}
