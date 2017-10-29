package parallel_inheritance_hierarchies;

import org.junit.Assert;
import org.junit.Test;
import parallel_inheritance_hierarchies.refactored.RefactoredEngineerManager;

import java.util.List;

public class EngineerManagerTest {
    @Test
    public void should_return_engineer_info_each_both() throws Exception {
        List<Engineer> engineers = new EngineerManager().getEngineerList();

        Assert.assertEquals(2, engineers.size());
        Assert.assertEquals("computer_milestone", engineers.get(0).getMileStone().target());
        Assert.assertEquals("computer", engineers.get(0).getType());
        Assert.assertEquals("civil_milestone", engineers.get(1).getMileStone().target());
        Assert.assertEquals("civil", engineers.get(1).getType());
    }

    @Test
    public void should_return_engineer_info_each_both_with_refactored() throws Exception {
        List<parallel_inheritance_hierarchies.refactored.Engineer> engineers = new RefactoredEngineerManager().getEngineerList();

        Assert.assertEquals(2, engineers.size());
        Assert.assertEquals("computer_milestone", engineers.get(0).target());
        Assert.assertEquals("computer", engineers.get(0).getType());
        Assert.assertEquals("civil_milestone", engineers.get(1).target());
        Assert.assertEquals("civil", engineers.get(1).getType());
    }
}