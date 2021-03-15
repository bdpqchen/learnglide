package com.bdpqchen.learnglide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ImageView iv = findViewById(R.id.iv);
    Glide.load("https://avatars.githubusercontent.com/u/22075571?s=460&u=40ec74aaba883289f5352b6d557287c66eba0253&v=4").into(iv);
  }
}