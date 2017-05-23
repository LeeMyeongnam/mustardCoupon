package com.example.econo110.mustardcoupon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

// 은솔이바보

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Button btn1;
    int myStampNumber=0;
    int data[] = new int[11];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        imgView= (ImageView) findViewById(R.id.Coupon);
        btn1= (Button) findViewById(R.id.change);

        data[0] = R.drawable.c;
        data[1] = R.drawable.c1;
        data[2] = R.drawable.c2;
        data[3] = R.drawable.c3;
        data[4] = R.drawable.c4;
        data[5] = R.drawable.c5;
        data[6] = R.drawable.c6;
        data[7] = R.drawable.c7;
        data[8] = R.drawable.c8;
        data[9] = R.drawable.c9;
        data[10] = R.drawable.c10;


        imgView.setImageResource(data[0]);
        imgView.setVisibility(View.VISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStampNumber++;
                if(myStampNumber==11){
                    myStampNumber=0;
                }
                imgView.setImageResource(data[myStampNumber]);
                imgView.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
