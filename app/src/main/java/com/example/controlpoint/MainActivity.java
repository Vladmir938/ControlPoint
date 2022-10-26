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

public class MainActivity extends AppCompatActivity {

    private Button btnGrid, btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrid = (Button) findViewById(R.id.btnToGrid);
        btnList = (Button) findViewById(R.id.btnToList);

    }


    public void btnClickToGridLayout(View view) {
        setContentView(R.layout.activity_grid);
    }


    public void btnClickToListLayout(View view) {
        setContentView(R.layout.activity_list);
        ListView listView = (ListView) findViewById(R.id.listView);
        final String[] resNames = new String[]{
                "a1.png", "a2.png", "a3.png", "a4.png", "a5.png", "a6.png"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, resNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                String strText = textView.getText().toString();
                ImageView imageView = (ImageView) findViewById(R.id.iView);
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                switch (strText) {
                    case "a1.png":
                        imageView.setImageResource(R.drawable.a1);
                        imageView.setTag(strText);
                        break;
                    case "a2.png":
                        imageView.setImageResource(R.drawable.a2);
                        imageView.setTag(strText);
                        break;
                    case "a3.png":
                        imageView.setImageResource(R.drawable.a3);
                        imageView.setTag(strText);
                        break;
                    case "a4.png":
                        imageView.setImageResource(R.drawable.a4);
                        imageView.setTag(strText);
                        break;
                    case "a5.png":
                        imageView.setImageResource(R.drawable.a5);
                        imageView.setTag(strText);
                        break;
                    case "a6.png":
                        imageView.setImageResource(R.drawable.a6);
                        imageView.setTag(strText);
                        break;
                }
            }
        });
    }


    public void btnClickToMain(View view) {
        setContentView(R.layout.activity_main);
    }

    public void onClickImageList (View view) {
        ImageView imageView=(ImageView)findViewById(R.id.iView);
        String strText = String.valueOf(imageView.getTag());
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", strText);
        startActivity(intent);
    }

    public void onClickImageGrid1(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a1.png");
        startActivity(intent);
    }

    public void onClickImageGrid2(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a2.png");
        startActivity(intent);
    }

    public void onClickImageGrid3(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a3.png");
        startActivity(intent);
    }

    public void onClickImageGrid4(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a4.png");
        startActivity(intent);
    }

    public void onClickImageGrid5(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a5.png");
        startActivity(intent);
    }

    public void onClickImageGrid6(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        intent.putExtra("filename", "a6.png");
        startActivity(intent);
    }
}