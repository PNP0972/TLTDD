package com.example.baitapkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterActivity extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<SingerActivity> arraylist;

    public AdapterActivity(Context context, int layout, List<SingerActivity> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        SingerActivity singerActivity = arraylist.get(i);
        //anhxa
        ImageView imageView = view.findViewById(R.id.imgHinhAnh);
        TextView textV1 = view.findViewById(R.id.ten);
        TextView textV2 = view.findViewById(R.id.ngheDanh);
        TextView textV3 = view.findViewById(R.id.quocGia);
        TextView textV4 = view.findViewById(R.id.soSaoBinhChon);

        imageView.setImageResource(singerActivity.getHinhAnh());
        textV1.setText(singerActivity.getTen());
        textV2.setText(singerActivity.getNgheDanh());
        textV3.setText(singerActivity.getQuocGia());
        textV4.setText(singerActivity.getSoSaoBinhChon());

        return view;
    }
}