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
        btnListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMenuListView:
                Intent intent = new Intent(this, ListViewActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
