package com.example.kartapolaka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfoActivity extends AppCompatActivity {
/*    String[] infoList = {"1) Jak wygląda godło polski",
            "2) Stolica Polski"};
    String[] infoList2 = {"Orzeł biały, biało-czerwone",
            "Warszawa"};*/

    Information information2 = new Information("1", "2");
    Information information3 = new Information("pytanmia", "vidpovid", R.drawable.herbpolski);
    ArrayList<Information> objList = new ArrayList<>(Arrays.asList(information2, information3));

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        listView = findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), objList);
        listView.setAdapter(customBaseAdapter);
    }
}