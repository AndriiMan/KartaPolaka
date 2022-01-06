package com.example.kartapolaka;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<Information> objList;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context context, ArrayList<Information> objList) {
        this.context = context;
        this.objList = objList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.textViewQuestion);
        TextView tvAnswer = (TextView) convertView.findViewById(R.id.textViewAnswer);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewAnswer);

        tvTitle.setText(objList.get(position).getQuestion());
        tvAnswer.setText(objList.get(position).getAnswer());
        if (objList.get(position).getImage() != 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(objList.get(position).getImage());
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        return convertView;
    }
}
