package com.example.AccountSim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {

    TextView Name;

    Button logOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Name = (TextView) findViewById(R.id.name);

        Bundle i = getIntent().getExtras();
        String fullName = i.getString("fullName");
        Name.setText(fullName);
        logOut = (Button) findViewById(R.id.btn_logout);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Login.class));
                Toast.makeText(Home.this, "Log Out Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}