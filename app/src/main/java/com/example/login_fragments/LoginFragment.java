package com.example.login_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LoginFragment extends Fragment {

    private SignUpFragment signUpFragment;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


           View view = inflater.inflate(R.layout.fragment_login, container, false);

           signUpFragment = new SignUpFragment();
           Button signup = view.findViewById(R.id.signup);

           signup.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {

                   FragmentManager fm = getFragmentManager();
                   FragmentTransaction fragmentTransaction = fm.beginTransaction();
                   fragmentTransaction.replace(R.id.fragment_container,signUpFragment);
                   fragmentTransaction.commit();
               }
           });

           return view;
    }
}