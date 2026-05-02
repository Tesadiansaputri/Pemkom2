/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ftfbank;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;






/**
 *
 * @author ADVAN
 */
public class FTFBank {

     public static void main(String[] args) {

           String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            
            MongoDatabase database = mongoClient.getDatabase("bank_absensi");
            
            System.out.println("Koneksi ke MongoDB BERHASIL!");
            System.out.println("Database: " + database.getName());
            
            MongoCollection<Document> collection = database.getCollection("Karyawan");

            Document doc = new Document("_id", 1)
                    .append("nama", "Budi")
                    .append("jabatan", "Admin");

            collection.insertOne(doc);

            System.out.println("Data berhasil ditambahkan!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
