package com.example.xuepeng.learnrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xuepeng on 18/3/26.
 */
class MyAdapter extends RecyclerView.Adapter {
    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;
        private TextView tvTitle,tvContext;

        public ViewHolder( View root) {

            super(root);
            tvTitle=root.findViewById(R.id.tvTitle);
            tvContext=root.findViewById(R.id.tvContext);
        }

        public TextView getTvContext() {
            return tvContext;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
        Celldata cd=data[position];
        vh.getTvContext().setText(cd.Context);
        vh.getTvTitle().setText(cd.Title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    public Celldata[] data =new Celldata[]{new Celldata("android开发","学习目标"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错"),new Celldata("新闻","这个新闻真不错")};

//    private String[] data = new String[]{"hello", "world", "computer"};
    }
