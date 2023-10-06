package com.example.recyclerviewimage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder>{
    private Context mContext;
    private List<Image> mListImage;

    public ImageAdapter(Context mContext,List<Image> list) {
        this.mContext = mContext;
        this.mListImage = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        Image image = mListImage.get(position);
        if(image == null){
            return;
        }
        holder.imgImg.setImageResource(image.getResourceId());

    }


    @Override
    public int getItemCount() {
        if (mListImage != null){
            return mListImage.size();
        }
        return 0;
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout layoutItem;
        private ImageView imgImg;


        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layoutItem);

            imgImg = itemView.findViewById(R.id.img_img);

        }
    }
}
