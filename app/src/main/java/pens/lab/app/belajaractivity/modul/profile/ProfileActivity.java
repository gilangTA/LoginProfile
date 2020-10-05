package pens.lab.app.belajaractivity.modul.profile;

import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;
import pens.lab.app.belajaractivity.modul.login.LoginFragment;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;

    @Override
    protected void initializeFragment() {
        initializeView();
        profileFragment = new ProfileFragment();
        setCurrentFragment(profileFragment, false);
    }
}
