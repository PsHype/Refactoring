package com.refactor.kata.performance_statement;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.refactor.kata.performance_statement.model.Invoice;
import com.refactor.kata.performance_statement.model.Play;

import java.util.List;
import java.util.Map;

public class Main {

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

    public static void main(String[] args) {
        TypeReference<Map<String, Play>> typeReference = new TypeReference<Map<String, Play>>() {};
        Map<String, Play> playMap = JSONObject.parseObject(plays, typeReference);
        List<Invoice> invoiceList = JSONObject.parseArray(invoices, Invoice.class);
        for (Invoice invoice : invoiceList) {
            Statement statement = new Statement(invoice, playMap);
            String result = statement.show();
            System.out.println(result);
        }
    }
}
