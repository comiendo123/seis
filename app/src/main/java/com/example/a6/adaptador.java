package com.example.a6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador extends BaseAdapter {
  //  LinearLayout relativeLayout;
    private Context context;
    private ArrayList<modela> list;

    public adaptador(Context context, ArrayList<modela> list) {
        this.context = context;
        this.list = list;

    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflate = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflate.inflate(R.layout.item, null);
        }

        TextView des = convertView.findViewById(R.id.descripcion);
        TextView title = convertView.findViewById(R.id.nombre);
  //      relativeLayout= convertView.findViewById(R.id.nombre);
       des.setText(this.list.get(position).getDescripcion());
        title.setText(this.list.get(position).getTitle());
        //
     /*   relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context,descripcion_articulo.class);
                intent.putExtra("img",list.get(position).getImg());
                intent.putExtra("descripcion",list.get(position).getDescripcion());
                intent.putExtra("title",list.get(position).getTitle());
                context.startActivity(intent);
            }
        });*/
        return convertView;
    }
}
