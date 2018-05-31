package com.example.per6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    List<String> dataset = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dataset.add("one");
        dataset.add("two");
        dataset.add("three");
        dataset.add("four");
        dataset.add("one");
        dataset.add("two");
        dataset.add("three");
        dataset.add("four");
        dataset.add("one");
        dataset.add("two");
        dataset.add("three");
        dataset.add("four");
        dataset.add("one");
        dataset.add("two");
        dataset.add("three");
        dataset.add("four");
        dataset.add("one");
        dataset.add("two");
        dataset.add("three");
        dataset.add("four");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);




        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(dataset);
        mRecyclerView.setAdapter(mAdapter);

    }
}
// ...
