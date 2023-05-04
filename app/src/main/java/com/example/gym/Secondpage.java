package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        TextView texte_first =(TextView) findViewById(R.id.signin_text);
        texte_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activ2();
            }
        });
    }
    public void Activ2()
    {
        Intent intent = new Intent(this,Signin.class);
        startActivity(intent);
    }
}