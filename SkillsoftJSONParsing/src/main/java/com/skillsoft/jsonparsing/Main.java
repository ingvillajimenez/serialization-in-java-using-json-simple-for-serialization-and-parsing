package com.skillsoft.jsonparsing;

import org.json.simple.JSONObject; // class JSONObject
import org.json.simple.JSONValue; // class JSONValue

import java.io.FileWriter; // class FileWriter
import java.io.FileReader; // class FileReader
import java.io.IOException; // class IOException

public class Main {

//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        System.out.println("**** Reading JSON");

        try (FileReader reader = new FileReader("diner.json")) {

            JSONObject dinerData = (JSONObject) JSONValue.parse(reader);
            System.out.println(dinerData);
            //{"gender":null,"isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27}

            String name = (String) dinerData.get("name");
            System.out.println("\ndiner name: " + name); //diner name: Jane Stark

            String gender = (String) dinerData.get("gender");
            System.out.println("diner gender: " + gender); //diner gender: null

            long age = (long) dinerData.get("age");
            System.out.println("diner age: " + age); //diner age: 22

            double amountSpent = (double) dinerData.get("amountSpent");
            System.out.println("diner spending: " + amountSpent); //diner spending: 153.27

            Boolean isAllergic = (Boolean) dinerData.get("isAllergic");
            System.out.println("diner isAllergic: " + isAllergic); //diner isAllergic: false

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("**** Completed reading JSON");

//        System.out.println("**** Creating JSONObject");
//
//        JSONObject diner = new JSONObject();
//
//        diner.put("name", "Jane Stark");
//        diner.put("age", 22);
//        diner.put("gender", null);
//        diner.put("isAllergic", false);
//        diner.put("amountSpent", 153.27);
//
//        System.out.println(diner.toJSONString());
//        //{"gender":null,"isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27}
//
//        try (FileWriter file = new FileWriter("diner.json")) {
//            diner.writeJSONString(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("**** Writing out JSONObject");
    }
}

// JSON Simple
//A simple, lightweight, library to read and write JSON, which also works with streams

// Apache Maven
//Build management tool to configure and manage project dependencies

// pom.xml
//Project object Model is the fundamental unit of work in Maven

// jsonformatter.org/json-pretty-print
