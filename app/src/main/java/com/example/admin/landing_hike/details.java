package com.example.admin.landing_hike;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class details extends AppCompatActivity{

    Button start_learn ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        start_learn = findViewById(R.id.learning);

        start_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(details.this , download.class);
                startActivity(intent);
            }
        });

    }
}
