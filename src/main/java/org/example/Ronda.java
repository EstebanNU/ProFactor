package org.example;

import javax.swing.*;
import java.util.List;

public class Ronda {

    private int nroDeRonda;
    private int cantidaddeequiposenronda;

    private int cantidaddeequiposenllave;

    public Ronda() {
    }

    public int getNroDeRonda() {
        return nroDeRonda;
    }

    public void setNroDeRonda(int nroDeRonda) {
        this.nroDeRonda = nroDeRonda;
    }

    public int getCantidaddeequiposenronda() {
        return cantidaddeequiposenronda;
    }



    public int getCantidaddeequiposenllave() {
        return cantidaddeequiposenllave;
    }


    public void cuartoDeFinal(Llave llaveIzquierda, Llave llaveDerecha){
        // Seteo el num de rondas
        this.nroDeRonda =1;
        this.cantidaddeequiposenllave = 4;
        // Instacia un objeto  de partido para usar un metodo
        Partido partido=new Partido();
        // Muestro por pantalla un mensaje de bienvenida a cuartos
        JOptionPane.showMessageDialog(null,"Se juagaran los cuartos de final ", "Cuartos",JOptionPane.INFORMATION_MESSAGE);
        // Simulo los partidos
        for(int i=0;i<cantidaddeequiposenllave;i+=2){
            partido.simularPartido(llaveDerecha.getEquiposdelallave().get(i),llaveDerecha.getEquiposdelallave().get(i+1));
            partido.simularPartido(llaveIzquierda.getEquiposdelallave().get(i),llaveIzquierda.getEquiposdelallave().get(i+1));

        }
        // Remuevo lo que perdieron
        removerEquipos(llaveIzquierda.getEquiposdelallave());
        removerEquipos(llaveDerecha.getEquiposdelallave());
        // Setear la cantidad de equipos con llave
        this.cantidaddeequiposenllave=2;
    }
    public void removerEquipos(List<Equipo> equipos){
        int contadorEquiposPorLlave=cantidaddeequiposenllave;
        for(int i=0;i<contadorEquiposPorLlave;i++){
            Equipo auxiliar=equipos.get(i);
            if(!auxiliar.isAutorizacion()){
                equipos.remove(auxiliar);
                contadorEquiposPorLlave--;
            }
        }
    }
    public void semifinal (Llave llaveIzquierda, Llave llaveDerecha){
        // Seteo el num de rondas
        this.nroDeRonda =2;
        this.cantidaddeequiposenllave = 2;
        // Instacia un objeto  de partido para usar un metodo
        Partido partido=new Partido();
        // Muestro por pantalla un mensaje de bienvenida a semis
        JOptionPane.showMessageDialog(null,"Se juagaran la semi final ", "Semi Final",JOptionPane.INFORMATION_MESSAGE);
        // Simulo los partidos
        partido.simularPartido(llaveIzquierda.getEquiposdelallave().get(0),llaveIzquierda.getEquiposdelallave().get(1));
        partido.simularPartido(llaveDerecha.getEquiposdelallave().get(0),llaveDerecha.getEquiposdelallave().get(1));
        // Remuevo lo que perdedores
        removerEquipos(llaveIzquierda.getEquiposdelallave());
        removerEquipos(llaveDerecha.getEquiposdelallave());

    }
    public void finalDelTorneo (Llave llaveIzquierda, Llave llaveDerecha){
        // Seteo el num de rondas
        this.nroDeRonda =3;
        // Instacia un objeto  de partido para usar un metodo
        Partido partido=new Partido();
        // Muestro por pantalla un mensaje de bienvenida a la final
        JOptionPane.showMessageDialog(null,"Se juagaran la Final ", "Final",JOptionPane.INFORMATION_MESSAGE);
        // Simulo los partidos
        Equipo equipo= partido.simularPartido(llaveDerecha.getEquiposdelallave().get(0),llaveIzquierda.getEquiposdelallave().get(0));
        // Muestro un mensaje de quien gano el torneo
        JOptionPane.showMessageDialog(null,"El ganador del torneo es : " + equipo.getNombre(), "Ganador del torneo",JOptionPane.INFORMATION_MESSAGE);
    }


}
