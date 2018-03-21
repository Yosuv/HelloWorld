package com.mootou.yosub.testapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yosub on 2018-03-21.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));

        MainAdapter adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        List<String> strList = new ArrayList<>();

        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.add("e");

        adapter.setData(strList);

    }
}
