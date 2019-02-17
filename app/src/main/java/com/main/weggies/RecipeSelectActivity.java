package com.main.weggies.searchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;

import com.main.weggies.R;

import java.util.ArrayList;
import java.util.List;

public class RecipeSelectActivity extends AppCompatActivity {


    ActivityMainBinding activityMainBinding;
    ListAdapter adapter;

    List<String> arrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_select);
    }
}
