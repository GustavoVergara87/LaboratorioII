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
public abstract class Vehiculo {

    private int id;
    protected ArrayList<Rueda> Ruedas = new ArrayList<>();

    public Vehiculo(int id ) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void Fabricar();

    public void controlarAireRuedas() {
        for (Rueda r : Ruedas) {
            if (r.getNivelAireActual() != r.getNivelAireCorrecto()) {
                System.out.println("Ruedas con nivel de aire bajo " + r.getNivelAireActual()); 
            }
        }
        System.out.println("Todas las ruedas infladas");
    }

}
