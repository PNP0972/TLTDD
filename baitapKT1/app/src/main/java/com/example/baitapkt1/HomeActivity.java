package com.example.baitapkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListView listView;
        ArrayList<SingerActivity> arrayList;
        AdapterActivity adapter;

        listView = findViewById(R.id.listviewSingers);
        arrayList = new ArrayList<>();
        arrayList.add(new SingerActivity(R.drawable.congan1,"Phạm Ngọc Phục","Đại Tướng","Việt Nam","10"));
        arrayList.add(new SingerActivity(R.drawable.congan2,"Tố Hữu","Đại Tá","Việt Nam","7"));

        adapter = new AdapterActivity(HomeActivity.this,R.layout.activity_singer,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this,SingerActivity2.class);
                    startActivity(intent );

                }
                if(i==1){
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this,SingerActivity3.class);
                    startActivity(intent );

                }
            }
        });
    }

}