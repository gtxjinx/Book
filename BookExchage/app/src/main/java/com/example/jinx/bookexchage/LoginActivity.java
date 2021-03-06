package com.example.jinx.bookexchage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jinx on 2017/3/23 15:10.
 * 邮箱：gtxmiracle@buaa.edu.cn
 */
public class LoginActivity extends AppCompatActivity
{
    private Button signin_button;
    private Button signup_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init()
    {
        signin_button= (Button) findViewById(R.id.login_signin_bt);
        signup_button= (Button) findViewById(R.id.login_signup_bt);

        signin_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(LoginActivity.this,SigninActivity.class);
                startActivity(intent);
            }
        });

        signup_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}
