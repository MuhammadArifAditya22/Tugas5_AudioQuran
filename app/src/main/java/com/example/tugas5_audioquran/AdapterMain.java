package com.example.tugas5_audioquran;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.Adapterholder>{
    List<ChaptersItem> results = new ArrayList<>();

    public AdapterMain(List<ChaptersItem> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public Adapterholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);

        return new Adapterholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterholder holder, int position) {
        final ChaptersItem chapter = results.get(position);
        holder.surat.setText(chapter.getNameSimple());
        holder.NomorSurah.setText(String.valueOf(chapter.getId()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.itemView.getContext(), AdapterInfo.class);
                i.putExtra("Judul", chapter.getNameSimple());
                i.putExtra("ArtiSurat", chapter.getTranslatedName().getName());
                i.putExtra("id", chapter.getId());
                i.putExtra("Urutan", chapter.getRevelationOrder());
                i.putExtra("JumlahAyat", chapter.getVersesCount());
                i.putExtra("revelation_place", chapter.getRevelationPlace());
                holder.itemView.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class Adapterholder extends RecyclerView.ViewHolder {
        TextView surat,NomorSurah;
        public Adapterholder(@NonNull View itemView) {
            super(itemView);
            surat = itemView.findViewById(R.id.namasurah);
            NomorSurah = itemView.findViewById(R.id.NomorSurah);
        }
    }

    public void setData(List<ChaptersItem> data){
        results.clear();
        results.addAll(data);
        notifyDataSetChanged();

    }
}
