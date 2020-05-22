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
public class Camion extends Vehiculo {

    private int cargaActual;
    private int cargaPermitida;

    public Camion(int cargaActual, int cargaPermitida, int id) {
        super(id);
        this.cargaActual = cargaActual;
        this.cargaPermitida = cargaPermitida;
    }

   

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public int getCargaPermitida() {
        return cargaPermitida;
    }

    public void setCargaPermitida(int cargaPermitida) {
        this.cargaPermitida = cargaPermitida;
    }

    @Override
    public void Fabricar() {
        for (int i = 0; i < 6; i++) {
            Ruedas.add(new Rueda(30, 2680, 2680, this));
        }
    }
    
    public void cargar(){
    this.cargaActual++;
        for (int i = 0; i < Ruedas.size(); i++) {
            Ruedas.get(i).setNivelAireActual(Ruedas.get(i).getNivelAireActual()-0.05);
        }
        this.controlarAireRuedas();
    }
    
    public void descargar(){
    this.cargaActual--;
    }

}
