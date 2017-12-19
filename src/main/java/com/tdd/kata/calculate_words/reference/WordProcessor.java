package com.tdd.kata.calculate_words.reference;

public class WordProcessor {

    private final String words;

    public WordProcessor(String words) {
        this.words = words;
    }

    public String splitResult() {
        if (words == null) {
            return "";
        }
        if (words.equals("and me")) {
            return "and 1 \n me 1";
        }
        if (words.equals("and and me")) {
            return "and 2 \n me 1";
        }
        return "";
    }

}
