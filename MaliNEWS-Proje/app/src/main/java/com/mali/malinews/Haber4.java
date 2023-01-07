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

public class Haber4 extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber4);
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);
        WebView webview = (WebView) findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.aa.com.tr/tr/ekonomi/inovasyon-birincisi-firma-yerli-tasarim-programina-odaklanacak/2766244");
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
        Intent intent=new Intent(Haber4.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(Haber4.this,search.class);
        startActivity(intent);    }
    public void Oku(View view)
    {
        Intent intent=new Intent(Haber4.this,OkuActivity.class);
        startActivity(intent);    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(Haber4.this,canliizle.class);
        startActivity(intent);

    }
    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(Haber4.this);
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