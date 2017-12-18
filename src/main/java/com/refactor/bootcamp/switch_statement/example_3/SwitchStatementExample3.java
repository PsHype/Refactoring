package com.refactor.bootcamp.switch_statement.example_3;

class SwitchStatementExample3 {
    int height;
    int width;
    int length;

    void setHeight(int value) {
        height = value;
    }
    void setValue(String name, int value) {
        if (name.equals("height")) {
            setHeight(value);
            return;
        }
        if (name.equals("width")) {
            setWidth(value);
            return;
        }
        if (name.equals("length")) {
            setLength(value);
        }
    }

    public void setLength(int value) {
        this.length = value;
    }

    public void setWidth(int value) {
        this.width = value;
    }

}
