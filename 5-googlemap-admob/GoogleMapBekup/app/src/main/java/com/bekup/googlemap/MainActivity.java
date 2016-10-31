package com.bekup.googlemap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlain, btnMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlain    = (Button)findViewById(R.id.btnPlan);
        btnMarker   = (Button)findViewById(R.id.btnMarker);


        btnPlain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(k);
            }
        });
    }
}
