package parallel_inheritance_hierarchies;

public class CivilEngineer implements Engineer {
    @Override
    public String getType() {
        return "civil";
    }

    @Override
    public MileStone getMileStone() {
        return new CivilMileStone();
    }
}
