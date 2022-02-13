package com.example.banglaikobita;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView imageView;
    private  Button kobbtn,addbtm,sterbtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageViewid);

         kobbtn=findViewById(R.id.kobitaID);
         addbtm=findViewById(R.id.aroappId);
         sterbtm=findViewById(R.id.saterId);


           kobbtn.setOnClickListener(new View.OnClickListener()
           {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);


            }
        });
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are You Sere Exit ");
        builder.setCancelable(true);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();


    }
}