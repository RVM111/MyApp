package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class news_fragment extends Fragment implements NewsAdapter.OnNewsItemClickListener {

    private RecyclerView newsRecyclerView;
    private NewsAdapter newsAdapter;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news,container,false);

        newsRecyclerView=(RecyclerView)view.findViewById(R.id.news_recycler_view);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        newsRecyclerView.setHasFixedSize(true);

        ArrayList<News> allNews = new ArrayList<News>();
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));
        allNews.add(new News("hfirehfri","iehfiewifbiebdicbdibgiebiedbjsbkjvvbksjdgvnvidfbvibfdbv iidbvif","TimesNow","3:00"));

        newsAdapter = new NewsAdapter(allNews,this::onNewsItemClick);
        newsRecyclerView.setAdapter(newsAdapter);
        return view;
    }

    @Override
    public void onNewsItemClick(int position) {
        Intent intent =new Intent(getContext(),NewsDetailActivity.class);
        startActivity(intent);
    }
}
