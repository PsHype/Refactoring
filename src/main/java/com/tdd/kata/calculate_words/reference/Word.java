package com.tdd.kata.calculate_words.reference;

public class Word {
    private final String value;
    private int count;

    public Word(String value) {
        this.value = value;
        count = 1;
    }

    public void addCount() {
        count = count + 1;
    }

    private String getValue() {
        return value;
    }

    int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return getValue() + " " + getCount();
    }

}
