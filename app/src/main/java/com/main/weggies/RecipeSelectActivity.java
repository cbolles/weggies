package com.main.weggies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class RecipeSelectActivity extends AppCompatActivity {

    ListView theListView;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_select);

        myIntent = new Intent(this, SecondActivity.class);
        theListView = (ListView) findViewById(R.id.myListView);

        String[] myData = {"blah","bleh", "blur"};

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myData);

        theListView.setAdapter(myAdapter);
        theListView.setOnItemClickListener(listClick);


    }

    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {

            String itemValue = (String) theListView.getItemAtPosition(position);

            myIntent.putExtra("RECIPE_SELECTED", itemValue);
        }
    };
}
