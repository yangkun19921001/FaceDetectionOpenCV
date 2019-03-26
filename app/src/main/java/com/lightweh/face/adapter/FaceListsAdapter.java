package com.lightweh.face.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lightweh.face.FaceBean;
import com.lightweh.facedetection.R;

import java.io.File;
import java.util.List;

public class FaceListsAdapter extends RecyclerView.Adapter<FaceListsAdapter.FaceListsHolder> implements View.OnClickListener {
    private List<FaceBean> data;
    private Context context;
    private int resouce_id;


    public FaceListsAdapter(List<FaceBean> data, Context context, int resouce_id) {
        this.data = data;
        this.context = context;
        this.resouce_id = resouce_id;
    }


    @Override
    public FaceListsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(resouce_id, null);
        FaceListsHolder myHolder = new FaceListsHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(FaceListsHolder holder, final int position) {
        if (data.get(position).getImgUrl() == null) {
            holder.img.setImageBitmap(data.get(position).getBitmap());
            holder.title.setText("");
        } else {
            Uri uri = Uri.fromFile(new File(data.get(position).getImgUrl()));
            holder.img.setImageURI(uri);
            holder.title.setText(data.get(position).getFileName());
            holder.img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    data.get(position).setSelect(!data.get(position).isSelect());
                    notifyItemChanged(position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class FaceListsHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView img;

        public FaceListsHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.img);
            title = (TextView) view.findViewById(R.id.title);
        }
    }
}