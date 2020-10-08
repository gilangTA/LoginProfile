package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;
import pens.lab.app.belajaractivity.modul.login.LoginFragment;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        setCurrentFragment(profileFragment, false);
    }
}
