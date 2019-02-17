package com.main.weggies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import static com.main.weggies.MainActivity.BUDGET;
import static com.main.weggies.MainActivity.HOUSEHOLD;
import static com.main.weggies.MainActivity.STORE;

public class SetPreferences extends AppCompatActivity {

    boolean cornFree;
    boolean antibioticFree;
    boolean glutenFree;
    boolean certifiedHumane;
    boolean nutFree;
    boolean vegan;
    boolean vegetarian;
    boolean msgFree;

    public boolean isCornFree() {
        return cornFree;
    }

    public boolean isAntibioticFree() {
        return antibioticFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public boolean isCertifiedHumane() {
        return certifiedHumane;
    }

    public boolean isNutFree() {
        return nutFree;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public boolean isMsgFree() {
        return msgFree;
    }

    public boolean isHormoneFree() {
        return hormoneFree;
    }

    @Override
    public Intent getIntent() {
        return intent;
    }

    public float getBudget() {
        return budget;
    }

    public int getHousehold() {
        return household;
    }

    public int getStore() {
        return store;
    }

    boolean hormoneFree;

    Intent intent = getIntent();
    float budget = intent.getFloatExtra(BUDGET, 0);
    int household = intent.getIntExtra(HOUSEHOLD, 0);
    int store = intent.getIntExtra(STORE, 0 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_preferences);
    }

    public void proceed(){
        Intent next = new Intent(this, RecipeSelectActivity.class);

        next.putExtra(BUDGET, budget);
        next.putExtra(HOUSEHOLD, household);
        next.putExtra(STORE, store);

        startActivity(next);


    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.antibioticFree:
                if (checked){
                    antibioticFree = true;
                }
                else {
                    antibioticFree = false;
                }
            case R.id.certifiedHumane:
                if (checked){
                    certifiedHumane = true;
                }
                else{
                    certifiedHumane = false;
                }
            case R.id.cornFree:
                if (checked){
                    cornFree = true;
                }
                else{
                    cornFree = false;
                }
            case R.id.glutenFree:
                if (checked){
                    glutenFree = true;
                }
                else{
                    glutenFree = false;
                }
            case R.id.msgFree:
                if (checked){
                    msgFree = true;
                }
                else{
                    msgFree = false;
                }
            case R.id.nutFree:
                if (checked){
                    nutFree = true;
                }
                else{
                    nutFree = false;
                }
            case R.id.vegan:
                if (checked){
                    vegan = true;
                    vegetarian = true;
                }
                else{
                    vegan = false;
                }
            case R.id.vegitarian:
                if (checked){
                    vegetarian = true;
                }
                else{
                    vegetarian = false;
                    vegan = false;
                }
            case R.id.hormoneFree:
                hormoneFree = checked;

        }


    }
}
