package com.example.a6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear=findViewById(R.id.linearLayout);

     linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(String.valueOf(lista.class));
             //   intent.putExtra("img",list.get(position).getImg());
                intent.putExtra("descripcion",list.get(position).getDescripcion());
                intent.putExtra("title",list.get(position).getTitle());
                context.startActivity(intent);
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
  /*  @Override
    public void onClick(View v) {
  /*  switch (v.getId()){
        case R.id.anterior:
            Intent
            break;
        case R.id.anterior:

            break;

        }
    }*/
    }
}
