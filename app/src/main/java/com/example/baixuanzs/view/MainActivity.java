package com.example.baixuanzs.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = (TextView) findViewById(R.id.txt);
        view.setText("changge");

        Button bt = (Button) findViewById(R.id.button);

        bt.setText("click");
        bt.setBackground(getDrawable(R.mipmap.ic_launcher_round));
    }
}
