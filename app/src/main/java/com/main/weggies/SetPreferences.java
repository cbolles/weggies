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
    boolean radiationFree;
    boolean certifiedHumane;
    boolean fair;
    boolean wild;
    boolean lactovovegetarian;
    boolean msgFree;
    boolean hormoneFree;

    public boolean isCornFree() {
        return cornFree;
    }

    public boolean isAntibioticFree() {
        return antibioticFree;
    }

    public boolean isRadiationFree() {
        return radiationFree;
    }

    public boolean isCertifiedHumane() {
        return certifiedHumane;
    }

    public boolean isFair() {
        return fair;
    }

    public boolean isWild() {
        return wild;
    }

    public boolean isLactovovegetarian() {
        return lactovovegetarian;
    }

    public boolean isMsgFree() {
        return msgFree;
    }

    public boolean isHormoneFree() {
        return hormoneFree;
    }

    public void onCheckboxClicked(View view){
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.antibioticFree:
                antibioticFree = checked;
            case R.id.certifiedHumane:
                certifiedHumane = checked;
            case R.id.cornFree:
                cornFree = checked;
            case R.id.fair:
                fair = checked;
            case R.id.hormoneFree:
                hormoneFree = checked;
            case R.id.irradiated:
                radiationFree = checked;
            case R.id.lactovovegitarian:
                lactovovegetarian = checked;
            case R.id.msgFree:
                msgFree = checked;
            case R.id.wild:
                wild = checked;
        }

    }


    public void proceed(){
        Intent prev = getIntent();
        Intent next = new Intent(this, recipeSelectActivity.class);

        next.putExtra(HOUSEHOLD, prev.getIntExtra(HOUSEHOLD, 0));
        next.putExtra(BUDGET, prev.getFloatExtra(BUDGET, 0));
        next.putExtra(STORE, prev.getIntExtra(STORE, 0));

        startActivity(next);
    }
}
