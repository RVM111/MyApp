package com.example.myapp;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    ArrayList<News> newsList;
    OnNewsItemClickListener onNewsItemClickListener;

    public NewsAdapter(ArrayList<News> newsList,OnNewsItemClickListener onNewsItemClickListener){
        this.newsList=newsList;
        this.onNewsItemClickListener=onNewsItemClickListener;
    }

    interface OnNewsItemClickListener{
        void onNewsItemClick(int position);
    }

    @NonNull
    @NotNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item_layout,parent,false);
        NewsViewHolder holder =new NewsViewHolder(view);

        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NewsAdapter.NewsViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView description;
        TextView source;
        TextView time;

        public NewsViewHolder(@NonNull @NotNull View row) {
            super(row);
            title=(TextView) row.findViewById(R.id.news_title_textView);
            description=(TextView) row.findViewById(R.id.news_description_textView);
            source=(TextView) row.findViewById(R.id.news_source_textView);
            time=(TextView) row.findViewById(R.id.news_time_textView);

            row.setOnClickListener(this::onClick);

            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        public void bind(int position){
            title.setText(""+position);
        }

        @Override
        public void onClick(View v) {
            int currPosition = getAdapterPosition();
            onNewsItemClickListener.onNewsItemClick(currPosition);
        }
    }
}

