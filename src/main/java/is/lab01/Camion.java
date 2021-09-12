package is.lab01;

public class Camion  extends Vehiculo{
    Camion(double _cantidad, double _consumo, double _capacidad) {
        super(_cantidad, _consumo, _capacidad);
    }

    String abastecer(double _liters){
        double freeSpace = this.capacidad - this.cantidad;
        if (_liters > freeSpace)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidad += (_liters * 0.95);
            return "La cantidad de combustible del camion es: "+cantidad;
        }
    }
    @Override
    String consumoCombustible(double _km) {
        double fuelRequiere = _km*this.consumo;
        if(cantidad-fuelRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Camion viajó " +(_km)+" km y aún tiene " +String.format("%.2f",cantidad,2)+ " de combustible");
        }
    }
}
