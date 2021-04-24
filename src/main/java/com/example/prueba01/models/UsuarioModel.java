package com.example.prueba01.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private Integer valorCompra;
    private Integer valorIva;
    private Integer valorDomicilio;
    private Integer valorTotal;

    private String nombre;
    private String apellido;
    private String direccion;
    private String cedula;

    private Integer prioridad;

    public Integer getPrioridad() {
        return prioridad;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getValorDomicilio() {
        return valorDomicilio;
    }

    public void setValorDomicilio(Integer valorDomicilio) {
        this.valorDomicilio = valorDomicilio;
    }

    public Integer getValorIva() {
        return valorIva;
    }

    public void setValorIva(Integer valorIva) {
        this.valorIva = valorIva;
    }

    public Integer getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Integer valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
