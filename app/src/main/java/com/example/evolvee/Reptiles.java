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

public class Reptiles extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;
    String timeline[] = {"250 million years ago","120 million years ago","50 million years ago","5-10 million years ago","current-4 million years ago"};
    String mammals[] = {"CROCODILE","TURTLE","More to come..."} ;
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
        setContentView(R.layout.activity_reptiles);
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
                        record1 = "crocodile";
                        break;
                    case 1:
                        record1 = "turtle";
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
                if(record1.equals("crocodile")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/crocodile%2F1.png?alt=media&token=a8d8b668-2b14-4dcd-b85f-5f35cc7ae35a";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/crocodile%2F2.png?alt=media&token=da18fda8-0ad0-43e6-a781-93dff681be27";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/crocodile%2F3.png?alt=media&token=acd9f0bb-1d3f-406a-adbb-8776b746cb5c";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/crocodile%2F4.png?alt=media&token=23ea7d72-0d90-4f23-bcdd-3d3bee2e6123";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/crocodile%2F5.png?alt=media&token=17d1b254-7ca7-4700-a3a2-3cf9170d4d34";
                    }
                }
                if(record1.equals("turtle")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/turtle%2F1.png?alt=media&token=8631ba2d-9a89-4f16-a588-506b45974fe6";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/turtle%2F2.png?alt=media&token=c675afc5-aeb0-4784-8d60-48f60cc4e070";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/turtle%2F3.png?alt=media&token=57ae9d89-ae88-4192-bd9a-938e350053c5";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/turtle%2F4.png?alt=media&token=a71c7028-c09a-4bc3-810e-ff00d1412916";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/turtle%2F5.png?alt=media&token=6e51d48c-5cd0-449e-84cc-d1ac08d5fd0d";
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
