package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import pens.lab.app.belajaractivity.R;
import pens.lab.app.belajaractivity.base.BaseFragment;


/**
 * Created by fahrul on 13/03/19.
 */

public class ProfileFragment extends BaseFragment<ProfileActivity, ProfileContract.Presenter> implements ProfileContract.View {

    String email;
    String passwd;

    public ProfileFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        fragmentView = inflater.inflate(R.layout.fragment_profile, container, false);
        mPresenter = new ProfilePresenter(this);
        mPresenter.start();

        TextView etEmail = (TextView) fragmentView.findViewById(R.id.usernameField);
        TextView etPassword = (TextView) fragmentView.findViewById(R.id.passwordField);

        Intent intent = getActivity().getIntent();
        email = intent.getStringExtra("username");
        passwd = intent.getStringExtra("password");
        etEmail.setText(email);
        etPassword.setText(passwd);

        setTitle("Profile");
        return fragmentView;
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {

    }

    @Override
    public void redirectToProfile() {

    }
}

