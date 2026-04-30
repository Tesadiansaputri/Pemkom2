/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author ADVAN
 */
public class MongoManager {
     private static MongoDatabase database;

    public static void connect() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("absensiDB");

        System.out.println("✅ MongoDB Connected!");
    }

    public static MongoDatabase getDatabase() {
        return database;
    }
}
