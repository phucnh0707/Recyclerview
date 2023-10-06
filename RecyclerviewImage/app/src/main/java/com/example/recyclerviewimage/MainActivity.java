package com.example.recyclerviewimage;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvImg;
    private ImageAdapter imgAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvImg = findViewById(R.id.rcv_img);
        imgAdapter = new ImageAdapter(this,getListImg());

        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvImg.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcvImg.addItemDecoration(itemDecoration);

        rcvImg.setAdapter(imgAdapter);
    }

    private List<Image> getListImg() {
        List<Image> list = new ArrayList<>();
        list.add(new Image(R.drawable.a,"Image 1"));
        list.add(new Image(R.drawable.b,"Image 2"));
        list.add(new Image(R.drawable.c,"Image 3"));
        list.add(new Image(R.drawable.d,"Image 4"));
        list.add(new Image(R.drawable.a,"Image 1"));
        list.add(new Image(R.drawable.b,"Image 2"));
        list.add(new Image(R.drawable.c,"Image 3"));
        list.add(new Image(R.drawable.d,"Image 4"));
        return list;
    }


}