package com.skensa.carisekolah.sekolahku;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.mikepenz.materialdrawer.util.AbstractDrawerImageLoader;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;

import com.squareup.picasso.Picasso;

public class home_siswa extends AppCompatActivity {
    private Drawer result = null;
    Button mapel,ekstra,kisi,toko,pelayanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_siswa);
        Toolbar mytoolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        DrawerImageLoader.init(new AbstractDrawerImageLoader() {
            @Override
            public void set(ImageView imageView, Uri uri, Drawable placeholder) {
                Picasso.with(imageView.getContext()).load(uri).placeholder(placeholder).into(imageView);
            }

            @Override
            public void cancel(ImageView imageView) {
                Picasso.with(imageView.getContext()).cancelRequest(imageView);
            }
        });

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withIcon(getResources().getDrawable(R.drawable.ic_dashboard_black_24dp)).withName("Beranda");
        SecondaryDrawerItem item2 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(2).withIcon(getResources().getDrawable(R.drawable.ic_pengumuman)).withName("Pengumuman");
        SecondaryDrawerItem item3 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(3).withIcon(getResources().getDrawable(R.drawable.ic_tugas)).withName("Tugas");
        SecondaryDrawerItem item4 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(4).withIcon(getResources().getDrawable(R.drawable.ic_person_black_24dp)).withName("Akun Saya");
        SecondaryDrawerItem item5 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(5).withName("Keluar");

        AccountHeader headerprofil = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.color.colorPrimaryDark)
                .addProfiles(
                        new ProfileDrawerItem()
                                .withName("Siswa")
                                .withEmail("email@siswa.domain")
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        return false;
                    }
                })
                .build();

        result = new DrawerBuilder()
                .withAccountHeader(headerprofil)
                .withActivity(this)
                .withToolbar(mytoolbar)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        new DividerDrawerItem(),
                        item3,
                        new DividerDrawerItem(),
                        item4,
                        new DividerDrawerItem(),
                        item5,
                        new DividerDrawerItem()
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if (drawerItem.getIdentifier() == 1){

                        }
                        else if (drawerItem.getIdentifier() == 2){

                        }
                        else if (drawerItem.getIdentifier() == 3){

                        }
                        else if(drawerItem.getIdentifier() == 4){

                        }
                        else if (drawerItem.getIdentifier() == 5){

                        }
                        return false;
                    }
                })
                .build();

        result.getActionBarDrawerToggle().setDrawerIndicatorEnabled(true);
        layoutitem();
        mapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent matapelajaran = new Intent(getApplicationContext(), matapelajaran.class);
                startActivity(matapelajaran);
            }
        });
        Button nilaibtn = (Button) findViewById(R.id.nilai);
        nilaibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nilaiform = new Intent(getApplicationContext(),nilai_menu.class);
                startActivity(nilaiform);
            }
        });
    }
    public void layoutitem(){
        mapel = (Button) findViewById(R.id.mapel);
        ekstra = (Button) findViewById(R.id.ekstrakulikuler);
        kisi = (Button) findViewById(R.id.kisikisi);
        toko = (Button) findViewById(R.id.toko);
        pelayanan = (Button) findViewById(R.id.pelayanan);
    }
}
