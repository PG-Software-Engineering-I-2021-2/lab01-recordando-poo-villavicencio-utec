package is.lab01;
public class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;
    double viaje;

    Vehiculo(double _cantidad, double _consumo, double _capacidad){
        this.cantidad = _cantidad;
        this.consumo = _consumo;
        this.capacidad = _capacidad;
    }
    String  abastecer(double _litros){
        return "";
    }
    String consumoCombustible(double _km){
        double fuelRequiere = _km*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Vehiculo viajó " +(_km)+" km y aún tiene " +String.format("%.2f",cantidad,2)+ " de combustible");
        }
    }
}








