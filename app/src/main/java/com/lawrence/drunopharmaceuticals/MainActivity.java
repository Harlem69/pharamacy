package com.lawrence.drunopharmaceuticals;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public Button LoginBtn;
    public Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginBtn=(Button) findViewById(R.id.loginBtn);
        registerBtn=(Button)findViewById(R.id.registerBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartLogin();
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRegister();
            }
        });


    }
    public void  StartLogin(){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);


    }
    public void startRegister(){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);

    }
}