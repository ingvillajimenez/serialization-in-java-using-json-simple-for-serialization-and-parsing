package com.skillsoft.jsonparsing;

import org.json.simple.JSONArray; // class JSONArray
import org.json.simple.parser.JSONParser; // class JSONParser
import org.json.simple.parser.ParseException; // class ParseException

import java.io.FileReader; // class FileReader
import java.io.IOException; // class IOException

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Reading very large JSON file");

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src/employees.json")) {
            Object obj = jsonParser.parse(reader);

            ParsingHandler parsingHandler = new ParsingHandler();

            JSONArray jsonObject = (JSONArray) obj;
            System.out.println(jsonObject);
            //[{"address":{"zip":90212,"city":"Los Angeles","state":"CA"},"gender":"Female","name":"Jeanette Penddreth","active":true,"id":1,"contact_info":["jpenddreth0@census.gov","jpenddreth0@gmail.com"],"salary":84340.5}]

            jsonParser.parse(obj.toString(), parsingHandler, true);
            //Start
            //Start Array
            //Start Object
            //Start Object Entry: address
            //Start Object
            //Start Object Entry: zip
            //---90212---
            //End Object Entry
            //Start Object Entry: city
            //---Los Angeles---
            //End Object Entry
            //Start Object Entry: state
            //---CA---
            //End Object Entry
            //End Object
            //End Object Entry
            //Start Object Entry: gender
            //---Female---
            //End Object Entry
            //Start Object Entry: name
            //---Jeanette Penddreth---
            //End Object Entry
            //Start Object Entry: active
            //---true---
            //End Object Entry
            //Start Object Entry: id
            //---1---
            //End Object Entry
            //Start Object Entry: contact_info
            //Start Array
            //---jpenddreth0@census.gov---
            //---jpenddreth0@gmail.com---
            //End Array
            //End Object Entry
            //Start Object Entry: salary
            //---84340.5---
            //End Object Entry
            //End Object
            //End Array
            //End

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        System.out.println("**** Completed reading JSON");
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