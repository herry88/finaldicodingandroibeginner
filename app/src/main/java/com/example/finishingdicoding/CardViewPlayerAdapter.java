package com.example.finishingdicoding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewPlayerAdapter extends RecyclerView.Adapter<CardViewPlayerAdapter.CardViewHolder> {

    private ArrayList<Player>listPlayer;
    private Context context;
    private Activity activity;

    public CardViewPlayerAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Player> getListPlayer() {
        return listPlayer;
    }

    public void setListPlayer(ArrayList<Player> listPlayer) {
        this.listPlayer = listPlayer;
    }

    @Override
    public CardViewPlayerAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_team, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Player p = getListPlayer().get(position);
        Glide.with(context).load(p.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvname.setText(p.getName());
        holder.tvremarks.setText(p.getPosition());
        holder.player = p;



        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share"+getListPlayer().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListPlayer().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvname, tvremarks;
        Button btndetail, btnsahre;
        Player player;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvname = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvremarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share);
            btndetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailPlayerActivity.class);
            intent.putExtra("key", player);
            context.startActivity(intent);
        }
    }
}
