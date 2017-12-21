package com.tdd.kata.calculate_words.reference

import spock.lang.Specification

class WordProcessorTest extends Specification {

    def "should split right"() {
        given: 'various strings'
        def processor = new WordProcessor(input)
        expect: 'not throw exception and is expect result'
        processor.formatResult() == output
        where:
        input          | output
        null           | ""
        "and me"       | "and 1 \n me 1"
        "and and me"   | "and 2 \n me 1"
        "and me me"    | "me 2 \n and 1"
        "and  me"      | "and 1 \n me 1"
        "  and  me   " | "and 1 \n me 1"

    }
}
