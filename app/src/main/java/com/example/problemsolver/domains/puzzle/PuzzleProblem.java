package com.example.problemsolver.domains.puzzle;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Problem;

public class PuzzleProblem  extends Problem {

    public  PuzzleProblem()
    {
        super();
        super.setName("Puzzle ");
        super.setMover(new PuzzleMover());
        super.setIntroduction(INTRO);
        super.setInitialState(BENCH1);
        super.setCurrentState(super.getInitialState());
        super.setFinalState(GOAL);
        super.addBenchmark(new Benchmark("8-Puz 1", 5, BENCH1, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 2", 10, BENCH2, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 3", 13, BENCH3, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 4", 18, BENCH4, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 5", 20, BENCH5, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 6", 24, BENCH6, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 7", 30, BENCH7, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 8", 30, BENCH8, GOAL));
    }


    private final PuzzleState BENCH1 = new PuzzleState(new int[][]{
            new int[]{2, 8, 3},
            new int[] {1, 6, 4},
            new int[] {7, 0, 5}});
    private final PuzzleState BENCH2 = new PuzzleState(new int[][]{
            new int[]{3, 6, 4},
            new int[] {1, 0, 2},
            new int[] {8, 7, 5}});

    private final PuzzleState BENCH3 = new PuzzleState(new int[][]{
            new int[]{3, 0, 4},
            new int[] {1, 6, 5},
            new int[] {8, 2, 7}});
    private final PuzzleState BENCH4 = new PuzzleState(new int[][]{
            new int[]{2, 1, 3},
            new int[] {8, 0, 4},
            new int[] {6, 7, 5}});
    private final PuzzleState BENCH5= new PuzzleState(new int[][]{
            new int[]{4, 2, 0},
            new int[] {8, 3, 6},
            new int[] {7, 5, 1}});
    private final PuzzleState BENCH6 = new PuzzleState(new int[][]{
            new int[]{1, 6, 3},
            new int[] {4, 0, 8},
            new int[] {7, 2, 5}});
    private final PuzzleState BENCH7 = new PuzzleState(new int[][]{
            new int[]{5, 6, 7},
            new int[] {4, 0, 8},
            new int[] {3, 2, 1}});
    private final PuzzleState BENCH8 = new PuzzleState(new int[][]{
            new int[]{5, 2, 7},
            new int[] {8, 0, 4},
            new int[] {3, 6, 1}});
    private final PuzzleState GOAL = new PuzzleState(new int[][]{
            new int[]{1, 2, 3},
            new int[] {8, 0, 4},
            new int[] {7, 6, 5}});



    private static final String INTRO =
            "you are given a board in which number tiles can slide around" +
                    "There is one blank space that holds no tile. A legal move" +
                    "consists of sliding a tile into the blan spaxe if the tile is" +
                    "adjacent to it. The goal is to move tiles around tiles around until the board" +
                    "looks like the final state below.";


}

