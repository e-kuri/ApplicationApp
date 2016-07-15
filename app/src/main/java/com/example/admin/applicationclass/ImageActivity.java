package com.example.admin.applicationclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        iv = ((ImageView) findViewById(R.id.imageView));
        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(iv);
    }
}
