package com.example.jinx.bookexchage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.password;

/**
 * Created by Jinx on 2017/3/23 18:39.
 * 邮箱：gtxmiracle@buaa.edu.cn
 */
public class SignupActivity extends AppCompatActivity
{
    private Button signup_button;
    private DescribeView username;
    private DescribeView password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        init();
    }

    private void init()
    {
        signup_button= (Button) findViewById(R.id.signup_signup_bt);
        username= (DescribeView) findViewById(R.id.signup_username);
        password= (DescribeView) findViewById(R.id.signup_password);

        ///////////////////////////////////////
        signup_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),"注册成功！",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
