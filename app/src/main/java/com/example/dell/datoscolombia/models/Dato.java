package com.example.dell.datoscolombia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gallo on 1/06/2017.
 */

public class Dato {

    @SerializedName("arma_empleada")
    @Expose
    private String armaEmpleada;
    @SerializedName("barrio")
    @Expose
    private String barrio;
    @SerializedName("c_digo_dane")
    @Expose
    private String cDigoDane;
    @SerializedName("cantidad")
    @Expose
    private String cantidad;
    @SerializedName("clase_de_sitio")
    @Expose
    private String claseDeSitio;
    @SerializedName("d_a")
    @Expose
    private String d_a;
    @SerializedName("delito")
    @Expose
    private String delito;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("hora")
    @Expose
    private String hora;
    @SerializedName("m_vil_agresor")
    @Expose
    private String mVilAgresor;
    @SerializedName("m_vil_victima")
    @Expose
    private String mVilVictima;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("zona")
    @Expose
    private String zona;
    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("edad")
    @Expose
    private String edad;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("estado_civil")
    @Expose
    private String estado_civil;
    @SerializedName("clase_de_empleado")
    @Expose
    private String clase_de_empleado;
    @SerializedName("escolaridad")
    @Expose
    private String escolaridad;

    public String getArmaEmpleada() {
        return armaEmpleada;
    }

    public void setArmaEmpleada(String armaEmpleada) {
        this.armaEmpleada = armaEmpleada;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCDigoDane() {
        return cDigoDane;
    }

    public void setCDigoDane(String cDigoDane) {
        this.cDigoDane = cDigoDane;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getClaseDeSitio() {
        return claseDeSitio;
    }

    public void setClaseDeSitio(String claseDeSitio) {
        this.claseDeSitio = claseDeSitio;
    }

    public String getD_a() {
        return d_a;
    }

    public void setd_a(String dA) {
        this.d_a = d_a;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMVilAgresor() {
        return mVilAgresor;
    }

    public void setMVilAgresor(String mVilAgresor) {
        this.mVilAgresor = mVilAgresor;
    }

    public String getMVilVictima() {
        return mVilVictima;
    }

    public void setMVilVictima(String mVilVictima) {
        this.mVilVictima = mVilVictima;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFecha() {

        return fecha.toString();
    }

    public void setFecha(String fecha)
    {
        this.fecha =fecha;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getClase_de_empleado() {
        return clase_de_empleado;
    }

    public void setClase_de_empleado(String clase_de_empleado) {
        this.clase_de_empleado = clase_de_empleado;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }
}
