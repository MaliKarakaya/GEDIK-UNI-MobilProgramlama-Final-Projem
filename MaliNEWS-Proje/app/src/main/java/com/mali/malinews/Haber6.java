package com.mali.malinews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Haber6 extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber6);
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.aa.com.tr/tr/bilim-teknoloji/james-webb-uzay-teleskobu-pirlanta-gibi-parlayan-yeni-bir-galaksi-goruntuledi/2764387");

    }
    public void MenuTikla(View view)
    {
        MenuAc(aciliirmenu);

    }
    public void MenuAc(DrawerLayout aciliirmenu)
    {
        aciliirmenu.openDrawer(GravityCompat.START);

    }
    public void logotikla(View view)
    {
        MenuKapat(aciliirmenu);

    }
    public void MenuKapat(DrawerLayout aciliirmenu)
    {
        if (aciliirmenu.isDrawerOpen(GravityCompat.START))
        {
            aciliirmenu.closeDrawer(GravityCompat.START);
        }
    }
    public void AnaSayfaTiklama(View view)
    {
        Intent intent=new Intent(Haber6.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(Haber6.this,search.class);
        startActivity(intent);    }
    public void Oku(View view)
    {
        Intent intent=new Intent(Haber6.this,OkuActivity.class);
        startActivity(intent);    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(Haber6.this,canliizle.class);
        startActivity(intent);

    }
    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(Haber6.this);
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