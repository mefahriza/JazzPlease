package com.example.jazzplease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void GetTicket(View view) {
        Intent intent = new Intent(ActivityHome.this, GetTicket.class);
        startActivity(intent);
    }

    public void LineUp(View view) {
        Intent intent = new Intent(ActivityHome.this, LineUp.class);
        startActivity(intent);
    }

    public void Ads(View view) {
        Intent intent = new Intent(ActivityHome.this, Advertisement.class);
        startActivity(intent);
    }

    public void NewsFeed(View view) {
        Intent intent = new Intent(ActivityHome.this, NewsFeed.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(ActivityHome.this, Schedule.class);
        startActivity(intent);
    }

}