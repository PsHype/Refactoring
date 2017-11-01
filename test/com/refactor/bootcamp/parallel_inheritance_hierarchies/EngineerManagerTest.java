package com.refactor.bootcamp.parallel_inheritance_hierarchies;

import com.refactor.bootcamp.parallel_inheritance_hierarchies.refactored.Engineer;
import org.junit.Assert;
import org.junit.Test;
import com.refactor.bootcamp.parallel_inheritance_hierarchies.refactored.RefactoredEngineerManager;

import java.util.List;

public class EngineerManagerTest {
    @Test
    public void should_return_engineer_info_each_both() throws Exception {
        List<com.refactor.bootcamp.parallel_inheritance_hierarchies.Engineer> engineers = new EngineerManager().getEngineerList();

        Assert.assertEquals(2, engineers.size());
        Assert.assertEquals("backend_milestone", engineers.get(0).getMileStone().target());
        Assert.assertEquals("Backend", engineers.get(0).getType());
        Assert.assertEquals("frontend_milestone", engineers.get(1).getMileStone().target());
        Assert.assertEquals("Frontend", engineers.get(1).getType());
    }

    @Test
    public void should_return_engineer_info_each_both_with_refactored() throws Exception {
        List<Engineer> engineers = new RefactoredEngineerManager().getEngineerList();

        Assert.assertEquals(2, engineers.size());
        Assert.assertEquals("backend_milestone", engineers.get(0).target());
        Assert.assertEquals("Backend", engineers.get(0).getType());
        Assert.assertEquals("frontend_milestone", engineers.get(1).target());
        Assert.assertEquals("Frontend", engineers.get(1).getType());
    }
}