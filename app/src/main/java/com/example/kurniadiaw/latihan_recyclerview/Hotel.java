package com.example.kurniadiaw.latihan_recyclerview;

import android.graphics.drawable.Drawable;

/**
 * Created by Kurniadi A.W on 1/31/2018.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto){
        this.judul= judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

}


