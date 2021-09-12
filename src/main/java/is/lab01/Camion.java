package is.lab01;

public class Camion  extends Vehiculo{
    Camion(double prCantidad, double prConsumo, double prCapacidad) {
        super(prCantidad, prConsumo, prCapacidad);
    }
    @Override
    String abastecer(double prLitro){
        double freeSpace = this.capacidad - this.cantidad;
        if (prLitro > freeSpace)
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";

        }
        else{
            this.cantidad += (prLitro * 0.95);
            return "La cantidad de combustible del camion es: "+cantidad;
        }
    }
    @Override
    String consumoCombustible(double prkm) {
        double fuelRequiere = prkm*this.consumo;
        if(cantidad-fuelRequiere<0){
            return "Camion necesita reabastecimiento de combustible";
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Camion viajó " +(prkm)+" km y aún tiene " +String.format("%.2f",cantidad,2)+ " de combustible");
        }
    }
}
