package com.skillsoft.jsonparsing;

import org.json.simple.JSONArray; // class JSONArray

import java.io.FileWriter; // class FileWriter
import java.io.IOException; // class IOException

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        System.out.println("**** Creating JSONArray of Diners");

        JSONArray dinerList = new JSONArray();

        Diner diner1 = new Diner("Sansa Stark", 22, "Female", 153.5f);
        Diner diner2 = new Diner("Arya Stark", 20, "Female", 700.5f);

        dinerList.add(diner1);
        dinerList.add(diner2);

        System.out.println(dinerList);
        //[com.skillsoft.jsonparsing.Diner@610455d6,com.skillsoft.jsonparsing.Diner@511d50c0]

        try (FileWriter file = new FileWriter("diners.json")) {
            dinerList.writeJSONString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("**** Writing out JSONArray of Diners");

//        System.out.println("**** Creating JSONArray of Diners");
//
//        JSONArray dinerList = new JSONArray();
//
//        Diner diner1 = new Diner("Jane Stark", 22, "Female", 153.5f);
//        Diner diner2 = new Diner("Jon Snow", 24, "Male", 767.5f);
//
//        dinerList.add(diner1);
//        dinerList.add(diner2);
//
//        System.out.println(dinerList);
//        //[{"name": "Jane Stark", "age": 22, "gender": "Female", "amountSpent": 153.500000},{"name": "Jon Snow", "age": 24, "gender": "Male", "amountSpent": 767.500000}]
//
//        try (FileWriter file = new FileWriter("diners.json")) {
//            dinerList.writeJSONString(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("**** Writing out JSONArray of Diners");

    }

}

// JSON Simple
//A simple, lightweight, library to read and write JSON, which also works with streams

// Apache Maven
//Build management tool to configure and manage project dependencies

// pom.xml
//Project object Model is the fundamental unit of work in Maven

// jsonformatter.org/json-pretty-print

// SAX Interface
// Simple API

// SAX Interface
// Callback-based interface to parsing documents, entire document is NOT loaded in memory

// ContentHandler interface is used to provide a SAX like interface to stream the large json

// jsonParser.parse()
// parse(java.io.Reader in, ContentHandler contentHandler, boolean isResume)

// SortedMap
// A map implemented with entries in a predictable, user-specified, order of keys

// The Comparator Interface
// Positive: o1 > o2, Negative: o1 < o2, Zero: o1 == o2