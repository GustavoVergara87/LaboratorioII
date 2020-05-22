/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_lab;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class FlotaAutos {

    private ArrayList<Auto> Autos = new ArrayList<>();


    public ArrayList<Auto> getAutos() {
        return Autos;
    }

    public void setAutos(ArrayList<Auto> Autos) {
        this.Autos = Autos;
    }

    public void controlarVelocidad() {
        for (int i = 0; i < Autos.size(); i++) {
            System.out.println(Autos.get(i).getVelocidadActual());
        }
    }

    public void promedioVelocidad() {
        double p=0;
        for (int i = 0; i < Autos.size(); i++) {
           p += Autos.get(i).getVelocidadActual();
        }
        p/=Autos.size();
        System.out.println("Promedio de velocidades: " + p);
    }

}
