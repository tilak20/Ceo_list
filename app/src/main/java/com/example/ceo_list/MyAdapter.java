package com.example.ceo_list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    Activity activity;
    List<ModelData> l2 = new ArrayList<>();


    public MyAdapter(MainActivity mainActivity, List<ModelData> l1) {
        activity = mainActivity;
        l2 = l1;
    }

    @Override
    public int getCount() {
        return l2.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View view1 = LayoutInflater.from(activity).inflate(R.layout.item_list,viewGroup,false);
        TextView TxtView = view1.findViewById(R.id.TxtView);
       ImageView imgView = view1.findViewById(R.id.imgView);

       TxtView.setText(l2.get(i).getName());
       imgView.setImageResource(l2.get(i).getImg());
        return view1;
    }
}
