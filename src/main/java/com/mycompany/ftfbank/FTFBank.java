/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ftfbank;

import java.time.LocalDateTime;
import model.GenericDAO;
import model.Karyawan;
import model.LogAbsensi;
import model.MongoManager;





/**
 *
 * @author ADVAN
 */
public class FTFBank {

     public static void main(String[] args) {

         MongoManager.connect();
        // DAO
        GenericDAO<Karyawan> karyawanDAO = new GenericDAO<>();
        GenericDAO<LogAbsensi> absensiDAO = new GenericDAO<>();

        // Data karyawan
        Karyawan k1 = new Karyawan("RFID123", "K001", "Budi", "IT");
        Karyawan k2 = new Karyawan("RFID456", "K002", "Siti", "HR");

        karyawanDAO.add(k1);
        karyawanDAO.add(k2);

        // Simulasi scan RFID
        String scanRFID = "RFID123";

        for (Karyawan k : karyawanDAO.getAll()) {
            if (k.getUidRfid().equals(scanRFID)) {

                LogAbsensi log = new LogAbsensi(
                        "LOG1",
                        k.getUidRfid(),
                        LocalDateTime.now(),
                        "Hadir"
                );

                absensiDAO.add(log);

                System.out.println("✅ Absensi berhasil: " + k.getNamaLengkap());
            }
        }

        // tampilkan log
        System.out.println("\nData Absensi:");
        for (LogAbsensi log : absensiDAO.getAll()) {
            System.out.println(log);
        }
    }
}
