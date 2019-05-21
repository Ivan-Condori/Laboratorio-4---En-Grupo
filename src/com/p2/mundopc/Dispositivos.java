package com.p2.mundopc;

public class Dispositivos {

    private String tipoEntrada;
    private String marca;
    private String tipoDispositivo;

    public Dispositivos(String tipoDispositivo, String marca, String tipoEntrada) {
        this.tipoDispositivo = tipoDispositivo;
        this.marca = marca;
        this.tipoEntrada = tipoEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    @Override
    public String toString(){
        return ", dispositivo de "+tipoDispositivo+", "+marca+", "+tipoEntrada;
    }
}