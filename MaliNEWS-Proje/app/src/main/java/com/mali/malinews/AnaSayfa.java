package com.mali.malinews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AnaSayfa extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);

        imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slider1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slider4, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);



    }




    public  void MenuTikla(View view)
    {
        MenuAc(aciliirmenu);
    }

    public static void MenuAc(DrawerLayout aciliirmenu)
    {
        aciliirmenu.openDrawer(GravityCompat.START);
    }

    public void logotikla(View view)
    {
        MenuKapat(aciliirmenu);
    }

    public static void MenuKapat(DrawerLayout aciliirmenu)
    {
        if (aciliirmenu.isDrawerOpen(GravityCompat.START))
        {
            aciliirmenu.closeDrawer(GravityCompat.START);
        }
    }

    public void AnaSayfaTiklama(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {

        Intent intent=new Intent(AnaSayfa.this,search.class);
        startActivity(intent);
    }
    public void Oku(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,OkuActivity.class);
        startActivity(intent);
    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,canliizle.class);
        startActivity(intent);
    }

    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(AnaSayfa.this);
        uyariPenceresi.setTitle("Çıkış");
        uyariPenceresi.setMessage("Çıkış Yapılsın Mı ?");


        uyariPenceresi.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
                System.exit(0);
            }
        });



        uyariPenceresi.setNegativeButton("HAYIR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        uyariPenceresi.show();
    }









    public void HaberBir(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber1.class);
        startActivity(intent);
    }
    public void HaberIki(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber2.class);
        startActivity(intent);
    }
    public void HaberUc(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber3.class);
        startActivity(intent);
    }
    public void HaberDort(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber4.class);
        startActivity(intent);
    }
    public void HaberBes(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber5.class);
        startActivity(intent);
    }
    public void HaberAlti(View view)
    {
        Intent intent=new Intent(AnaSayfa.this,Haber6.class);
        startActivity(intent);
    }












}


