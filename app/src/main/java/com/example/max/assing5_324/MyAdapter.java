package com.example.max.assing5_324;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 22/7/2560.
 */

public class MyAdapter extends BaseAdapter {

    String data[];
    int img[];
    Context ct;

    public MyAdapter(String data[],int img[],Context ct) {
        this.data = data;
        this.img = img;
        this.ct = ct;

    }

    @Override
    public int getCount() {
        return data.length;
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

        LayoutInflater inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view==null) {
            view = inflater.inflate(R.layout.item_layout, viewGroup, false);
        }
        ImageView imvPic = (ImageView) view.findViewById(R.id.imvPic);
        TextView tvMenu = (TextView) view.findViewById(R.id.tvMenu);

        imvPic.setImageResource(img[i]);
        tvMenu.setText(data[i]);

        return view;
    }
}
