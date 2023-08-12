package com.skillsoft.jsonparsing;

import org.json.simple.JSONArray; // class JSONArray
import org.json.simple.JSONObject; // class JSONObject
import org.json.simple.JSONValue; // class JSONValue

import java.io.FileReader; // class FileReader
import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        System.out.println("**** Reading JSON");

        try(FileReader reader = new FileReader("diners.json")) {

            JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
            System.out.println(dinerListObject);
            //{"diners":[{"gender":"Female","isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27},{"name":"Json Snow","age":25,"amountSpent":750.5}]}

            JSONArray dinerList = (JSONArray) dinerListObject.get("diners");

            for (Object object : dinerList) {
                JSONObject diner = (JSONObject) object;

                System.out.println("\n**** Diner");

                for (Object field: diner.entrySet() ) {
                    System.out.println(field);
                }
            }
            //**** Diner
            //gender=Female
            //isAllergic=false
            //name=Jane Stark
            //age=22
            //amountSpent=153.27
            //
            //**** Diner
            //name=Json Snow
            //age=25
            //amountSpent=750.5
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("**** Completed reading JSON");

//        System.out.println("**** Creating JSONArray of JSONObjects");
//
//        JSONObject dinerListObject = new JSONObject();
//
//        JSONArray dinerList = new JSONArray();
//
//        JSONObject diner1 = new JSONObject();
//        diner1.put("name", "Jane Stark");
//        diner1.put("age", 22);
//        diner1.put("gender", "Female");
//        diner1.put("isAllergic", false);
//        diner1.put("amountSpent", 153.27);
//
//        JSONObject diner2 = new JSONObject();
//        diner2.put("name", "Json Snow");
//        diner2.put("age", 25);
//        diner2.put("amountSpent", 750.5);
//
//        dinerList.add(diner1);
//        dinerList.add(diner2);
//
//        dinerListObject.put("diners", dinerList);
//
//        System.out.println(dinerListObject);
//        //{"diners":[{"gender":"Female","isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27},{"name":"Json Snow","age":25,"amountSpent":750.5}]}
//
//        try (FileWriter file = new FileWriter("diners.json")) {
//            dinerListObject.writeJSONString(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("**** Writing out JSONArray of JSONObjects");

//        System.out.println("**** Reading JSON");
//
//        try (FileReader reader = new FileReader("diners.json")) {
//
//            JSONArray dinerList = (JSONArray) JSONValue.parse(reader);
//            System.out.println(dinerList);
//            //[{"gender":"Female","isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27},{"gender":"Male","isAllergic":false,"name":"Json Snow","age":25,"amountSpent":750.5}]
//
//            for (Object object : dinerList) {
//                JSONObject diner = (JSONObject) object;
//
//                System.out.println("\n**** Diner");
//
//                String name = (String) diner.get("name");
//                System.out.println("\ndiner name: " + name);
//                //diner name: Jane Stark
//                //diner name: Json Snow
//
//                String gender = (String) diner.get("gender");
//                System.out.println("diner gender: " + gender);
//                //diner gender: Female
//                //diner gender: Male
//
//                long age = (long) diner.get("age");
//                System.out.println("diner age: " + age);
//                //diner age: 22
//                //diner age: 25
//
//                double amountSpent = (double) diner.get("amountSpent");
//                System.out.println("diner spending: " + amountSpent);
//                //diner spending: 153.27
//                //diner spending: 750.5
//
//                Boolean isAllergic = (Boolean) diner.get("isAllergic");
//                System.out.println("diner isAllergic: " + isAllergic);
//                //diner isAllergic: false
//                //diner isAllergic: false
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("**** Completed reading JSON");

//        System.out.println("**** Creating JSONArray of JSONObjects");
//
//        JSONArray dinerList = new JSONArray();
//
//        JSONObject diner1 = new JSONObject();
//        diner1.put("name", "Jane Stark");
//        diner1.put("age", 22);
//        diner1.put("gender", "Female");
//        diner1.put("isAllergic", false);
//        diner1.put("amountSpent", 153.27);
//
//        JSONObject diner2 = new JSONObject();
//        diner2.put("name", "Json Snow");
//        diner2.put("age", 25);
//        diner2.put("gender", "Male");
//        diner2.put("isAllergic", false);
//        diner2.put("amountSpent", 750.5);
//
//        dinerList.add(diner1);
//        dinerList.add(diner2);
//
//        System.out.println(dinerList);
//        //[{"gender":"Female","isAllergic":false,"name":"Jane Stark","age":22,"amountSpent":153.27},{"gender":"Male","name":"Json Snow","isAllerigc":false,"age":25,"amountSpent":750.5}]
//
//        try (FileWriter file = new FileWriter("diners.json")) {
//            dinerList.writeJSONString(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("**** Writing out JSONArray of JSONObjects");
    }
}

// JSON Simple
//A simple, lightweight, library to read and write JSON, which also works with streams

// Apache Maven
//Build management tool to configure and manage project dependencies

// pom.xml
//Project object Model is the fundamental unit of work in Maven

// jsonformatter.org/json-pretty-print
