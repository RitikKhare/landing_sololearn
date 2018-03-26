package com.example.admin.landing_hike;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class download extends AppCompatActivity {

    ImageView Android_store;

    ImageView Apple_store;

    ImageView web;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download);

        Android_store = findViewById(R.id.play_store);

        Apple_store = findViewById(R.id.app_store);

        web = findViewById(R.id.web);

        Android_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://play.google.com/store/apps/details?id=com.sololearn");
            }
        });

        Apple_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://itunes.apple.com/us/app/sololearn-learn-to-code/id1210079064?mt=8");
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.sololearn.com/Courses/");
            }
        });

    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
