package com.skillsoft.jsonparsing;

import org.json.simple.JSONAware; // interface JSONAware
import org.json.simple.JSONStreamAware; // interface JSONStreamAware
import org.json.simple.JSONValue; // class JSONValue

import java.io.IOException; // class IOException
import java.io.Serializable; // interface Serializable
import java.io.Writer; // abstract class Writer
import java.util.LinkedHashMap; // class LinkedHashMap
import java.util.Map; // interface Map

public class Diner implements JSONStreamAware {

    private String name;
    private int age;
    private String gender;
    private float amountSpent;

    public Diner(String name, int age, String gender, float amountSpent) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.amountSpent = amountSpent;
    }

    @Override
    public void writeJSONString(Writer writer) throws IOException {
        Map<String, Serializable> map = new LinkedHashMap<String, Serializable>();

        map.put("name", name);
        map.put("age", age);
        map.put("gender", gender);
        map.put("amountSpent", amountSpent);

        JSONValue.writeJSONString(map, writer);
    }
}

//public class Diner implements JSONAware {
//
//    private String name;
//    private int age;
//    private String gender;
//    private float amountSpent;
//
//    public Diner(String name, int age, String gender, float amountSpent) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.amountSpent = amountSpent;
//    }
//
//    @Override
//    public String toJSONString() {
//        return String.format("{\"name\": \"%s\", \"age\": %d, \"gender\": \"%s\", \"amountSpent\": %f}",
//                name, age, gender, amountSpent);
//    }
//}
