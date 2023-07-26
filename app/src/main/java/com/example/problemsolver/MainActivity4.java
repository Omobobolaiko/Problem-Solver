package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.problemsolver.domains.farmer.FarmerProblem;
import com.example.problemsolver.domains.puzzle.Puzzle15Problem;
import com.example.problemsolver.framework.ui.ProblemGUI;

public class MainActivity4 extends AppCompatActivity {
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this,puzzle15activity.class);
                startActivity(intent);
            }
        });
    }
    }
