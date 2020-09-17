package com.reto.models;

public class DatosModel {

    private String nombre;
    private String apellido;
    private String correo;
    private String dia;
    private String mes;
    private String year;
    private String idioma;
    private String cuidad;
    private String postal;
    private String pais;
    private String modelo;
    private String password;

    public DatosModel() {
    }

    public DatosModel(String nombre, String apellido, String correo, String dia, String mes, String year, String idioma, String cuidad, String postal, String pais, String modelo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.idioma = idioma;
        this.cuidad = cuidad;
        this.postal = postal;
        this.pais = pais;
        this.modelo = modelo;
        this.password = password;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}