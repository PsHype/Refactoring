package parallel_inheritance_hierarchies;

public class ComputerEngineer implements Engineer {

    @Override
    public String getType() {
        return "computer";
    }

    @Override
    public MileStone getMileStone() {
        return new ComputerMileStone();
    }

}


