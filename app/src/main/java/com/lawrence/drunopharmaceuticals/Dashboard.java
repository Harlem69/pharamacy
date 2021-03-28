package com.lawrence.drunopharmaceuticals;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {
    public Button prescriptionbtn;
    public Button Orderbtn;
    public Button Appointmentbtn;
    public Button Supplierbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        prescriptionbtn=(Button)findViewById(R.id.prescriptionbtn);
        Orderbtn=(Button)findViewById(R.id.Orderbtn);
        Appointmentbtn=(Button) findViewById(R.id.Appointmentbtn);
        Supplierbtn=(Button) findViewById(R.id.Supplierbtn);
        prescriptionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartPrescription();
            }
        });
        Orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startOrder();
            }
        });
        Appointmentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAppointment();
            }
        });
        Supplierbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSupplier();
            }
        });
    }
    public  void StartPrescription(){
        Intent intent=new Intent(this,PrescriptionMenu.class);
        startActivity(intent);
    }
    public void startOrder(){
        Intent intent=new Intent(this,OrderMenu.class);
        startActivity(intent);

    }
    public  void startAppointment(){
        Intent intent=new Intent(this,AppointmentMenu.class);
        startActivity(intent);

    }
    public void startSupplier(){
        Intent intent=new Intent(this,SupplierMenu .class);
        startActivity(intent);
    }
}