package com.reto1.r1Castillo.controller;

import com.reto1.r1Castillo.model.entity.accounts;
import com.reto1.r1Castillo.service.accountsInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class accountsController {

    @Autowired
    private accountsInter accountsservice;

    //Metodo Get que responde el listado de cuentas al invocarlo como:
    //GET http://localhost:8080/api/v1/accounts
    @GetMapping("accounts")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<accounts> obtenerAccounts(){
        return accountsservice.obtenerLista();
    }

    //Metodo Get que responde el detalle de una cuenta al invocarlo como:
    //GET http://localhost:8080/api/v1/accounts/{id}
    @GetMapping("accounts/{Id}")
    @ResponseStatus(HttpStatus.OK)
    public accounts showById(@PathVariable Integer Id){
        return accountsservice.findById(Id);
    }

    //Metodo Post que crea una cuenta al invocarlo como:
    //POST http://localhost:8080/api/v1/accounts
    @PostMapping("accounts")
    @ResponseStatus(HttpStatus.CREATED)
    public accounts create(@RequestBody accounts accounts){
        return accountsservice.save(accounts);
    }

    //Metodo Put que actualiza una cuenta al invocarlo como:
    //PUT http://localhost:8080/api/v1/accounts/{id}
    @PutMapping("accounts/{Id}")
    @ResponseStatus(HttpStatus.CREATED)
    public accounts update(@PathVariable Integer Id, @RequestBody accounts updatedAccount) {
        accounts existingAccount = accountsservice.findById(Id);
        if (existingAccount != null) {
            existingAccount.setNombre(updatedAccount.getNombre());
            existingAccount.setNumerocuenta(updatedAccount.getNumerocuenta());
            existingAccount.setSaldo(updatedAccount.getSaldo());
            existingAccount.setEstado(updatedAccount.getEstado());
            return accountsservice.save(existingAccount);
        } else {
            return null;
        }
    }

    //Metodo Delete que elimina una cuenta al invocarlo como:
    //PUT http://localhost:8080/api/v1/accounts/{id}
    @DeleteMapping("accounts/{Id}")
    public ResponseEntity<?> delete(@PathVariable Integer Id) {
        Map<String, Object> response = new HashMap<>();
        try {
            accounts accountsDelete = accountsservice.findById(Id);
            accountsservice.delete(accountsDelete);
            return new ResponseEntity<>(accountsDelete, HttpStatus.NO_CONTENT);
        } catch (DataAccessException exDt){
            response.put("mensaje", exDt.getMessage());
            response.put("cliente", null);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }


}
