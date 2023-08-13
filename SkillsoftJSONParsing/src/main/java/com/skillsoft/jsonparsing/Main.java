package com.skillsoft.jsonparsing;

import org.json.simple.JSONObject; // class JSONObject
import org.json.simple.JSONValue; // class JSONValue

import java.io.IOException; // class IOException
import java.io.StringWriter; // class StringWriter
import java.util.Comparator; // interface Comparator
import java.util.Map; // interface Map
import java.util.TreeMap; // class TreeMap

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        System.out.println("**** Creating JSONObject");

        Map<String, Object> movie = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });

        movie.put("name", "Back to the Future");
        movie.put("releaseYear", 1985);
        movie.put("boxOffice", 388.8);
        movie.put("director", "Robert Zemeckis");

        StringWriter out = new StringWriter();
        JSONValue.writeJSONString(movie, out);

        System.out.println(out.toString());
        //{"releaseYear":1985,"name":"Back to the Future","director":"Robert Zemeckis","boxOffice":388.8}

        System.out.println("**** Predictable ordering stream encoding of JSON object");

//        System.out.println("**** Creating JSONObject");
//
//        Map<String, Object> movie = new TreeMap<>();
//
//        movie.put("name", "Back to the Future");
//        movie.put("releaseYear", 1985);
//        movie.put("boxOffice", 388.8);
//        movie.put("director", "Robert Zemeckis");
//
//        System.out.println(JSONValue.toJSONString(movie));
//        //{"boxOffice":388.8,"director":"Robert Zemeckis","name":"Back to the Future","releaseYear":1985}
//
//        System.out.println("**** Predictable ordering string encoding of JSON object");

//        System.out.println("**** Creating JSONObject");
//
//        JSONObject movie = new JSONObject();
//
//        movie.put("name", "Back to the Future");
//        movie.put("releaseYear", 1985);
//        movie.put("boxOffice", 388.8);
//        movie.put("director", "Robert Zemeckis");
//
//        StringWriter out = new StringWriter();
//        movie.writeJSONString(out);
//
//        System.out.println(out.toString());
//        //{"director":"Robert Zemeckis","name":"Back to the Future","boxOffice":388.8,"releaseYear":1985}
//
//        System.out.println("**** Stream encoding of JSON object");

//        System.out.println("**** Creatin JSONObject");
//
//        JSONObject movie = new JSONObject();
//
//        movie.put("name", "Back to the Future");
//        movie.put("releaseYear", 1985);
//        movie.put("boxOffice", 388.8);
//        movie.put("director", "Robert Zemeckis");
//
//        System.out.println(movie.toString());
//        //{"director":"Robert Zemeckis","name":"Back to the Future","boxOffice":388.8,"releaseYear":1985}
//        System.out.println(movie.toJSONString());
//        //{"director":"Robert Zemeckis","name":"Back to the Future","boxOffice":388.8,"releaseYear":1985}
//
//        System.out.println("**** String encoding of JSON object");

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