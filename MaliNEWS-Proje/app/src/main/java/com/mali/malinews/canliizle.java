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
import android.webkit.WebViewClient;
import android.widget.Toast;

public class canliizle extends AppCompatActivity {
    DrawerLayout aciliirmenu;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canliizle);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.cnnturk.com/canli-yayin");
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);

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
        Intent intent=new Intent(canliizle.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(canliizle.this,search.class);
        startActivity(intent);    }
    public void Oku(View view)
    {
        Intent intent=new Intent(canliizle.this,OkuActivity.class);
        startActivity(intent);    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(canliizle.this,canliizle.class);
        startActivity(intent);

    }
    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(canliizle.this);
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