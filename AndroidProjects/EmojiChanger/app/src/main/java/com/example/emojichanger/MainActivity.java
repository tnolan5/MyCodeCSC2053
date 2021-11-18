package com.example.emojichanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView emojiImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emojiImage = findViewById(R.id.emoji_imageView);
    }

    public void changeEmoji(View view) {
        int rand = (int)(Math.random()*4);
        if (rand == 0) {
            emojiImage.setImageResource(R.drawable.love);
        }
        if (rand == 1) {
            emojiImage.setImageResource(R.drawable.happy);
        }
        if (rand == 2) {
            emojiImage.setImageResource(R.drawable.nerd);
        }
        if (rand == 3) {
            emojiImage.setImageResource(R.drawable.thinking_face);
        }

    }
}