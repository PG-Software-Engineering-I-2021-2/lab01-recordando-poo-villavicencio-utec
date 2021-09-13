package is.lab01;
public class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;
    double viaje;
    static final String defaultValue = "";

    Vehiculo(double prCantidad, double prConsumo, double prCapacidad){
        this.cantidad = prCantidad;
        this.consumo = prConsumo;
        this.capacidad = prCapacidad;
    }
    String  abastecer(double prLitros){
        return defaultValue;
    }
    String consumoCombustible(double prkm){
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Vehiculo viajó " +(prkm)+" km y aún tiene " +String.format("%.2f",cantidad,2)+ " de combustible");
        }
    }
}








