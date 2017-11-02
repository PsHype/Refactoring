package com.refactor.bootcamp.switch_statement.example_3;

class SwitchStatementExample3 {
    int height;
    int width;
    int length;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            this.height = value;
            return;
        }
        if (name.equals("width")) {
            this.width = value;
            return;
        }
        if (name.equals("length")) {
            this.length = value;
        }
    }

}
