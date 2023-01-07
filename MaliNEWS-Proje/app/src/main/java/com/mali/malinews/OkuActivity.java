package com.mali.malinews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OkuActivity extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oku);
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
        Intent intent=new Intent(OkuActivity.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(OkuActivity.this,search.class);
        startActivity(intent);
    }
    public void Oku(View view)
    {
        Intent intent=new Intent(OkuActivity.this,OkuActivity.class);
        startActivity(intent);
    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(OkuActivity.this,canliizle.class);
        startActivity(intent);
    }
    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(OkuActivity.this);
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
        Intent intent=new Intent(OkuActivity.this,Haber1.class);
        startActivity(intent);
    }
    public void HaberIki(View view)
    {
        Intent intent=new Intent(OkuActivity.this,Haber2.class);
        startActivity(intent);
    }
    public void HaberUc(View view)
    {
        Intent intent=new Intent(OkuActivity.this,Haber3.class);
        startActivity(intent);
    }
    public void HaberDort(View view)
    {
        Intent intent=new Intent(OkuActivity.this,Haber4.class);
        startActivity(intent);
    }
    public void HaberBes(View view)
    {
        Intent intent=new Intent(OkuActivity.this,Haber5.class);
        startActivity(intent);
    }
    public void HaberAlti(View view)
    {
        Intent intent=new Intent(OkuActivity.this,Haber6.class);
        startActivity(intent);
    }

}