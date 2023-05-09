package Repository;

import Model.Calculations;

public class Functions {


    public double division(double variable1, double variable2) {
        try {
            return variable1 / variable2;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured " + e.getMessage());
            return 0;
        } catch (Exception e) {
            System.out.println("Exception Occured" + e.getMessage());
            return 0;
        }

    }

    public int multiplication(int variable1, int variable2) {
        return variable1 * variable2;
    }

    public int subtraction(int variable1, int variable2) {
        return variable1 - variable2;
    }


    public int addition(int variable1, int variable2) {
        return variable1 + variable2;
    }
}