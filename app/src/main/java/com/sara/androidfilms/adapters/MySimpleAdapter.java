package com.sara.androidfilms.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;


public class MySimpleAdapter extends SimpleAdapter {

    private Context context;

    public MySimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context = context;
    }

    // Override setViewImage
    @Override
    public void setViewImage(ImageView v, String value) {
        Picasso.with(context)
                .load(value)
                .into(v);
    }
}