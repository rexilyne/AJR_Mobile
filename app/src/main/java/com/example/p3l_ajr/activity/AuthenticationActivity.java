package com.example.p3l_ajr.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;

import com.example.p3l_ajr.R;

public class AuthenticationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FirebaseMessaging.getInstance().subscribeToTopic("tubesPBP");
        setContentView(R.layout.activity_authentication);

        getSupportActionBar().hide();


    }

    //  Method untuk mengubah fragment
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_auth_frag,fragment)
//                .addToBackStack(null)
                .commit();
    }

//    @Override
//    public void onBackPressed() {
//        FragmentManager fm = getSupportFragmentManager();
//        if (fm.getBackStackEntryCount() > 0) {
//            fm.popBackStack();
//        } else {
//            super.onBackPressed();
//        }
//    }

}