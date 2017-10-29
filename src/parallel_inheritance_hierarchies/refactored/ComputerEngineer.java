package parallel_inheritance_hierarchies.refactored;

public class ComputerEngineer implements Engineer {

    @Override
    public String getType() {
        return "computer";
    }

    @Override
    public String target() {
        return "computer_milestone";
    }

}


