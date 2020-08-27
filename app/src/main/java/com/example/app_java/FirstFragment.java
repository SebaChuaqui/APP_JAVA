package com.example.app_java;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

class FirstFragment<view> extends Fragment {

    private EditText codigo;
    private Button click;

    public void validaPass(Editable text, String pass){
        Log.d("TAG", pass);
        if (pass.equals("123Pass")){
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment);


        }

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_firstfragment, container, false);
        codigo = view.findViewById(R.id.textView);
        click = view.findViewById(R.id.boton1);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "INGRESANDO", Toast.LENGTH_SHORT).show();
                validaPass(codigo.getText(),toString());
            }
        });
        return view;
}

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}