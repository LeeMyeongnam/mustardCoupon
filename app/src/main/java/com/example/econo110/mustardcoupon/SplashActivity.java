package com.example.econo110.mustardcoupon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by econo110 on 2017-05-12.
 */
public class SplashActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
