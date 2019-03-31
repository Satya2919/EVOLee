package com.example.evolvee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;

public class PreMammals extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;
    String timeline[] = {"56 million years ago","36-35 million years ago","30-34 million years ago","10.9 million years ago","8 million years ago","5-5.2 million years ago","1 million years ago","10 thousand years ago"};
    String mammals[] = {"ELEPHANT","More to come..."} ;
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter1;
    String record="";
    String record1 = "";
    Button button;
    ImageView imageView;
    public String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_mammals);
        button = findViewById(R.id.button);
        spin = findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timeline);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        record = "1";
                        break;
                    case 1:
                        record = "2";
                        break;
                    case 2:
                        record = "3";
                        break;
                    case 3:
                        record = "4";
                        break;
                    case 4:
                        record = "5";
                        break;
                    case 5:
                        record = "6";
                        break;
                    case 6:
                        record = "7";
                        break;
                    case 7:
                        record = "8";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spin1 = findViewById(R.id.spinner1);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mammals);
        spin1.setAdapter(adapter1);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        record1 = "elephant";
                        break;
                    case 1:
                        record1 = "none";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(record1.equals("elephant")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F1.png?alt=media&token=bc40c97e-457b-45fb-90fc-2649dde4f7fc";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F2.png?alt=media&token=6721179c-e097-45ab-bc2b-5fc41b44f9d6";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F3.png?alt=media&token=1f364b81-cbc4-49bd-9e66-5b2c8ed3294c";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F4.png?alt=media&token=fef2ef14-18c2-4101-9278-379128e3a2d3";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F5.png?alt=media&token=8f1be93c-6601-4439-8b2a-0c37de8ba7a0";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F6.png?alt=media&token=8683764a-e983-4b7b-9663-704ef86c3fcb";
                    }else if(record.equals("7")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F7.png?alt=media&token=4c731cd9-af7a-47c2-8e2f-24ad761704f3";
                    }else if(record.equals("8")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/elephant%2F8.png?alt=media&token=97dbd35e-4338-4d8f-8321-d8b041f688e1";
                    }

                }
                LoadImage(link);
            }
        });
    }
    public void LoadImage(String link){
        String url = link;
        Glide.with(getApplicationContext()).load(url).into(imageView);

    }
}
