package com.example.finishingdicoding;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

//@SuppressLint("ParcelCreator")
public class Player implements Parcelable {
    private String name, photo, position, detail, lahir;


    protected Player(Parcel in) {
        name = in.readString();
        photo = in.readString();
        position = in.readString();
        detail = in.readString();
        lahir = in.readString();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {

            return new Player[size];
        }
    };

    public Player() {

    }


    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo){

        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir){
        this.lahir = lahir;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(photo);
        parcel.writeString(position);
        parcel.writeString(detail);
        parcel.writeString(lahir);
    }
}
