package com.siamsoft.product;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //-------------------for recyclerview--1
    //a list to store all the products1
    List<Product> product1List;

    //the recyclerview
    RecyclerView recyclerView;
//-------------------for recyclerview--1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //--------toolbar--------
        setContentView(R.layout.activity_main);


        //------------FloatingActionButton-----


        // for recycler view--2

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        //initializing the productlist
        product1List = new ArrayList<>();


        //adding some items to our list
        //adding some items to our list
        product1List.add(
                new Product(
                        1,
                        "3 McLaren 570S",
                        "5204cc, 10 cylinders",
                        9.3,
                        700000,
                        R.drawable.aaa)
        );

        product1List.add(
                new Product(
                        2,
                        "4 Mercedes-AMG GT",
                        "2981cc, 6 cylinders",
                        5.3,
                        100000,
                        R.drawable.admf));

        product1List.add(
                new Product(
                        1,
                        "5 BMW i8",
                        "3799cc, 8 cylinders S (£110,500)",
                        8.3,
                        80000,
                        R.drawable.anime));

        product1List.add(
                new Product(
                        1,
                        "3 McLaren 570S",
                        "Mercedes-AMG GT S (£110,500)",
                        8.3,
                        60000,
                        R.drawable.ii));

        //creating recyclerview adapter
        ProductAdapter_1 adapter = new ProductAdapter_1(this, product1List);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        //---------for recycler view--2

    }//slb



}//lb