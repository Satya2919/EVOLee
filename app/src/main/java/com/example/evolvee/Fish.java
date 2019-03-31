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

public class Fish extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;
    String timeline[] = {"500 million years ago","350 million years ago","300 million years ago","250-200 million years ago","100-40 million years ago","current-90 million years ago"};
    String mammals[] = {"WHALES","SHARK","More to come..."} ;
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
        setContentView(R.layout.activity_fish);
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
                        record1 = "whales";
                        break;
                    case 1:
                        record1 = "shark";
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
                if(record1.equals("whales")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F1.png?alt=media&token=84a2bc4c-1cdc-4e97-8ca9-4ffd5530597b";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F2.png?alt=media&token=e0f6f487-8eb8-4ad0-986a-70e8f4afcaab";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F3.png?alt=media&token=7f200c1d-a371-4ec8-aa35-2615c58622c5";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F4.png?alt=media&token=555b9462-4fd7-4824-b1a2-3ddf079d3387";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F4.png?alt=media&token=555b9462-4fd7-4824-b1a2-3ddf079d3387";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/whales%2F6.png?alt=media&token=e86eddcd-c1e8-451b-bd9c-1d0328d77f39";
                    }
                }
                if(record1.equals("shark")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F1.png?alt=media&token=0bfb402d-4751-42bc-bea3-5d518d77d53b";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F2.png?alt=media&token=acf0e40d-364c-445f-85b6-40c069e41022";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F3.png?alt=media&token=4d7a4f25-d62f-41ce-a7e1-57f93f5afbef";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F4.png?alt=media&token=084c05fe-1c0d-4fb5-aac3-e2a30d945ab1";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F5.png?alt=media&token=310ea07a-08df-4045-99ab-4a374e35bdf1";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/shark%2F6.png?alt=media&token=41fa833f-19d7-46eb-ab77-3d67928e156e";
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
