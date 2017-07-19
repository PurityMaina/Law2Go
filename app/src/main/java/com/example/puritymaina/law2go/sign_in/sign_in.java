package com.example.puritymaina.law2go.sign_in;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.puritymaina.law2go.R;

public class sign_in extends AppCompatActivity {
    Button lawyer;
    Button client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addListenerOnButton();

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


    }

    private void addListenerOnButton() {
        final Context context = this;
        lawyer = (Button) findViewById(R.id.lawyer);
        lawyer.setOnClickListener(new View.OnClickListener(){

            @Override

            public  void onClick(View arg0){
                Intent lawyer_intent = new Intent(context, signin_lawyer.class);
                startActivity(lawyer_intent);


                                  }
        });

//        final Context client_context = this;
//        client = (Button) findViewById(R.id.client);
//        client.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//
//            public  void onClick(View arg0){
//                Intent client_intent = new Intent(client_context, signin_client.class);
//                startActivity(client_intent);
//
//
//            }
//        });





    }

}
