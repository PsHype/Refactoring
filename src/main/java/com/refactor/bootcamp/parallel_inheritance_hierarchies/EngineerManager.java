package com.refactor.bootcamp.parallel_inheritance_hierarchies;

import java.util.ArrayList;
import java.util.List;

public class EngineerManager {

    public List<Engineer> getEngineerList() {
        ArrayList<Engineer> list = new ArrayList<>();
        list.add(new BackendEngineer());
        list.add(new FrontendEngineer());
        return list;
    }
}
