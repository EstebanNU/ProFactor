package org.example;

import javax.swing.*;

public class Partido {

    private int golesequipolocal=2;
    private int golesequipovisitante=3;


    public Partido() {
    }


    public int getGolesequipolocal() {
        return golesequipolocal;
    }

    public void setGolesequipolocal(int golesequipolocal) {
        this.golesequipolocal = golesequipolocal;
    }

    public int getGolesequipovisitante() {
        return golesequipovisitante;
    }

    public void setGolesequipovisitante(int golesequipovisitante) {
        this.golesequipovisitante = golesequipovisitante;
    }

    public Equipo simularPartido(Equipo equipoLocal, Equipo equipoVisitante) {
        // Muestra un mensaje con el resultado del partido
        JOptionPane.showMessageDialog(null, equipoLocal.getNombre() + " " + this.golesequipolocal + " - " + this.golesequipovisitante + " " + equipoVisitante.getNombre(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        // La suma de goles a los equipos
        equipoLocal.sumarGolesNuevos(this.golesequipolocal);
        equipoLocal.sumarGolesNuevos(this.golesequipovisitante);

        // Logica de el partido

        if (this.golesequipolocal > this.golesequipovisitante) {
            equipoVisitante.setAutorizacion(false);
            equipoLocal.setResultadoEnelpartido(Resultado.ganador);
            equipoVisitante.setResultadoEnelpartido(Resultado.perdedor);
            JOptionPane.showMessageDialog(null,"Gano "+equipoLocal.getNombre(),"Resultado",JOptionPane.INFORMATION_MESSAGE);
            return equipoLocal;
        } else if (this.golesequipolocal == this.golesequipovisitante) {
            JOptionPane.showMessageDialog(null, "Se juagara el desempate entre " + equipoLocal.getNombre() + " - " + equipoVisitante.getNombre(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            equipoLocal.setResultadoEnelpartido(Resultado.empate);
            equipoVisitante.setResultadoEnelpartido(Resultado.empate);
            simularPartido(equipoLocal, equipoVisitante);
        } else{
            equipoLocal.setAutorizacion(false);
            equipoVisitante.setResultadoEnelpartido(Resultado.ganador);
            equipoLocal.setResultadoEnelpartido(Resultado.perdedor);
            JOptionPane.showMessageDialog(null,"Gano "+equipoVisitante.getNombre(),"Resultado",JOptionPane.INFORMATION_MESSAGE);
            return equipoVisitante;
        }
        return null;
    }
}