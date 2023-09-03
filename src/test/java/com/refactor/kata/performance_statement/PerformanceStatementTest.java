package com.refactor.kata.performance_statement;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.refactor.kata.performance_statement.model.Invoice;
import com.refactor.kata.performance_statement.model.Play;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class PerformanceStatementTest {
    static final String plays = "{" +
            "\"hamlet\":{\"name\":\"Hamlet\",\"type\":\"tragedy\"}," +
            "\"as-like\":{\"name\":\"As You Like It\",\"type\":\"comedy\"}," +
            "\"othello\":{\"name\":\"Othello\",\"type\":\"tragedy\"}" +
            "}";

    static final String invoices = "[{" +
            "\"customer\":\"BigCo\",\"performances\":[" +
            "{\"playId\":\"hamlet\",\"audience\":55}" +
            "{\"playId\":\"as-like\",\"audience\":35}" +
            "{\"playId\":\"othello\",\"audience\":40}" +
            "]" +
            "}]";

    static final String EXPECTED_RESULT = "Statement for BigCo Hamlet: $650.00 (55 seats)\n" +
            " As You Like It: $580.00 (35 seats)\n" +
            " Othello: $500.00 (40 seats)\n" +
            "Amount owed is $1,730.00\n" +
            "You earned 47 credits\n";

    @Test
    public void should_print_right_message() {
        TypeReference<Map<String, Play>> typeReference = new TypeReference<Map<String, Play>>() {
        };
        Map<String, Play> playMap = JSONObject.parseObject(plays, typeReference);
        List<Invoice> invoiceList = JSONObject.parseArray(invoices, Invoice.class);

        StringBuilder result = new StringBuilder();
        for (Invoice invoice : invoiceList) {
            Statement statement = new Statement(invoice, playMap);
            String statementLine = statement.show();
            result.append(statementLine);
        }

        Assert.assertEquals(EXPECTED_RESULT, result.toString());
    }
}
