package com.example.cvt;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.cvt.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {

    EditText textInputEditTextFirstName, textInputEditTextLastName, textInputEditTextEmail, textInputEditTextPassword, textInputEditTextPasswordCheck;
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState


    ) {


        binding= FragmentSecondBinding.inflate(inflater, container, false);
        textInputEditTextFirstName = findViewById(R.id.firstName);
        textInputEditTextLastName = findViewById(R.id.lastName);
        textInputEditTextEmail = findViewById(R.id.registerEmail);
        textInputEditTextPassword = findViewById(R.id.password);
        textInputEditTextPasswordCheck = findViewById(R.id.passwordConfirm);
        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
        binding.registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String firstName, lastName, email, password, passwordCheck;


            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}