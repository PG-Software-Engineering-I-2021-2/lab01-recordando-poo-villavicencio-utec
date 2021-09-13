package is.lab01;

import java.text.DecimalFormat;

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
        DecimalFormat df = new DecimalFormat("0.00");
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Vehiculo viajó " +(prkm)+" km y aún tiene " +df.format(cantidad)+ " de combustible");
        }
    }
}








