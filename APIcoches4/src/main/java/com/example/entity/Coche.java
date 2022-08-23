package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Albertazo
 */

@Entity //bombillita: the project does not contain a persistence unit
@Table(name = "tablaCoches")
public class Coche {  //bombillita: an entity or idClass class should implement the java.io.Serializable interface

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String marca;
    private String modelo;
    private int anyo;  //se puede usar DATE
    private float precio;

    public Coche() {
    }

    public Coche(Long id, String marca, String modelo, int anyo, float precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", precio=" + precio;
    }

    
    
    
    
}
