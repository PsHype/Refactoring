package com.tdd.kata.calculate_words.reference

import spock.lang.Specification

class WordProcessorTest extends Specification {

    def "should split right given null string"() {
        given: 'null'
        def processor = new WordProcessor(null)
        expect: "not throw exception"
        processor.splitResult() == ""
    }


}
