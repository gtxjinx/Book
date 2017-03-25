package com.example.jinx.bookexchage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by Jinx on 2017/3/25 13:35.
 */

public class BuyFragment extends Fragment
{
    private ListView listview;
    private SearchView search;
    private Spinner area;
    private Spinner school;
    private Spinner publish;
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view=inflater.inflate(R.layout.fragment_buy,container,false);
        init();
        return view;
    }

    private void init()
    {
        listview= (ListView) view.findViewById(R.id.buy_lv);
        search= (SearchView) view.findViewById(R.id.buy_sv);
        area= (Spinner) view.findViewById(R.id.buy_area_sp);
        school= (Spinner) view.findViewById(R.id.buy_school_sp);
        publish= (Spinner) view.findViewById(R.id.buy_publish_sp);
        initlistview();
    }

    private void initlistview()
    {
        ArrayList<Goods> goods=new ArrayList<>();
        for(int i=1;i<=20;i++)
        {
            Goods good=new Goods();
            good.ImageId=R.drawable.good;
            good.text="商品"+i;
            goods.add(good);
        }
        GoodsAdapter adapter=new GoodsAdapter(goods,getContext());
        listview.setAdapter(adapter);
    }

}
