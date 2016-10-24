package com.bekup_portal.androidlesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    private String[] mData = {"bandung", "medan", "tangerang", "malang", "makassar", "jakarta"};
    private ArrayAdapter<String> mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView = (ListView) findViewById(R.id.list_view);
        mArrayAdapter = new ArrayAdapter<>(this, R.layout.item_simple, R.id.tvName, mData);

        listView.setAdapter(mArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListViewActivity.this, GetDataActivity.class);
                intent.putExtra(GetDataActivity.ARG_TITLE, mData[position]);
                startActivity(intent);

                Toast.makeText(ListViewActivity.this, mData[position] + " clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
