package com.example.kartapolaka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class HistoryActivity extends AppCompatActivity {

    Information historyInfo = new Information(
            "W jakim wieku powstało " +
                    "państwo polskie,i wiek w " +
                    "którym był chrzest Polski?",

            "Państwo polskie " +
                    "powstało w X wieku " +
                    "i chrzest też w X " +
                    "wieku. Najczęściej " +
                    "podawaną datą jest " +
                    "966 r.");

    Information historyInfo1 = new Information("Jaki był pierwszy król " +
            "Polski?", "Nazywał się " +
            "Bolesław Chrobri. " +
            "Został koronowany " +
            "w 1025 r. W " +
            "Gnieźnie.");

    Information historyInfo2 = new Information("Kiedy Saeima przyjęła " +
            "Konstytucję RP?", "Polska Konstytucja " +
            "została przyjęta 3 " +
            "maja 1791 r");

    Information historyInfo3 = new Information("Kto taki Dąbrowskie?", "Jan Dąbrowski –\n" +
            "polski generał, mąż\n" +
            "stanu, twórca\n" +
            "Legionów Polskich\n" +
            "we Włoszech,\n" +
            "naczelny dowódca\n" +
            "wojsk polskich w\n" +
            "1813, senator,\n" +
            "wojewoda Królestwa\n" +
            "Polskiego w 1815,\n" +
            "generał jazdy armii\n" +
            "Królestwa Polskiego\n" +
            "w 1815.");

    Information historyInfo4 = new Information("Kiedy miał miejsce I, II,\n" +
            "III rozbiór Polski?", "Trzy rozbiory\n" +
            "Rzeczypospolitej w\n" +
            "1772, 1793 i 1795 r.");

    Information historyInfo5 = new Information("Czy Pan zna ostatniego\n" +
            "króla Polski?", "Ostatnim polskim\n" +
            "monarchą był\n" +
            "Stanisław August\n" +
            "Poniatowski (1732-\n" +
            "1798)");

    Information historyInfo6 = new Information("Pierwsza stolica Polski?", "Pierwsza stolica\n" +
            "Polski – Gniezno. W\n" +
            "tym mieście było\n" +
            "wiele wydarzeń\n" +
            "historycznych. W\n" +
            "1025r. odbyła się\n" +
            "koronacja Bolesława\n" +
            "Chrobrego.");

    Information historyInfo7 = new Information("Kto jest patronem Polski?", "Święty Wojciech jest\n" +
            "pierwszym polskim\n" +
            "świętym uznanym\n" +
            "przez Kościół\n" +
            "katolicki,\n" +
            "misjonarzem,\n" +
            "męczennikiem.");

    Information historyInfo8 = new Information("Jakie są najważniejsze\n" +
            "średniowieczne budynki w\n" +
            "największych miastach\n" +
            "Polski?", "Wawel (Zamek\n" +
            "Krolewski) w\n" +
            "Krakowie,\n" +
            "Sukiennice na Starym\n" +
            "Miescie w Krakowie,\n" +
            "Malbork (zamek\n" +
            "Kszyrzacki).");

    Information historyInfo9 = new Information("Kim jest Jadwiga?", "Jadwiga jest królem\n" +
            "Polski, najmłodszą\n" +
            "córką Ludwika\n" +
            "Vögierskiego i\n" +
            "Elbiety Bosniak,\n" +
            "katolickiego\n" +
            "świętego, patrona\n" +
            "Polski.");

    ArrayList<Information> objList = new ArrayList<>(Arrays.asList(historyInfo, historyInfo1, historyInfo2, historyInfo3, historyInfo4, historyInfo5
            , historyInfo6, historyInfo7, historyInfo8, historyInfo9));

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