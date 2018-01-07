package com.refactor.bootcamp.middle_man.example_1;

public class Department {
    private String name;
    private String group;
    private String region;
    private String city;

    public Department(String name, String group, String region, String city) {
        this.name = name;
        this.group = group;
        this.region = region;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }
}
