package com.skensa.carisekolah.sekolahku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;
import com.skensa.carisekolah.sekolahku.Adapter.ExpandableListAdapter;

public class matapelajaran extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matapelajaran);
        Toolbar mytoolbar = (Toolbar) findViewById(R.id.toolbar);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("SENIN");
        listDataHeader.add("SELASA");
        listDataHeader.add("RABU");
        listDataHeader.add("KAMIS");
        listDataHeader.add("JUMAT");
        listDataHeader.add("SABTU");

        // Adding child data
        List<String> SENIN = new ArrayList<String>();
        SENIN.add("Pemrograman Web");
        SENIN.add("Grafika Komputer");

        List<String> SELASA = new ArrayList<String>();
        SELASA.add("Kerja Proyek");
        SELASA.add("Basis Data");

        List<String> RABU = new ArrayList<String>();
        RABU.add("Administrasi BD");
        RABU.add("Mobile Apps");

        List<String> KAMIS = new ArrayList<String>();
        KAMIS.add("Matematika");
        KAMIS.add("Bahasa Indonesia");

        List<String> JUMAT = new ArrayList<String>();
        JUMAT.add("Seni Budaya");
        JUMAT.add("Sejarah");
        JUMAT.add("Bahasa Inggris");
        JUMAT.add("PPKN");

        List<String> SABTU = new ArrayList<String>();
        SABTU.add("Bahasa Bali");
        SABTU.add("Kewirausahaan");
        SABTU.add("Agama");
        SABTU.add("Penjas");


        listDataChild.put(listDataHeader.get(0), SENIN); // Header, Child data
        listDataChild.put(listDataHeader.get(1), SELASA);
        listDataChild.put(listDataHeader.get(2), RABU);
        listDataChild.put(listDataHeader.get(3), KAMIS);
        listDataChild.put(listDataHeader.get(4), JUMAT);
        listDataChild.put(listDataHeader.get(5), SABTU);
    }


}