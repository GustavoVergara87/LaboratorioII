package uml_lab;

// @author Gustavo
public class UML_lab {

    public static void main(String[] args) {
        Auto auto=new Auto(100, 150, 1);
        auto.Fabricar();
        
        Camion camion = new Camion(0 , 100, 1);
        camion.Fabricar();
        
        FlotaAutos Flota = new FlotaAutos();
        Flota.getAutos().add(auto);
        Flota.getAutos().add(auto);
        Flota.getAutos().add(auto);
    }

}
