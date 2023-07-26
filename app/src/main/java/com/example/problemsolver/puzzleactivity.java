package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.framework.ui.ProblemGUI;

public class puzzleactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzleactivity);

        TextView startView = (TextView) findViewById(R.id.puzzle_solve_start);
        TextView goalView = (TextView) findViewById(R.id.puzzle_solve_goal);
        LinearLayout movesView = (LinearLayout) findViewById(R.id.puzzle_moves);
       TextView countView = (TextView) findViewById(R.id.puzzle_movecount);
       TextView message = (TextView) findViewById(R.id.message);
        Button resetButton = (Button) findViewById(R.id.puzzle_reset);
       Button solveButton = (Button)  findViewById(R.id. puzzle_solve);
       Button nextButton = (Button)    findViewById(R.id. puzzle_next);
        TextView stats = (TextView) findViewById(R.id.stats15layout);
        LinearLayout controls = (LinearLayout) findViewById(R.id. controls);




        new ProblemGUI(new PuzzleProblem(), startView, goalView, movesView, countView, message, resetButton, solveButton, nextButton, controls, stats);
    }


    }
