package com.example.jinx.bookexchage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;



/**
 * Created by Jinx on 2017/3/24 21:46.
 */

public class DescribeView extends LinearLayout
{
    private TextView tv;
    private EditText et;
    public DescribeView(Context context)
    {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.item_describe,this,true);
    }

    public DescribeView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_describe,this,true);
        init(context,attrs);
    }

    public DescribeView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.item_describe,this,true);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs)
    {

        tv= (TextView) findViewById(R.id.describe_tv);
        et= (EditText) findViewById(R.id.describe_et);
        initattr(context, attrs);
    }

    private void initattr(Context context, AttributeSet attrs)
    {
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.DescribeView);
        String text=typedArray.getString(R.styleable.DescribeView_text);
        tv.setText(text);
        float size=typedArray.getDimension(R.styleable.DescribeView_textsize,30);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_PX,size);
    }

    public void SetText(String s)
    {
        tv.setText(s);
    }
}
