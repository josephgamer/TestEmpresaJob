package model;

import java.io.Serializable;

public class Vehiculo implements Serializable {
    private String codigo;
    private String color;
    private int puertas;
    private int annio;
    private String modelo;
    private String marca;
    private String tipo;
    private String tecnologia;

    public Vehiculo(String codigo, String color,
                    int puertas, int annio, String modelo, String marca, String tipo, String tecnologia) {
        this.codigo = codigo;
        this.color = color;
        this.puertas = puertas;
        this.annio = annio;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.tecnologia = tecnologia;
    }

    public Vehiculo() {
        this.codigo = "";
        this.color = "";
        this.puertas = 0;
        this.annio = 0;
        this.modelo = "";
        this.marca = "";
        this.tipo = "";
        this.tecnologia = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "codigo='" + codigo + '\'' +
                ", color='" + color + '\'' +
                ", puertas=" + puertas +
                ", annio=" + annio +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
