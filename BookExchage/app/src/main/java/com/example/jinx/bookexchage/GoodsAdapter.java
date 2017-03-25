package com.example.jinx.bookexchage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jinx on 2017/3/25 13:18.
 */

public class GoodsAdapter extends BaseAdapter
{
    private ArrayList<Goods> goodslist;
    private LayoutInflater inflater;

    public GoodsAdapter(ArrayList<Goods> goodslist, Context context)
    {
        this.goodslist = goodslist;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount()
    {
        return goodslist.size();
    }

    @Override
    public Object getItem(int position)
    {
        return goodslist.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder;
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.item_goods,null);
            viewHolder=new ViewHolder();
            viewHolder.iv= (ImageView) convertView.findViewById(R.id.goods_iv);
            viewHolder.tv= (TextView) convertView.findViewById(R.id.goods_tv);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Goods good=goodslist.get(position);
        viewHolder.iv.setImageResource(good.ImageId);
        viewHolder.tv.setText(good.text);
        return convertView;
    }

    class ViewHolder
    {
        public ImageView iv;
        public TextView tv;
    }
}
