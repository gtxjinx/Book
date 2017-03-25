package com.example.jinx.bookexchage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Jinx on 2017/3/23 20:11.
 * 邮箱：gtxmiracle@buaa.edu.cn
 */
public class MainActivity extends AppCompatActivity
{
    private static final int BUY_PAGE =0;
    private static final int SELL_PAGE =1;
    private static final int SERVICE_PAGE =2;
    private static final int ME_PAGE =3;
    private ViewPager pager;
    private ImageView buy;
    private ImageView sell;
    private ImageView service;
    private ImageView me;
    private ArrayList<Fragment> fragments;
    private BuyFragment buyfragment;
    private SellFragment sellfragment;
    private ServiceFragment servicefragment;
    private MeFragment mefragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        pager= (ViewPager) findViewById(R.id.main_vp);
        buy= (ImageView) findViewById(R.id.main_buy_iv);
        sell= (ImageView) findViewById(R.id.main_sell_iv);
        service= (ImageView) findViewById(R.id.main_service_iv);
        me= (ImageView) findViewById(R.id.main_me_iv);
        buy.setImageResource(R.drawable.buy_green);
        initpager();
    }

    public void onclick(View view)
    {
        switch (view.getId())
        {
            case R.id.main_buy_iv:
                pager.setCurrentItem(BUY_PAGE);
                break;
            case R.id.main_sell_iv:
                pager.setCurrentItem(SELL_PAGE);
                break;
            case R.id.main_service_iv:
                pager.setCurrentItem(SERVICE_PAGE);
                break;
            case R.id.main_me_iv:
                pager.setCurrentItem(ME_PAGE);
                break;
            default:
                break;
        }
    }

    private void initpager()
    {
        fragments=new ArrayList<>();
        buyfragment=new BuyFragment();
        sellfragment=new SellFragment();
        servicefragment=new ServiceFragment();
        mefragment=new MeFragment();
        fragments.add(buyfragment);
        fragments.add(sellfragment);
        fragments.add(servicefragment);
        fragments.add(mefragment);
        MainAdapter adapter=new MainAdapter(getSupportFragmentManager(),fragments);
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                buy.setImageResource(R.drawable.buy_gray);
                sell.setImageResource(R.drawable.sell_gray);
                service.setImageResource(R.drawable.service_gray);
                me.setImageResource(R.drawable.me_gray);
                switch (position)
                {
                    case BUY_PAGE:
                        buy.setImageResource(R.drawable.buy_green);
                        break;
                    case SELL_PAGE:
                        sell.setImageResource(R.drawable.sell_green);
                        break;
                    case SERVICE_PAGE:
                        service.setImageResource(R.drawable.service_green);
                        break;
                    case ME_PAGE:
                        me.setImageResource(R.drawable.me_green);
                        break;
                    default:
                        break;
                }
                //Log.i("Jinx",position+"");
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
    }
}
