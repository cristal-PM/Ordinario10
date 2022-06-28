package com.example.ordinario1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SlidePagerAdapter extends RecyclerView.Adapter<SlidePagerAdapter.Viewolder> {
int[]images;
public SlidePagerAdapter(int[]images){
    this.images=images;
}

    @NonNull
    @Override
    public SlidePagerAdapter.Viewolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardimage,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SlidePagerAdapter.Viewolder holder, int position) {
holder.imageView.setBackgroundResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Viewolder extends RecyclerView.ViewHolder {
    ImageView imageView;
        public Viewolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image2);
        }
    }
}

