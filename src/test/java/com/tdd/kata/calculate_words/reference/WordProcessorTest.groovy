package com.tdd.kata.calculate_words.reference

import spock.lang.Ignore
import spock.lang.Specification

class WordProcessorTest extends Specification {

    def "should split right given null string"() {
        given: 'null'
        def processor = new WordProcessor(null)
        expect: "not throw exception"
        processor.splitResult() == ""
    }

    def "should split right given word 'and me'"() {
        given: 'and me'
        def processor = new WordProcessor("and me")
        expect:
        processor.splitResult() == "and 1 \n me 1"
    }

    def "should split right given word 'and and me'"() {
        given: 'and and me'
        def processor = new WordProcessor("and and me")
        expect:
        processor.splitResult() == "and 2 \n me 1"
    }


    @Ignore
    def "should split right given word 'and me me'"() {
        given: 'and me me'
        def processor = new WordProcessor("and me me")
        expect:
        processor.splitResult() == "me 2 \n and 1"
    }

    def "should split right given word 'and  me'"() {

    }
}
