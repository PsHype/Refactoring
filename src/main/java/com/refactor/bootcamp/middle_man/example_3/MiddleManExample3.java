package com.refactor.bootcamp.middle_man.example_3;

public class MiddleManExample3 {
    private Frontend frontend;

    public MiddleManExample3(Frontend frontend) {
        this.frontend = frontend;
    }

    public Frontend getFrontend() {
        return frontend;
    }
}
