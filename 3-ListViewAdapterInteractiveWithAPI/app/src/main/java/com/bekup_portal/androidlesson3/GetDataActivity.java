package com.bekup_portal.androidlesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bekup_portal.androidlesson3.models.Movie;

public class GetDataActivity extends AppCompatActivity {

    public static String ARG_TITLE  = "IntentGetData.TITLE";
    public static String ARG_OBJECT  = "IntentGetData.OBJECT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_getdata_activity);

        TextView textView = (TextView) findViewById(R.id.tvName);

        //String dataString = getIntent().getStringExtra(ARG_TITLE);
        Movie movie = getIntent().getParcelableExtra(ARG_OBJECT);
        textView.setText(movie.getGenre());



    }
}
