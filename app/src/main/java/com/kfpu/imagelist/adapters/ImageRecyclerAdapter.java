package com.kfpu.imagelist.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kfpu.imagelist.GlideApp;
import com.kfpu.imagelist.R;
import com.kfpu.imagelist.models.Image;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by hlopu on 19.11.2017.
 */

public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.ImageViewHolder> {
    private List<Image> mImages;
    private Context context;

    public ImageRecyclerAdapter(Context context) {
        this.context = context;
        mImages = Collections.emptyList();
    }

    public void setmImages(List<Image> mImages) {
        this.mImages = mImages;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.image_item,
                parent,
                false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        final Image image = mImages.get(position);
        holder.tvName.setText(image.getName());
        GlideApp
                .with(context)
                .load(image.getUrl())
                .fitCenter()
//                .error(R.drawable.error)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name_image)
        TextView tvName;
        @BindView(R.id.iv_image)
        ImageView imageView;

        public ImageViewHolder(View itemView) {
            super(itemView);
//            imageView = itemView.findViewById(R.id.iv_image);
            ButterKnife.bind(this, itemView);
        }

    }
}
