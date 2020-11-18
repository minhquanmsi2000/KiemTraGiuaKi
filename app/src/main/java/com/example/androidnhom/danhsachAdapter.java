package com.example.androidnhom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class danhsachAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<danhsach> arraydanhsach;
    public danhsachAdapter(Context context, int layout, List<danhsach> danhsachList){
        myContext=context;
        myLayout=   layout;
        arraydanhsach= danhsachList;
    }


    @Override
    public int getCount() {

        return arraydanhsach.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout, null);



        //Ánh xạ và gán giá trị
        TextView txNoiDung = (TextView) convertView.findViewById(R.id.txNoiDung);
        txNoiDung.setText(arraydanhsach.get(position).Noidung);
        TextView txNoiDung1= (TextView) convertView.findViewById(R.id.txNoiDung1);
        txNoiDung1.setText(arraydanhsach.get(position).Noidung1);
        TextView txNoiDung2= (TextView) convertView.findViewById(R.id.txNoiDung2);
        txNoiDung1.setText(arraydanhsach.get(position).Noidung2);
        ImageView anh= (ImageView) convertView.findViewById(R.id.anh);
        anh.setImageResource(arraydanhsach.get(position).Anh);

        return convertView;
    }
}
