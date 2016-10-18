package com.bekup_portal.androidlesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListView = (Button) findViewById(R.id.btnMenuListView);
        Button btnRecyclerView = (Button) findViewById(R.id.btnMenuRecycler);
        Button btnSampleGetAPI = (Button) findViewById(R.id.btnSampleGetAPI);
        Button btnSampleGetAPI2 = (Button) findViewById(R.id.btnSampleGetAPI2);
        btnListView.setOnClickListener(this);
        btnRecyclerView.setOnClickListener(this);
        btnSampleGetAPI.setOnClickListener(this);
        btnSampleGetAPI2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnMenuListView:
                intent = new Intent(this, ListViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMenuRecycler:
                intent = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSampleGetAPI:
                intent = new Intent(this, GetObjectActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSampleGetAPI2:
                intent = new Intent(this, GetListObjectActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
