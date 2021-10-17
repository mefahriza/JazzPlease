package com.example.jazzplease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewsFeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(NewsFeed.this, MainActivity.class);
        startActivity(intent);
    }

    public void Getticket(View view) {
        Intent intent = new Intent(NewsFeed.this, GetTicket.class);
        startActivity(intent);
    }

    public void Lineup(View view) {
        Intent intent = new Intent(NewsFeed.this, LineUp.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(NewsFeed.this, Schedule.class);
        startActivity(intent);
    }

}