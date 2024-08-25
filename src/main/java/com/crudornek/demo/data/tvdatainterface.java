package com.crudornek.demo.data;

import com.crudornek.demo.entities.TV;
import jakarta.transaction.Transactional;

public interface tvdatainterface {
    void add(TV tv);

     TV getById(int id);
     void deleteById(int id);
     void updateTV(TV tv);
}

