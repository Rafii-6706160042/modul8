package org.d3ifcool.pandoma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListPasienActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> data = new ArrayList<>();
        data.add(new Word("Hadiyan","26 November 2018",R.drawable.ic_face_black_24dp));
        data.add(new Word("Rafii","26 Agustus 2018", R.drawable.ic_face_black_24dp));
        data.add(new Word("Praga","26 September 2018", R.drawable.ic_face_black_24dp));
        data.add(new Word("Rizky","26 Oktober 2018", R.drawable.ic_face_black_24dp));





        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new WordAdapter(this, data));



    }
}
