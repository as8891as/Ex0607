package com.example.ex0607;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton iBtn;
    ImageView imageV;
    int num;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iBtn = findViewById(R.id.iBtn);
        imageV = findViewById(R.id.imageV);
        rnd = new Random();
    }

    public void pressed(View view) {
        num = rnd.nextInt(3)+1;
        if (num==1)
        {
            iBtn.setImageResource(R.drawable.btn1);
            imageV.setImageResource(R.drawable.image1);
        }
        else if (num==2)
        {
            iBtn.setImageResource(R.drawable.btn2);
            imageV.setImageResource(R.drawable.image2);
        }
        else
        {
            iBtn.setImageResource(R.drawable.btn3);
            imageV.setImageResource(R.drawable.image3);
        }
    }
}