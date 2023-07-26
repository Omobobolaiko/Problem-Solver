package com.example.problemsolver.domains.farmer;
import com.example.problemsolver.framework.problem.State;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;

public class FarmerState extends State {

    public enum Right {WEST, EAST};

    public  FarmerState ( Right farmer, Right wolf,  Right goat,  Right cabbage) {
        this.farmer = farmer;
        this.goat = goat;
        this.wolf = wolf;
        this.cabbage = cabbage;

    }
    public FarmerState(String farmer, String wolf, String goat,
                       String cabbage)
    {
        this(toRight(farmer), toRight(wolf), toRight(goat), toRight(cabbage));

    }

    public Right getgoat() {
        return this.goat;
    }
    public Right getfarmer() {
        return this.farmer;
    }
    public Right getcabbage() {
        return this.cabbage;
    }
    public Right getwolf() {
        return this.wolf;
    }

    @Override
    public boolean equals ( Object other) {
        FarmerState otherFarmer = (FarmerState) other;
        if (this == other)
        {
            return true;
        }
        else  if (other == null) {
            return false;
        }
        else {
            return (this.farmer == otherFarmer.farmer && this.wolf == otherFarmer.wolf &&
                    this.goat == otherFarmer.goat && this.cabbage == otherFarmer.cabbage);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.farmer);
        hash = 13 * hash + Objects.hashCode(this.wolf);
        hash = 13 * hash + Objects.hashCode(this.goat);
        hash = 13 * hash + Objects.hashCode(this.cabbage);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String first = "   |  |   \n";
        String Westcabbage = " C |  |   \n";
        String Eastcabbage = "   |  | C \n";
        String Westfarmer = " F |  |   \n";
        String Eastfarmer = "   |  | F \n";
        String Westgoat = " G |  |   \n";
        String Eastgoat = "   |  | G \n";
        String Westwolf = " W |  |   \n";
        String Eastwolf = "   |  | W \n";
        String last = "   |  |   ";

        sb.append(first);
        if(this.farmer == Right.WEST){
            sb.append(Westfarmer);
        }
        else {
            sb.append(Eastfarmer);
        }

        if(this.wolf==Right.WEST) {
            sb.append(Westwolf);
        }
        else {
            sb.append(Eastwolf);
        }

        if(this.goat==Right.WEST) {
            sb.append(Westgoat);
        }
        else {
            sb.append(Eastgoat);
        }

        if(this.cabbage==Right.WEST) {
            sb.append(Westcabbage);
        }
        else {
            sb.append(Eastcabbage);
        }
        sb.append(last);
        return sb.toString();
    }

    private static Right toRight(String pass) {
        if (pass.equalsIgnoreCase("west"))
        {
            return Right.WEST;
        }
        else  if (pass. equalsIgnoreCase("east")) {
            return Right.EAST;
        }
        else {
            throw new RuntimeException("wrong pass: " + pass);
        }
    }


    private Right farmer;
    private  Right wolf;
    private Right goat;
    private Right cabbage;



}

