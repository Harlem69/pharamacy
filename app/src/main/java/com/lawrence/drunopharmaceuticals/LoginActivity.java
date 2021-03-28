package com.lawrence.drunopharmaceuticals;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class LoginActivity extends AppCompatActivity {
    public Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn=(Button)findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartDashboard();
            }
        });
    }
    public void StartDashboard(){
        Intent intent=new Intent(this,Dashboard.class);
        startActivity(intent);
    }

}