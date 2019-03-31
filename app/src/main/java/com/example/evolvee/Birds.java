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

public class Birds extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;
    String timeline[] = {"250 million years ago","100 million years ago","40-59 million years ago","20 million years ago","1 million years ago","current-0.2 million years ago"};
    String mammals[] = {"SPARROW","PARROT"} ;
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
        setContentView(R.layout.activity_birds);
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
                        record1 = "sparrow";
                        break;
                    case 1:
                        record1 = "parrot";
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
                if(record1.equals("sparrow")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F1.png?alt=media&token=4bd901c5-bd35-430c-be13-ed26795d1547";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F2.png?alt=media&token=c31a5889-ff32-4591-a823-ce4fa50bf868";
                    }else if(record.equals("3")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F3.png?alt=media&token=8e21b050-c664-4b0a-8a35-f35c6ca29742";
                    }else if(record.equals("4")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F4.png?alt=media&token=3f998fd9-6adf-4919-9125-f407b071eed1";
                    }else if(record.equals("5")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F5.png?alt=media&token=ad952b58-4741-4c8c-8326-46eacde1c23d";
                    }else if(record.equals("6")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F6.png?alt=media&token=24beacb2-bc03-4b34-9315-745d0b8163c1";
                    }
                }else  if(record1.equals("parrot")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F1.png?alt=media&token=4bd901c5-bd35-430c-be13-ed26795d1547";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/sparrow%2F2.png?alt=media&token=c31a5889-ff32-4591-a823-ce4fa50bf868";
                    }else if(record.equals("3")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/parrot%2F1.png?alt=media&token=119768fe-b53e-4e97-bedb-9703648eb90a";
                    }else if(record.equals("4")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/parrot%2F2.png?alt=media&token=cc171bd0-8227-4410-aa3a-c1a4d6607e47";
                    }else if(record.equals("5")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/parrot%2F3.png?alt=media&token=02cab87b-6b43-4299-a7c6-c6df6c740da9";
                    }else if(record.equals("6")) {
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/parrot%2F4.png?alt=media&token=6cd49180-e6a2-4965-beb9-defd24826e88";
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
