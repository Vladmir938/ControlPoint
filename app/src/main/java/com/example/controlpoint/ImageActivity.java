package com.example.controlpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Intent intent = getIntent();
        String value = intent.getStringExtra("filename");
        ImageView imageView = (ImageView) findViewById(R.id.imageSecondActivity) ;

        switch (value) {
            case "a1.png":
                imageView.setImageResource(R.drawable.a1);
                break;
            case "a2.png":
                imageView.setImageResource(R.drawable.a2);
                break;
            case "a3.png":
                imageView.setImageResource(R.drawable.a3);
                break;
            case "a4.png":
                imageView.setImageResource(R.drawable.a4);
                break;
            case "a5.png":
                imageView.setImageResource(R.drawable.a5);
                break;
            case "a6.png":
                imageView.setImageResource(R.drawable.a6);
                break;
        }

    }
}
