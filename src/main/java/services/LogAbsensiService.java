/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import model.GenericDAO;
import model.LogAbsensi;

/**
 *
 * @author ADVAN
 */
public class LogAbsensiService {

    private final GenericDAO<LogAbsensi> logDAO =
            new GenericDAO<>("log_absensi", LogAbsensi.class);

    public void simpanLog(String hashedUid, String status) {
        LogAbsensi log = new LogAbsensi(
                UUID.randomUUID().toString(),
                hashedUid,
                LocalDateTime.now(),
                status
        );

        logDAO.save(log);
    }

    public List<LogAbsensi> findAll() {
        return logDAO.findAll();
    }

}
