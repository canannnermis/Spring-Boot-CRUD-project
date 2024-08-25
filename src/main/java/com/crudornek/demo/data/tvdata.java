package com.crudornek.demo.data;

import com.crudornek.demo.entities.TV;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public  class tvdata implements tvdatainterface {
    private EntityManager entityManager;
    @Autowired
    public tvdata(EntityManager entityManager){
        this.entityManager= entityManager;}

    @Override
    @Transactional
    public void add(TV tv) {
        entityManager.persist(tv);

    }

    @Override
    public TV getById(int id) {
        return entityManager.find(TV.class,id);

    }

    @Override
    @Transactional
    public void deleteById(int id) {
        TV tv =entityManager.find(TV.class,id);
        entityManager.remove(tv);

    }
    @Override
    @Transactional
    public void updateTV(TV tv) {
        entityManager.merge(tv);
    }


}

