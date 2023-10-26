package com.reto1.r1Castillo.service;

import com.reto1.r1Castillo.model.entity.accounts;

import java.util.ArrayList;

public interface accountsInter {

    //Se declaran las acciones que se pueden hacer
    accounts save(accounts accounts);

    accounts findById(Integer Id);

    void delete(accounts accounts);

    ArrayList<accounts> obtenerLista();
}
