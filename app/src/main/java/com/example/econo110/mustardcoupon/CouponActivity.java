package com.example.econo110.mustardcoupon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by econo110 on 2017-05-23.
 */
public class CouponActivity extends AppCompatActivity {

    private Button Stamp,Use,delete;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Stamp= (Button) findViewById(R.id.stamp);
        Use=(Button)findViewById(R.id.use);
        delete= (Button) findViewById(R.id.delete);

        Stamp.setOnClickListener(listener);
        Use.setOnClickListener(listener);
        delete.setOnClickListener(listener);

    }

    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){

                case R.id.stamp:

                    break;

                case R.id.use:

                    break;

                case R.id.delete:

                    break;
            }
        }
    };
}
