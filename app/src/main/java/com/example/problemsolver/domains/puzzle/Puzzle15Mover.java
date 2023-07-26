package com.example.problemsolver.domains.puzzle;

import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;
public class Puzzle15Mover extends Mover{
    public static final String T1 = "SLIDE TILE 1";
    public static final String T2 = "SLIDE TILE 2";
    public static final String T3 = "SLIDE TILE 3";
    public static final String T4 = "SLIDE TILE 4";
    public static final String T5 = "SLIDE TILE 5";
    public static final String T6 = "SLIDE TILE 6";
    public static final String T7 = "SLIDE TILE 7";
    public static final String T8 = "SLIDE TILE 8";
    public static final String T9 = "SLIDE TILE 9";
    public static final String T10 = "SLIDE TILE 10";
    public static final String T11 = "SLIDE TILE 11";
    public static final String T12 = "SLIDE TILE 12";
    public static final String T13 = "SLIDE TILE 13";
    public static final String T14 = "SLIDE TILE 14";
    public static final String T15 = "SLIDE TILE 15";

    public Puzzle15Mover() {
        super.addMove(T1,s -> testSlide1(1, s));
        super.addMove(T2,s -> testSlide2(2,s));
        super.addMove(T3,s -> testSlide3( 3, s));
        super.addMove(T4,s -> testSlide4(4,  s));
        super.addMove(T5,s -> testSlide5( 5, s));
        super.addMove(T6,s -> testSlide6( 6, s));
        super.addMove(T7,s -> testSlide7(7, s));
        super.addMove(T8,s -> testSlide8( 8,s));
        super.addMove(T9,s -> testSlide9( 9,s));
        super.addMove(T10,s -> testSlide10(10,s));
        super.addMove(T11, s -> testSlide11(11,s));
        super.addMove(T12, s -> testSlide12(12,s));
        super.addMove(T13, s -> testSlide13(13,s));
        super.addMove(T14, s -> testSlide14(14,s));
        super.addMove(T15, s -> testSlide15(15,s));

    }

    private PuzzleState testSlide1(final int t, final State s) {



        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);
    }
    private PuzzleState testSlide2(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn){
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }
    private PuzzleState testSlide3(final int t, final State s) {


        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn){
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }
    private PuzzleState testSlide4(final int t, final State s) {


        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1) {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }
    private PuzzleState testSlide5(final int t, final State s) {


        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);



    }

    private PuzzleState testSlide6(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }


        return new PuzzleState(state, tLoc, cLoc);



    }
    private PuzzleState testSlide7(final int t, final State s) {


        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)  {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide8(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide9(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide10(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide11(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide12(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide13(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide14(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }

    private PuzzleState testSlide15(final int t, final State s) {

        PuzzleState state = (PuzzleState)s;
        PuzzleState.Location tLoc = state.getLocation(t);
        PuzzleState.Location cLoc = state.getLocation(0);
        int tRow = tLoc.getRow();
        int tColumn = tLoc.getColumn();
        int cRow = cLoc.getRow();
        int cColumn = cLoc.getColumn();

        if (tRow != cRow + 1 && tRow != cRow - 1 && tColumn !=
                cColumn + 1 && tColumn != cColumn - 1)
        {
            return null;
        }

        if (tRow != cRow && tColumn != cColumn) {
            return null;
        }

        return new PuzzleState(state, tLoc, cLoc);

    }




}

