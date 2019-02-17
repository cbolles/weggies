package com.main.weggies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
//import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent secondIntent = getIntent();

        String message = "Selected recipe is: " + secondIntent.getStringExtra("RECIPE_SELECTED");

        TextView myText = (TextView) findViewById(R.id.textView6);

        myText.setText(message);

        ImageView imgView = (ImageView) findViewById(R.id.imgView);

        String url = "http://i.imgur.com/DvpvklR.png"; //TODO INSERT HOWEVER U GETTING DAT URL THO
        //Picasso.with(null).load(url).into(imgView);
    }
}
