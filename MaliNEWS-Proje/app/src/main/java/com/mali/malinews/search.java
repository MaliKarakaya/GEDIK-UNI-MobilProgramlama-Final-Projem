package com.mali.malinews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class search extends AppCompatActivity  {
    DrawerLayout aciliirmenu;
    private SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        aciliirmenu =(DrawerLayout) this.findViewById(R.id.acilirMenu);

        searchView = findViewById(R.id.search_view);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchOnGoogle(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }
    private void searchOnGoogle(String query) {
        String googleSearchUrl = "https://www.google.com/search?q=" + query;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(googleSearchUrl));
        startActivity(intent);
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
        Intent intent=new Intent(search.this,AnaSayfa.class);
        startActivity(intent);
    }
    public void HaberSearch(View view)
    {
        Intent intent=new Intent(search.this,search.class);
        startActivity(intent);
    }
    public void Oku(View view)
    {
        Intent intent=new Intent(search.this,OkuActivity.class);
        startActivity(intent);
    }
    public void CanliTiklama(View view)
    {
        Intent intent=new Intent(search.this,canliizle.class);
        startActivity(intent);
    }

    public void CikisTiklama(View view)
    {
        AlertDialog.Builder uyariPenceresi = new AlertDialog.Builder(search.this);
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