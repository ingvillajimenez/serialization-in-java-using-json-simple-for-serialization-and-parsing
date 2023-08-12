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

        try (FileReader reader = new FileReader("diners.json")) {

            JSONObject dinerListObject = (JSONObject) JSONValue.parse(reader);
            System.out.println(dinerListObject);
            //{"diners":[{"gender":"Female","isAllergic":false,"contact":[{"number":"212-555-1234","type":"home"},{"number":"646-555-4567","type":"mobile"}],"name":"Jane Stark","age":22,"amountSpent":153.27}]}

            JSONArray dinerList = (JSONArray) dinerListObject.get("diners");

            for (Object object : dinerList) {
                JSONObject diner = (JSONObject) object;

                System.out.println("\n**** Diner");

                for (Object keyObj : diner.keySet()) {
                    String key = (String) keyObj;

                    if (key.equals("contact")) {

                        JSONArray contactList = (JSONArray) diner.get(key);

                        System.out.println("Contacts: ");
                        for (Object contact : contactList) {

                            JSONObject contactJSON = (JSONObject) contact;

                            System.out.format("{**Number: %s, Type: %s**}\n",
                                    contactJSON.get("number"), contactJSON.get("type"));
                            //{**Number: 212-555-1234, Type: home**}
                            //{**Number: 646-555-4567, Type: mobile**}
                        }
                    }
                }
            }
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
//        JSONArray contactList = new JSONArray();
//        JSONObject contact1 = new JSONObject();
//
//        contact1.put("type", "home");
//        contact1.put("number", "212-555-1234");
//
//        JSONObject contact2 = new JSONObject();
//
//        contact2.put("type", "mobile");
//        contact2.put("number", "646-555-4567");
//
//        contactList.add(contact1);
//        contactList.add(contact2);
//
//        diner1.put("contact", contactList);
//
//        dinerList.add(diner1);
//
//        dinerListObject.put("diners", dinerList);
//
//        System.out.println(dinerListObject);
//        //{"diners":[{"gender":"Female","isAllergic":false,"contact":[{"number":"212-555-1234","type":"home"},{"number":"646-555-4567","type":"mobile"}],"name":"Jane Stark","age":22,"amountSpent":153.27}]}
//
//        try (FileWriter file = new FileWriter("diners.json")) {
//            dinerListObject.writeJSONString(file);
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
