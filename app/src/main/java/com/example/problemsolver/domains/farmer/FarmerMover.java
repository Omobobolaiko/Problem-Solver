package com.example.problemsolver.domains.farmer;

import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;
public class FarmerMover extends Mover {

    public static final String GOESALONE = "Farmer Goes Alone";
    public static final String TAKESWOLF = "Farmer Takes Wolf";
    public static final String TAKESGOAT = "Farmer Takes Goat";
    public static final String TAKESCABBAGE = "Farmer Takes Cabbage";


    public FarmerMover() {
        super.addMove(GOESALONE, s -> tryGoesAlone(s));
        super.addMove(TAKESWOLF, s -> tryTakesWolf(s));
        super.addMove(TAKESGOAT, s -> tryTakesGoat(s));
        super.addMove(TAKESCABBAGE, s -> tryTakesCabbage(s));
    }

    private static FarmerState.Right goThrough(FarmerState.Right right) {
        if (right == FarmerState.Right.EAST) {
            return FarmerState.Right.WEST;
        } else {
            return FarmerState.Right.EAST;
        }
    }

    private static State iss(FarmerState state) {
        if (cantGo(state)) {
            return state;
        } else {
            return null;
        }
    }

    private static boolean cantGo(FarmerState state) {
        FarmerState.Right farmer = state.getfarmer();
        FarmerState.Right wolf = state.getwolf();
        FarmerState.Right goat = state.getgoat();
        FarmerState.Right cabbage = state.getcabbage();
        return (cabbage != goat || farmer == cabbage) && (goat != wolf || goat == farmer);

    }

    private State tryGoesAlone(State state) {
        FarmerState s = (FarmerState) state;
        return iss(new FarmerState(goThrough(s.getfarmer()), s.getwolf(),
                s.getgoat(), s.getcabbage()));
    }


    private State tryTakesWolf(State state) {
        FarmerState s = (FarmerState) state;
        if (s.getfarmer() != s.getwolf()) {
            return null;
        } else {
            return iss(new FarmerState(goThrough(s.getfarmer()), goThrough(s.getwolf()), s.getgoat(), s.getcabbage()));
        }
    }


    private State tryTakesGoat(State state) {
        FarmerState s = (FarmerState) state;
        if (s.getfarmer() != s.getgoat()) return null;
        else return iss(new FarmerState(goThrough(s.getfarmer()),
                s.getwolf(), goThrough(s.getgoat()), s.getcabbage()));
    }


    private State tryTakesCabbage(State state) {
        FarmerState s = (FarmerState) state;
        if (s.getfarmer() != s.getcabbage()) {
            return null;
        } else {
            return iss(new FarmerState(goThrough(s.getfarmer()),
                    s.getwolf(), s.getgoat(), goThrough(s.getcabbage())));
        }
    }
}