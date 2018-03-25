package org.d3ifcool.pandoma;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RaR on 13/03/2018.
 */

public class WordAdapter extends ArrayAdapter <Word> {
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) convertView.findViewById(R.id.namaPasien);
        miwokTextView.setText(currentWord.getmNamaPasienWord());

        TextView defaultTextView = (TextView) convertView.findViewById(R.id.tanggalPemeriksaan);
        defaultTextView.setText(currentWord.getmTanggalWord());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.list_item_foto);
        imageView.setImageResource(currentWord.getmImageResourceId());


        return convertView;
    }
}
