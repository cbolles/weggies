package com.main.weggies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class SetPreferences extends AppCompatActivity {

    boolean cornFree;
    boolean antibioticFree;
    boolean glutenFree;
    boolean certifiedHumane;
    boolean nutFree;
    boolean vegan;
    boolean vegetarian;
    boolean msgFree;
    boolean hormoneFree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_preferences);
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
