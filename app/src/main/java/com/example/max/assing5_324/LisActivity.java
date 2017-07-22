package com.example.max.assing5_324;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LisActivity extends AppCompatActivity {

    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lis);

        tvShow = (TextView) findViewById(R.id.tvShow);
        String name = getIntent().getExtras().getString("KEY");
        tvShow.setText(name);


    }
}
