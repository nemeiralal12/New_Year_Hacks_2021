package com.example.new_year_new_hacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArticleChoose extends AppCompatActivity {
    private Button article1;
    private Button article2, article3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_choose);
        article1 = findViewById(R.id.button1);
        article1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleChoose.this, Article1.class));
            }
        });
        article2 = findViewById(R.id.button2);
        article2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleChoose.this, Article2.class));
            }
        });
        article3 = findViewById(R.id.button3);
        article3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleChoose.this, Article3.class));
            }
        });
    }
}