package com.main.weggies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent secondIntent = getIntent();

        String message = "Selected recipe is: " + secondIntent.getStringExtra("RECIPE_SELECTED");

        TextView myText = (TextView) findViewById(R.id.textView);

        myText.setText(message);

        String url = "http://i.imgur.com/DvpvklR.png";
        Picasso.with(myActivity).load(url).into(imgView);
    }
}
