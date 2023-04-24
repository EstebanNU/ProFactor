package org.example;

public class Equipo {

    private String nombre;
    private boolean autorizacion=true;
    private Resultado resultadoEnelpartido;
    private int cantgoleseneltorneo;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.autorizacion = autorizacion;
        this.resultadoEnelpartido = resultadoEnelpartido;
        this.cantgoleseneltorneo = cantgoleseneltorneo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Resultado getResultadoEnelpartido() {
        return resultadoEnelpartido;
    }

    public void setResultadoEnelpartido(Resultado resultadoEnelpartido) {
        this.resultadoEnelpartido = resultadoEnelpartido;
    }

    public int getCantgoleseneltorneo() {
        return cantgoleseneltorneo;
    }

    public void setCantgoleseneltorneo(int cantgoleseneltorneo) {
        this.cantgoleseneltorneo = cantgoleseneltorneo;
    }


    public void sumarGolesNuevos(int nuevosGoles){
        this.cantgoleseneltorneo+= nuevosGoles;
    }



}
