package com.example.finishingdicoding;

import android.os.Bundle;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_team);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Player playerditerima = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView position = (TextView)findViewById(R.id.tv_item_position);
        TextView detail = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
//

        Glide.with(this).load(playerditerima.getPhoto()).override(350,550).into(gambar);
        name.setText(playerditerima.getName());
        detail.setText(playerditerima.getDetail());
        lahir.setText(playerditerima.getLahir());
        position.setText(playerditerima.getPosition());

        Log.i("photo", playerditerima.getPhoto());
        Log.i("deskripsi", playerditerima.getDetail());
    }


}
