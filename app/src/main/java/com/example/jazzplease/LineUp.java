package com.example.jazzplease;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LineUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_up);
    }

    public void Jazz(View view) {
        Intent intent = new Intent(LineUp.this, ActivityHome.class);
        startActivity(intent);
    }

    public void Getticket(View view) {
        Intent intent = new Intent(LineUp.this, GetTicket.class);
        startActivity(intent);
    }

    public void Newsfeed(View view) {
        Intent intent = new Intent(LineUp.this, NewsFeed.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(LineUp.this, Schedule.class);
        startActivity(intent);
    }
}