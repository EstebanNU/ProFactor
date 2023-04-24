package org.example;

import java.util.ArrayList;
import java.util.List;

public class Llave {

    private List<Equipo> equiposdelallave;
    private String nombredelallave;

    public Llave() {
    }

    public Llave(List<Equipo> equiposdelallave, String nombredelallave) {
        this.equiposdelallave = equiposdelallave;
        this.nombredelallave = nombredelallave;
    }

    public List<Equipo> getEquiposdelallave() {
        return equiposdelallave;
    }

    public void setEquiposdelallave(List<Equipo> equiposdelallave) {
        this.equiposdelallave = equiposdelallave;
    }

    public String getNombredelallave() {
        return nombredelallave;
    }

    public void setNombredelallave(String nombredelallave) {
        this.nombredelallave = nombredelallave;
    }

    public void armarLlave (List<Equipo> listaGeneral,int indiceInicial){
        List<Equipo> equipoLlave = new ArrayList<>();
        for(int i=indiceInicial;i<indiceInicial+4;i++){
            equipoLlave.add(listaGeneral.get(i));
        }
        this.equiposdelallave=equipoLlave;
    }

}
