package duplicated_code.example_3;

class CivilEngineer extends Engineer {

    public CivilEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Civil";
    }

    public double getBillableAmount() {
        double base = unit * 0.8;
        double tax = base * 0.1;
        return base + tax;
    }
}
