package com.trilochan.fragmentassigntwo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.trilochan.fragmentassigntwo.fragments.AutomorphicFragment;
import com.trilochan.fragmentassigntwo.fragments.CircleFragment;
import com.trilochan.fragmentassigntwo.fragments.PalendromeFragment;
import com.trilochan.fragmentassigntwo.fragments.ReverseFragment;
import com.trilochan.fragmentassigntwo.fragments.ReverseStringFragment;
import com.trilochan.fragmentassigntwo.fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonSum, buttonCircle, buttonReverse, buttonPalendrome, buttonAutomorphic, buttonReverseString;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment starts

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SumFragment sumFragment = new SumFragment();
        fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        //this is for Sum of any two numbers

        buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    SumFragment sumFragment = new SumFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        //this is to find area of circle

        buttonCircle = findViewById(R.id.btnCircle);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    CircleFragment circleFragment = new CircleFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, circleFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        //This is for reverse
        buttonReverse = findViewById(R.id.btnReverse);
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseFragment reverseFragment = new ReverseFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        //for checking palindrome number or not palindrome number

        buttonPalendrome = findViewById(R.id.btnPalendrome);
        buttonPalendrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    PalendromeFragment palendromeFragment = new PalendromeFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, palendromeFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        //for reverse of string eg: abc....

        buttonReverseString = findViewById(R.id.btnRevStr);
        buttonReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseStringFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });


        //for automorphic number checking...

        buttonAutomorphic = findViewById(R.id.btnAuto);
        buttonAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, automorphicFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });
    }
}
