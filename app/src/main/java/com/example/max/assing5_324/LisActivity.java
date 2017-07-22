package com.example.max.assing5_324;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LisActivity extends AppCompatActivity {

    TextView tvShow;
    ListView lvMenu;
    String data[] = {"walani","wigfrid","wilson","wolfgang","woodie"};
    int img[] = {R.drawable.walani,R.drawable.wigfrid,R.drawable.wilson,R.drawable.wolfgang,R.drawable.woodie};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lis);

        tvShow = (TextView) findViewById(R.id.tvShow);
        lvMenu = (ListView) findViewById(R.id.lvMenu);

        MyAdapter adapter = new MyAdapter(data, img, getApplicationContext());
        lvMenu.setAdapter(adapter);

        String name = getIntent().getExtras().getString("KEY");
        tvShow.setText(name);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),""+view,Toast.LENGTH_LONG).show();

                if (i == 0) {

                    Intent show = new Intent(view.getContext(), ShowActivity.class);
                    startActivity(show);
                }

            }
        });


    }
}
