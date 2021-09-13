package is.lab01;
public class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;

    Vehiculo(double prCantidad, double prConsumo, double prCapacidad){
        this.cantidad = prCantidad;
        this.consumo = prConsumo;
        this.capacidad = prCapacidad;
    }

    String consumoCombustible(double prkm){
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            String cantidadFormat = String.format("%.2f",cantidad,2);
            return ("Vehiculo viajó " +(prkm)+" km y aún tiene " +cantidadFormat+ " de combustible");
        }
    }
}








