package com.lemt.lab_lemt_reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Farewell", "Lena Reine", R.raw.farewell));
        arrayList.add(new Music("Pigstep", "Lena Reine", R.raw.pigstep));
        arrayList.add(new Music("Reflection", "Lena Reine", R.raw.reflection));
        arrayList.add(new Music("Resurrections", "Lena Reine", R.raw.resurrections));
        adapter = new CustomMusicAdapter(this, R.layout.music_item, arrayList);
        songList.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

