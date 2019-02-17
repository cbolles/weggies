package com.main.weggies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.main.weggies.model.recipe.Recipe;

import java.util.ArrayList;
import java.util.HashMap;

import static android.os.Build.USER;
import static com.main.weggies.KeyCompare.KeyCheck;
import static com.main.weggies.MainActivity.STORE;


public class RecipeSelectActivity extends AppCompatActivity {

    ListView theListView;
    Intent myIntent;
    Intent prev = getIntent();

    int store = prev.getIntExtra(STORE, 0);
    boolean[] userKey = prev.getBooleanArrayExtra(USER);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_select);


        myIntent = new Intent(this, SecondActivity.class);
        theListView = (ListView) findViewById(R.id.listView_dynamic);

        ArrayList<Recipe> myData = getRecipeList(store);

        ArrayAdapter<Recipe> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myData);

        theListView.setAdapter(myAdapter);
        theListView.setOnItemClickListener(listClick);


    }

    public ArrayList<Recipe> getRecipeList(int store){
        HashMap key = RecipeKeyGen.KeyGen(store);
        ArrayList<Recipe> recipeList = new ArrayList<>();
        for(Object restrictions : key.keySet()){
            if(KeyCheck(userKey, (boolean[])restrictions) == true) {
                for(Object recipe : (ArrayList)key.get(restrictions)){
                    recipeList.add((Recipe)recipe);
                }
            }
        }
        return recipeList;
    }

    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {

            String itemValue = (String) theListView.getItemAtPosition(position);

            myIntent.putExtra("RECIPE_SELECTED", itemValue);
        }
    };
}
