package com.example.finishingdicoding;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlayers;
    private ArrayList<Player> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvPlayers = (RecyclerView)findViewById(R.id.rv_players);
        rvPlayers.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(PlayerData.getListData());
        showRecyledCardView();
    }

    private void showRecyledCardView() {
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlayerAdapter cardViewPlayer = new CardViewPlayerAdapter(this);
        cardViewPlayer.setListPlayer(list);
        rvPlayers.setAdapter(cardViewPlayer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.account){
            Intent moveIntent = new Intent(MainActivity.this, About.class);
            startActivity(moveIntent);
        }

        return super.onOptionsItemSelected(item);
    }

}
