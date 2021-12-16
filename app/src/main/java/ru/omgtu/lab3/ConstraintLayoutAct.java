package ru.omgtu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintLayoutAct extends AppCompatActivity {

    Button nextAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        nextAct = (Button) findViewById(R.id.bt);

        nextAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".FrameLayoutAct");
                startActivity(intent);
            }
        });


    }
}