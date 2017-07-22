package com.example.max.assing5_324;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    Button btdOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        btdOK = (Button) findViewById(R.id.btdOk);

        btdOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

                Intent lis = new Intent(getApplicationContext(), LisActivity.class);
                lis.putExtra("KEY", name);

                startActivity(lis);

            }
        });

    }
}
