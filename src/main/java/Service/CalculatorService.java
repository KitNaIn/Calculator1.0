package Service;

import Repository.Functions;

public class CalculatorService {

    private final Functions functions = new Functions();


    public double divide (double variable1 , double variable2){
        return functions.division(variable1, variable2);
    }

    public int multiply (int variable1, int variable2){
        return functions.multiplication(variable1, variable2);
    }

    public int subtract (int variable1, int variable2){
        return functions.subtraction(variable1, variable2);
    }

    public int add (int variable1, int variable2){
        return functions.addition(variable1,variable2);
    }

}
