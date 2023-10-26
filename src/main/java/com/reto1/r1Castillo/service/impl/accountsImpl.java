package com.reto1.r1Castillo.service.impl;

import com.reto1.r1Castillo.model.dao.accountsDao;
import com.reto1.r1Castillo.model.entity.accounts;
import com.reto1.r1Castillo.service.accountsInter;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class accountsImpl implements accountsInter {
    @Autowired
    private accountsDao accountsDao;

    @Transactional
    @Override
    public accounts save(accounts accounts) {
        return accountsDao.save(accounts);
    }

    @Transactional(readOnly = true)
    @Override
    public accounts findById(Integer Id) {
        return accountsDao.findById(Id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(accounts accounts) {
        accountsDao.delete(accounts);

    }

    @Override
    public ArrayList<accounts> obtenerLista() {
        return (ArrayList<accounts>) accountsDao.findAll();
    }

}
