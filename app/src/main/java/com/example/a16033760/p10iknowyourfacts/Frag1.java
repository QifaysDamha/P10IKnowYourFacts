package com.example.a16033760.p10iknowyourfacts;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    Button btnChangeColor;
    TextView tv;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View Change = inflater.inflate(R.layout.fragment_frag1, container, false);

        btnChangeColor = (Button) Change.findViewById(R.id.btnColor);
        tv = (TextView) Change.findViewById(R.id.tvFact1);

        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int color = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
                Change.setBackgroundColor(color);

            }
        });
        return Change;
    }

}
