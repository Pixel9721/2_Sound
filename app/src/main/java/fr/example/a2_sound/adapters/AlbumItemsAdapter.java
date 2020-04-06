package fr.example.a2_sound.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import fr.example.a2_sound.R;
import fr.example.a2_sound.models.AlbumItems;

import static android.widget.Toast.LENGTH_SHORT;

public class AlbumItemsAdapter extends BaseAdapter {

    private Context context;
    private List<AlbumItems> albumItemsList;
    private LayoutInflater inflater;

    public AlbumItemsAdapter(Context context, List<AlbumItems> albumItemsList) {
        this.context = context;
        this.albumItemsList = albumItemsList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return albumItemsList.size();
    }

    @Override
    public AlbumItems getItem(int position) {
        return albumItemsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.adapter_items, null);

        // on recupere les info de l'item
        AlbumItems currentItem = getItem(i);
        final String itemName = currentItem.getName();
        String memo = currentItem.getMemo();
        final double itemPrix = currentItem.getPrix();

        //on recupere l'item name view
        TextView itemNameView = view.findViewById(R.id.item_nomAlbum);
        itemNameView.setText(itemName);

        //on recupere l'item image view
        ImageView itemImgView = view.findViewById(R.id.item_album);
        String resourceName = "item_" + memo;
        int resId = context.getResources().getIdentifier(resourceName, "drawable", context.getOpPackageName());
        itemImgView.setImageResource(resId);

        //on recupere l'item prix view
        TextView itemPrixView = view.findViewById(R.id.item_prix);
        itemPrixView.setText(itemPrix + "€");

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "vous aller ajouter " + itemName + ",  au prix de "+ itemPrix + "€", LENGTH_SHORT).show();
            }
        });

        return view;
    }
}