/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADVAN
 */
public class GenericDAO<T> {  // 🔥 WAJIB ADA <T>

    private List<T> dataList;

    public GenericDAO() {
        dataList = new ArrayList<>();
    }

    public void add(T data) {
        dataList.add(data);
    }

    public List<T> getAll() {
        return dataList;
    }
}
