package com.example.problemsolver.domains.arithmetic;
import com.example.problemsolver.framework.problem.Problem;

public class ArithmeticProblem  extends Problem {

    public  ArithmeticProblem() {
        super();
        super.setName("Arthimetic");
        super.setIntroduction(INTRO);
        super.setMover(new  ArithmeticMover());
        super.setInitialState(new ArithmeticState(0));
        super.setCurrentState(new ArithmeticState(0));
        super.setFinalState(new ArithmeticState(17));
    }

    private static final String INTRO =
            "The starting value is zero. " +
                    "Your options are to add 3, subtract 5, " +
                    "divide by 2, or multiply by 2. " +
                    "Find a sequence of operations that results in the value 17.";

}
