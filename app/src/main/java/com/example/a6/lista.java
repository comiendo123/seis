package com.example.a6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class lista extends AppCompatActivity {
    private ArrayList<modela> listdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        loadComponets();
    }

    private void loadComponets() {
        ListView list = findViewById(R.id.listview);


        listdata = new ArrayList<>();

        String[] titles = new String[]{"ARIA", "CENTOS", "Diaria", "Malechor", "Users"};
        String[] descrip = new String[]{"", "2", "3", "4", "5"};

        for (int i = 0; i <titles.length; i++) {
            modela info = new modela();
            info.setTitle(titles[i]);
            info.setDescripcion(descrip[i]);
            listdata.add(info);

        }

        /*ArrayList<String> datoslist = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            datoslist.add("Item" +i);

        }*/
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datoslist);

        adaptador adapter = new adaptador(this, listdata);

        list.setAdapter(adapter);
        // list.setOnItemClickListener(this);
    }


}

