package org.example;

import javax.swing.*;
import java.util.List;

public class Jugador {

    private Equipo equipoceleccionado;
    private int puntaje;

    public Jugador() {
    }

    public Jugador(Equipo equipoceleccionado, int puntaje) {
        this.equipoceleccionado = equipoceleccionado;
        this.puntaje = puntaje;
    }

    public Equipo getEquipoceleccionado() {
        return equipoceleccionado;
    }

    public void setEquipoceleccionado(Equipo equipoceleccionado) {
        this.equipoceleccionado = equipoceleccionado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void elegirEquipo(List<Equipo> listaEquipos){
        String listadelosequiposenmensaje="Seleccione su equipo: \n";
        for(int i=0;i<listaEquipos.size();i++){
            listadelosequiposenmensaje+=(i+1)+". "+listaEquipos.get(i).getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null,listadelosequiposenmensaje,"Seleccion de Equipo",JOptionPane.INFORMATION_MESSAGE);


        int indiceEquipo=0;
        do {
            indiceEquipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el indice del equipo que quiere seleccionar:","Ingreso valor",JOptionPane.INFORMATION_MESSAGE))-1;
        }while (indiceEquipo<0||indiceEquipo>7);
        JOptionPane.showMessageDialog(null,"El equipo que elegiste es: "+listaEquipos.get(indiceEquipo).getNombre());
        this.equipoceleccionado=listaEquipos.get(indiceEquipo);
    }

    public void sumarPuntos()
    {
        if(equipoceleccionado.isAutorizacion())
        {
            puntaje++;
        }
    }
}
