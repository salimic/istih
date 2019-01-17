package com.example.salimic.istih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand= new Random();
                String s=" ";
                for (int i=0;i<3;i++){
                    int n=rand.nextInt(8);
                    if (n==0) n++;
                    s=s+Integer.toString(n);
                    s=s+' ';
                    //System.out.println(n);
                 }
                Toast toast=Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG);
                toast.show();
            }


        });
    }

}
