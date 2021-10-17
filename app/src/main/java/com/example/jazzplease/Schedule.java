package com.example.jazzplease;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(Schedule.this, ActivityHome.class);
        startActivity(intent);
    }

    public void Getticket(View view) {
        Intent intent = new Intent(Schedule.this, GetTicket.class);
        startActivity(intent);
    }

    public void Lineup(View view) {
        Intent intent = new Intent(Schedule.this, LineUp.class);
        startActivity(intent);
    }

    public void Newsfeed(View view) {
        Intent intent = new Intent(Schedule.this, NewsFeed.class);
        startActivity(intent);
    }
}