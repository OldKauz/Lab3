package ru.omgtu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayoutAct extends AppCompatActivity {

    Button nextAct;
    ImageView image;

    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        nextAct = (Button) findViewById(R.id.btn);
        image = (ImageView) findViewById(R.id.imageView1);

        nextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(n == 0) {
                    image.setImageResource(R.drawable.cat);
                    n = 1;
                }
                else if (n == 1) {
                    image.setImageResource(R.drawable.dog);
                    n = 2;
                }
                else{
                    image.setImageResource(R.drawable.giraffe);
                    n = 0;
                }
            }
        });
    }
}