package com.example.problemsolver.framework.ui;

import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.problemsolver.framework.graph.Vertex;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.AStarSolver;
import com.example.problemsolver.framework.solution.Solution;
import com.example.problemsolver.framework.solution.Solver;
import com.example.problemsolver.framework.solution.SolvingAssistant;

import org.w3c.dom.Node;

public class Problem15GUI {
    public Problem15GUI(Problem problem, TextView startView, TextView goalView, TextView countView, TextView message, Button resetButton, Button solvebutton, Button nextButton,  LinearLayout controls, TextView stats) {
        this.problem = problem;
        solvers = new SolvingAssistant(problem);
        this.startView = startView;
        this.goalView= goalView;

        this.message = message;
        this.countView = countView;
        this.resetButton = resetButton;
        this.solveButton = solvebutton;
        this.stats = stats;
        this.sol = sol;
        this.solver = solver;
        this.controls = controls;
        context = message.getContext();


        startView.setText(problem.getCurrentState().toString());
        goalView.setText(problem.getFinalState().toString());
//      for (String names : problem.getMover().getMoveNames()) {
//
//           Button button = new Button(movesView.getContext());
//           button.setText(names);
//           button.setOnClickListener(e ->
//           {
//               solvers.tryMove(names);
//              startView.setText(problem.getCurrentState().toString());
//               solvers.getMoveCount();
//               message.setText("");
//               if (!solvers.isMoveLegal()) {
//                   message.setText("SORRY. " +
//                           "ILLEGAL MOVE.");
//               } else if (solvers.isProblemSolved()) {
//                   message.setText("OH NICE! YOU DID WELL. " +
//                           "TAKE A COOKIE");
////                }
////                if (problem != null) {
////                    problem.getCurrentState();
////                } else {
////
////                    startView.setText(problem.getCurrentState().toString());
////                }
////
////
////                countView.setText(String.format("%d", solvers.getMoveCount()));
////
////            });
////            movesView.addView(button);
////        }

        resetButton.setOnClickListener(view->{
            solvers.reset();
            startView.setText(problem.getCurrentState().toString());
            message.setText("");
            countView.setText("0");
            stats.setText("");
            solveButton.setEnabled(true);
         //   movesView.setVisibility(movesView.VISIBLE);
        });


        solveButton.setOnClickListener(view ->{
            solver = new AStarSolver(problem);
            solver.solve();
            sol = solver.getSolution();
            stats.setText(solver.getStatistics().toString());
            sol.next();
        //
            //    movesView.setVisibility(movesView.INVISIBLE);
            solveButton.setEnabled(false);
            nextButton.setEnabled(true);


        });

        nextButton.setOnClickListener(view -> {
            if (sol.hasNext()) {
                Vertex nv = sol.next();
                Vertex predd = nv.getPredecessor();
                State nex = (State) nv.getData();
                solvers.update(nex);
                startView.setText(nex.toString());
                State temp = (State) predd.getData();
                String moveSS = null;
                for (String name : problem.getMover().getMoveNames()) {

                    State wow = (State) problem.getMover().doMove(name, temp);
                    if (nex.equals(wow)) {
                        moveSS = name;
                        solvers.getMoveCount();
                    }
                }

//                if (button.equals(moveSS)) {
//                    button.setStyle("-fx-background-color: red");
//                }
                countView.setText(String.format("%d", solvers.getMoveCount()));
                if (problem.getCurrentState().equals(problem.getFinalState())) {
                    message.setText("YOU SOLVED THE PROBLEM." +
                            " CONGRATS");

                    // nextb.setDisable(false);
                }
            }

        });
  makeBenchmarks();
    }
    private void makeBenchmarks() {
        benchSpinner = new Spinner(context, Spinner.MODE_DROPDOWN);

        String[] nameArray = new String[problem.getBenchmarks().size()];
        for (int i = 0; i <problem.getBenchmarks().size(); i++) {
            nameArray[i] = problem.getBenchmarks().get(i).toString();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<> (context, android.R.layout.simple_spinner_dropdown_item, nameArray);
        benchSpinner.setAdapter(adapter);
        benchSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Benchmark b = problem.getBenchmarks().get(i);
                problem.setInitialState(b.getStart());
                problem.setFinalState(b.getGoal());
                solvers.reset();
                stats.setText("");
                problem.setCurrentState(b.getStart());

                startView.setText(problem.getCurrentState().toString());
                countView.setText(String.format("%d", solvers.getMoveCount()));

            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        controls.addView(benchSpinner);

    }

//    private void makeBenchmarks() {
//        String[] nameArray = new String[benchmarks.size()];
//        for (int i = 0; i <benchmarks.size(); i++) {
//            nameArray[i] = benchmarks.get(i).toString();
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<> (context, android.R.layout.simple_spinner_dropdown_item, nameArray);
//        benchSpinner.setAdapter(adapter);
//        benchSpinner.setOnItemSelectedListener(new AdapterView.OnItenSelectedListener() {
//            Benchmark b = benchmarks.get(i);
//            problem.setInitialState(b.getStart());
//            problem.setFinalState(b.getGoal());
//            assistant.reset();
//
//        }

    //  }
    private SolvingAssistant solvers;
    private  Problem problem;
    private String Message;
    private TextView startView;
    private TextView goalView;
    private LinearLayout movesView;
    private TextView message;
    private TextView countView;
    private Button resetButton;
    private Button solveButton;
    private Button  nextButton;
    private Solver solver ;
    private Solution sol;
    private TextView stats;
    private Button button;
    private Context context;
    private Benchmark benchmarks;
    private Spinner benchSpinner;
    private LinearLayout controls;

}
