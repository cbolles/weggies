package com.main.weggies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float budget;
    int household;

    String BUDGET = "com.main.weggies.BUDGET";
    String HOUSEHOLD = "com.main.weggies.HOUSEHOLD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proceed(){
        Intent intent = new Intent(this, ScrollingActivity.class);
        EditText budgetTxt = (EditText)findViewById(R.id.budget);
        EditText householdTxt = (EditText)findViewById(R.id.household);

        int budget = Integer.parseInt(budgetTxt.getText().toString());
        int household = Integer.parseInt(householdTxt.getText().toString());

        intent.putExtra(BUDGET, budget);
        intent.putExtra(HOUSEHOLD, household);

        startActivity(intent);

    }




}
