package Model;

public class Calculations {

    private int variable1;
    private int variable2;

    private int variable3;

    public Calculations(int variable1, int variable2, int variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public Calculations() {
    }

    public int getVariable1() {
        return variable1;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }
}
