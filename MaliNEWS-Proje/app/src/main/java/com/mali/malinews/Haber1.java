package com.mali.malinews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Haber1 extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber1);
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
        Intent intent=new Intent(Haber1.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(Haber1.this,search.class);
        startActivity(intent);
    }
    public void Oku(View view)
    {
        Intent intent=new Intent(Haber1.this,OkuActivity.class);
        startActivity(intent);
    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(Haber1.this,canliizle.class);
        startActivity(intent);
    }

    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(Haber1.this);
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
}