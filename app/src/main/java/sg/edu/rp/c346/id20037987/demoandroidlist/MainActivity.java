package sg.edu.rp.c346.id20037987.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAV;
    //ArrayAdapter aaAV;
    //ArrayList alAV;
    //ArrayAdapter<AndroidVersion> aaAV;
    CustomAdapter adapter;
    ArrayList<AndroidVersion> alAV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAV = findViewById(R.id.lvAndroidVersions);
        alAV = new ArrayList<>();

        //aaAV = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alAV);
        adapter = new CustomAdapter(this, R.layout.row, alAV);

        //lvAV.setAdapter(aaAV);
        lvAV.setAdapter(adapter);

        /*alAV.add("Pie - 9.0");
        alAV.add("Oreo - 8.0 - 8.1");
        alAV.add("Nougat - 7.0 - 7.1.2");
        alAV.add("Marshmallow - 6.0 - 6.0.1");
        alAV.add("Lollipop - 5.0 - 5.1.1");
        alAV.add("KitKat - 4.4 - 4.4.4");
        alAV.add("Jelly Bean - 4.1 - 4.3.1");*/

        alAV.add(new AndroidVersion("Pie", "9.0"));
        alAV.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alAV.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));
        alAV.add(new AndroidVersion("Marshmallow", "6.0 - 6.0.1"));
        alAV.add(new AndroidVersion("Lollipop", "5.0 - 5.1.1"));
        alAV.add(new AndroidVersion("KitKat", "4.4 - 4.4.4"));
        alAV.add(new AndroidVersion("Jelly Bean", "4.1 - 4.3.1"));


    }
}