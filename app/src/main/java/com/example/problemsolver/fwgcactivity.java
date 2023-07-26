package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;
import com.example.problemsolver.framework.ui.ProblemGUI;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.problemsolver.domains.farmer.FarmerProblem;

public class fwgcactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fwgcactivity);

        TextView startView = (TextView) findViewById(R.id.farmer_solve_start);
        TextView goalView = (TextView) findViewById(R.id.farmer_solve_goal);
        LinearLayout movesView = (LinearLayout) findViewById(R.id.farmer_moves);
        TextView countView = (TextView) findViewById(R.id.farmer_movecount);
        TextView message = (TextView) findViewById(R.id.message15);
        Button resetButton = (Button) findViewById(R.id.farmer_reset);
        Button solveButton = (Button)  findViewById(R.id. farmer_solve);
        Button nextButton = (Button)    findViewById(R.id. farmer_next);
        TextView stats = (TextView) findViewById(R.id.stats15layout);
        LinearLayout controls = (LinearLayout) findViewById(R.id. controls);



        new ProblemGUI(new FarmerProblem(), startView, goalView, movesView, countView, message, resetButton, solveButton, nextButton, controls, stats);
    }
}