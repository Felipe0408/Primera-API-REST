package com.reto1.r1Castillo.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "accounts")
public class accounts implements Serializable {
    //Se declaran los atributos de la tabla accounts
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Numerocuenta")
    private String Numerocuenta;
    @Column(name = "Saldo")
    private float Saldo;
    @Column(name = "Estado")
    private String Estado;
}
