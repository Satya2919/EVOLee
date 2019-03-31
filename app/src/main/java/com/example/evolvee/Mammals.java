package com.example.evolvee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Mammals extends AppCompatActivity {
    Spinner spin;
    Spinner spin1;
    String timeline[] = {"395 million years ago","340 million years ago","220 million years ago","150 million years ago","120 million years ago","100 million years ago","85 million years ago","71 million years ago","63 million years ago","40 million years ago","30 million years ago","23 million years ago","4-15 million years ago","2.5 million years ago","0.3-0.8 million years ago"};
    String mammals[] = {"CAT","HUMAN","DOG"} ;
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
        setContentView(R.layout.activity_mammals);
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
                    case 8:
                        record = "9";
                        break;
                    case 9:
                        record = "10";
                        break;
                    case 10:
                        record = "11";
                        break;
                    case 11:
                        record = "12";
                        break;
                    case 12:
                        record = "13";
                        break;
                    case 13:
                        record = "14";
                        break;
                    case 14:
                        record = "15";
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
                        record1 = "CAT";
                        break;
                    case 1:
                        record1 = "HUMAN";
                        break;
                    case 2:
                        record1 = "DOG";
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
                if(record1.equals("HUMAN")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2F390.png?alt=media&token=5906e633-c47e-487c-90b6-f7b5a3980778";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FAmniote_340.png?alt=media&token=d6c1d29e-32ea-4b95-b477-fd1051f917cf";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FMammalia_220.png?alt=media&token=96068a8f-6efa-4fb9-8bbe-04579330408b";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FEutheria_150.png?alt=media&token=a8660315-562b-443e-a7a7-b258feb4f123";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FBoroeutheria_120.png?alt=media&token=e0a63425-53d3-4676-a8ae-34d5c4eb9208";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2Feuro_100.png?alt=media&token=f19f8758-ccf8-4bb3-9e06-cd82f7410da2";
                    }else if(record.equals("7")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FEuaRchonta_85.png?alt=media&token=2b617a9c-ebca-40ed-8077-e6e6ca43970c";
                    }else if(record.equals("8")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2Fprimatomorpha_71.png?alt=media&token=d769f9f3-b14c-4373-a511-6dad91da79ff";
                    }else if(record.equals("9")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2Fharlorhini_63.png?alt=media&token=278c4501-d569-4b1d-8561-990456cae4c1";
                    }else if(record.equals("10")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2Fsimian_40.png?alt=media&token=23bb2ed9-1473-4f3a-b36f-de848281643c";
                    }else if(record.equals("11")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FCatarhini_30.png?alt=media&token=8e0204ef-b684-4ffb-b122-373a8265b38a";
                    }else if(record.equals("12")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2Fapes_23.png?alt=media&token=760e5e08-0efb-4d88-8939-037e27f509d5";
                    }else if(record.equals("13")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FHomini_4.png?alt=media&token=c3a1093e-7ad9-4b72-93b2-ba475c7e1c38";
                    }else if(record.equals("14")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FHomo_2.5.png?alt=media&token=43b6aca7-4d57-40f6-a665-a4c684345572";
                    }else if(record.equals("15")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/human%2FHomoSapiens_0.3.png?alt=media&token=adf194f3-dc89-4372-bff8-5ae57a2687a8";
                    }

                }else if(record1.equals("DOG")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F340.png?alt=media&token=2cded382-6916-4cfa-bd6e-e7708f091951";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F340.png?alt=media&token=2cded382-6916-4cfa-bd6e-e7708f091951";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F220.png?alt=media&token=e19f7ddf-7ab3-41fc-8462-e72c0980d4d4";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F150.png?alt=media&token=733f0c65-7b06-428d-b8a0-c66b77178c57";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F100.png?alt=media&token=8090fe50-a119-481c-a94a-66404e48ada1";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F85.png?alt=media&token=7d6bc498-ca12-4b4f-9e91-7cbad5db5f99";
                    }else if(record.equals("7")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F71.png?alt=media&token=e779d095-3760-475a-bf47-776a173b82ad";
                    }else if(record.equals("8")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F71.png?alt=media&token=e779d095-3760-475a-bf47-776a173b82ad";
                    }else if(record.equals("9")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F63.png?alt=media&token=470c3681-4763-4a87-847f-bc5d2ca4972e";
                    }else if(record.equals("10")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F63.png?alt=media&token=470c3681-4763-4a87-847f-bc5d2ca4972e";
                    }else if(record.equals("11")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F40.png?alt=media&token=aaf748b8-6242-4db6-aceb-0d3aa295d468";
                    }else if(record.equals("12")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F30.png?alt=media&token=7088fc41-c56e-4ff8-bc15-2fd2bad23013";
                    }else if(record.equals("13")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F23.png?alt=media&token=b4ee7ae0-c341-49f8-b373-dfb3ccd691f0";
                    }else if(record.equals("14")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2F4_15_2.5.png?alt=media&token=06b2e4be-87e2-4b51-8ae9-ea6ece4224b1";
                    }else if(record.equals("15")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/dog%2Fdog.png?alt=media&token=97958eac-7178-45b8-b6af-bede4aa30e1f";
                    }
                }else if(record1.equals("CAT")){
                    if(record.equals("1")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F1.png?alt=media&token=6c752183-7155-435d-9806-602064f88546";
                    }else if(record.equals("2")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F1.png?alt=media&token=6c752183-7155-435d-9806-602064f88546";
                    }else if(record.equals("3")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F2.png?alt=media&token=595cfc31-fe22-4d81-82ee-e31de8b13e49";
                    }else if(record.equals("4")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F2.png?alt=media&token=595cfc31-fe22-4d81-82ee-e31de8b13e49";
                    }else if(record.equals("5")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F3.png?alt=media&token=1c26a80b-38e3-4c07-aa64-3232aa6978b6";
                    }else if(record.equals("6")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F3.png?alt=media&token=1c26a80b-38e3-4c07-aa64-3232aa6978b6";
                    }else if(record.equals("7")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F3.png?alt=media&token=1c26a80b-38e3-4c07-aa64-3232aa6978b6";
                    }else if(record.equals("8")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F3.png?alt=media&token=1c26a80b-38e3-4c07-aa64-3232aa6978b6";
                    }else if(record.equals("9")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F5.png?alt=media&token=65c2873b-e39b-4556-ac81-4cbc3ff1d47a";
                    }else if(record.equals("10")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F5.png?alt=media&token=65c2873b-e39b-4556-ac81-4cbc3ff1d47a";
                    }else if(record.equals("11")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F6.png?alt=media&token=07c5514f-3919-4ef0-984e-1dbd6b5e1b97";
                    }else if(record.equals("12")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F6.png?alt=media&token=07c5514f-3919-4ef0-984e-1dbd6b5e1b97";
                    }else if(record.equals("13")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F7.png?alt=media&token=45e7002f-35b5-48d9-a9ce-b393c1daa0cb";
                    }else if(record.equals("14")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F7.png?alt=media&token=45e7002f-35b5-48d9-a9ce-b393c1daa0cb";
                    }else if(record.equals("15")){
                        link = "https://firebasestorage.googleapis.com/v0/b/evolution-a5228.appspot.com/o/cat%2F8.png?alt=media&token=f62349ee-ba9a-415d-ae53-985a95e44076";
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
