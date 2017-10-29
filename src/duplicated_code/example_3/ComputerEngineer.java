package duplicated_code.example_3;

public class ComputerEngineer extends Engineer {

    public ComputerEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Computer";
    }


    public double getBillableAmount() {
        double base = unit;
        double tax = base * 0.2;
        return base + tax;
    }
}
