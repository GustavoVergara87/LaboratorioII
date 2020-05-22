/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_lab;

/**
 *
 * @author Gustavo
 */
public class Rueda {

    private int Rodado;
    private double nivelAireActual;
    private double nivelAireCorrecto;
    private Vehiculo vehiculo;

    public Rueda(int Rodado, double nivelAireActual, double nivelAireCorrecto, Vehiculo vehiculo) {
        this.Rodado = Rodado;
        this.nivelAireActual = nivelAireActual;
        this.nivelAireCorrecto = nivelAireCorrecto;
        this.vehiculo = vehiculo;
    }

    public int getRodado() {
        return Rodado;
    }

    public void setRodado(int Rodado) {
        this.Rodado = Rodado;
    }

    public double getNivelAireActual() {
        return nivelAireActual;
    }

    public void setNivelAireActual(double nivelAireActual) {
        this.nivelAireActual = nivelAireActual;
    }

    public double getNivelAireCorrecto() {
        return nivelAireCorrecto;
    }

    public void setNivelAireCorrecto(float nivelAireCorrecto) {
        this.nivelAireCorrecto = nivelAireCorrecto;
    }

    public void inflar() {
        if (this.nivelAireActual <= this.nivelAireCorrecto) {
            this.nivelAireActual++;
        }
    }

    public int miVehiculo() {
        return this.vehiculo.getId();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
