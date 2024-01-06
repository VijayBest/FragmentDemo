package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

import com.example.fragmentdemo.fragment.FragmentFirst;
import com.example.fragmentdemo.fragment.FragmentSecond;

public class MainActivity extends AppCompatActivity {
    FragmentFirst fragmentFirst;
    AppCompatButton button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();


       // loadFirstFragment();

    }

    private void intiView() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFirstFragment();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadSecondFragment();
            }
        });
    }

    private void loadFirstFragment() {
        fragmentFirst = new FragmentFirst();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout, fragmentFirst)
                .commit();
    }

    private void loadSecondFragment(){
        FragmentSecond fragmentSecond = new FragmentSecond();
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, fragmentSecond).commit();
    }
}