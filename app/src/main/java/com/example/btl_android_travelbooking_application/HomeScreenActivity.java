package com.example.btl_android_travelbooking_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class HomeScreenActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterCat ;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
//        initRecyclerView();
    }
    private void initRecyclerView(){
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("a","Miami0","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic1",true,1000));
        items.add(new PopularDomain("b","Miami1","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic2",true,1000));
        items.add(new PopularDomain("c","Miami2","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic3",true,1000));
        items.add(new PopularDomain("d","Miami3","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic4",true,1000));
        items.add(new PopularDomain("e","Miami4","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic5",true,1000));
        items.add(new PopularDomain("g","Miami5","áđâsdsdfádf56ád5f416á54df654á64df654ádf64á6d4f",2,true,4.8,"pic2",true,1000));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular = new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

        ArrayList<CategoryDomain> catslist = new ArrayList<>();
        catslist.add(new CategoryDomain("1","cat1"));
        catslist.add(new CategoryDomain("2","cat2"));
        catslist.add(new CategoryDomain("3","cat3"));
        catslist.add(new CategoryDomain("4","cat4"));
        catslist.add(new CategoryDomain("5","cat5"));

        recyclerViewCategory = findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterCat = new CategoryAdapter(catslist);
        recyclerViewCategory.setAdapter(adapterCat);
    }
}