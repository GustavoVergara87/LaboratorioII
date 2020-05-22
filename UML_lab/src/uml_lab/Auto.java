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
public class Auto extends Vehiculo {

    private int velocidadActual;
    private int velocidadPermitida;

    public Auto(int velocidadActual, int velocidadPermitida, int id, ArrayList<Rueda> Ruedas) {
        super(id, Ruedas);
        this.velocidadActual = velocidadActual;
        this.velocidadPermitida = velocidadPermitida;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadPermitida() {
        return velocidadPermitida;
    }

    public void setVelocidadPermitida(int velocidadPermitida) {
        this.velocidadPermitida = velocidadPermitida;
    }

    public ArrayList<Rueda> getRuedas() {
        return Ruedas;
    }

    public void setRuedas(ArrayList<Rueda> Ruedas) {
        this.Ruedas = Ruedas;
    }

    @Override
    public void fabricar() {
        for (int i = 0; i < 4; i++) {
            Ruedas.add(new Rueda(12, 20, 30, this));
        }
    }

    public void acelerar() {
        this.velocidadActual++;
    }

    public void frenar() {
        this.velocidadActual--;
    }

}
