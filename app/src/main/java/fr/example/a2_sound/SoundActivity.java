package fr.example.a2_sound;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.example.a2_sound.adapters.AlbumItemsAdapter;
import fr.example.a2_sound.models.AlbumItems;

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        List<AlbumItems> albumItemsList = new ArrayList<>();
        albumItemsList.add(new AlbumItems("Le Paris des Enfoirés", "enfoires", 19.9));
        albumItemsList.add(new AlbumItems("NIRVANA","nirvana", 30));
        albumItemsList.add(new AlbumItems("Sliman & Vitaa", "versus", 20));
        albumItemsList.add(new AlbumItems("The Score", "the_score", 25));


        ListView soundListView = findViewById(R.id. sound_list_view);
        soundListView.setAdapter(new AlbumItemsAdapter(this, albumItemsList));
    }
}
