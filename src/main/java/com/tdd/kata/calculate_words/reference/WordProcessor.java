package com.tdd.kata.calculate_words.reference;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WordProcessor {

    private final String words;

    public WordProcessor(String words) {
        this.words = words;
    }

    public String formatResult() {
        if (Strings.isNullOrEmpty(words)) {
            return "";
        }

        ArrayList<Word> words = groupAndSortWords();
        return Joiner.on(" \n ").join(words);
    }

    private ArrayList<Word> groupAndSortWords() {
        List<Word> words = groupWords();
        Stream<Word> sorted = words.stream().sorted(Comparator.comparingInt(Word::getCount).reversed());
        return Lists.newArrayList(sorted.iterator());
    }

    private List<Word> groupWords() {
        Map<String, Word> wordMaps = new HashMap<>();
        List<String> result = Splitter.onPattern("\\s+").omitEmptyStrings().splitToList(words);

        for (String w : result) {
            if (wordMaps.containsKey(w)) {
                Word word = wordMaps.get(w);
                word.addCount();
                continue;
            }
            wordMaps.put(w, new Word(w));
        }
        return Lists.newArrayList(wordMaps.values());
    }

}
