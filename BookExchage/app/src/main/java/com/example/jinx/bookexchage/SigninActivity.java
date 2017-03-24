package com.example.jinx.bookexchage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by Jinx on 2017/3/23 20:06.
 * 邮箱：gtxmiracle@buaa.edu.cn
 */
public class SigninActivity extends AppCompatActivity
{
    private Button signin_button;
    private EditText username;
    private EditText password;
    private CheckBox auto_checkbox;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        init();
    }

    private void init()
    {
        signin_button= (Button) findViewById(R.id.signin_signin_bt);
        password= (EditText) findViewById(R.id.signin_psd_et);
       // username= (EditText) findViewById(R.id.signin_username_et);
        auto_checkbox= (CheckBox) findViewById(R.id.signin_cb);

        ///////////////////////////////////////////
        signin_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(SigninActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
