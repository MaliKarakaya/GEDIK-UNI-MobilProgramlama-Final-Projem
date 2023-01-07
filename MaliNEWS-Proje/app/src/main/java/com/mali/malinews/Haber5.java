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

public class Haber5 extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber5);
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.aa.com.tr/tr/teknofest/teknofest-ten-basvuru-sureci-devam-eden-yarismalara-davet/2765493");

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
        Intent intent=new Intent(Haber5.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(Haber5.this,search.class);
        startActivity(intent);    }
    public void Oku(View view)
    {
        Intent intent=new Intent(Haber5.this,OkuActivity.class);
        startActivity(intent);    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(Haber5.this,canliizle.class);
        startActivity(intent);

    }
    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(Haber5.this);
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