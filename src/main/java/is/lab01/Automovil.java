package is.lab01;

public class Automovil extends Vehiculo{

    Automovil(double prCantidad, double prConsumo, double prCapacidad) {
        super(prCantidad, prConsumo, prCapacidad);
    }

    @Override
    String  abastecer(double prCantidad) {
        double freeSpace = this.capacidad - this.cantidad;

        if (prCantidad > freeSpace)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";

        }
        else{
            cantidad += cantidad;
            return "La cantidad de combustible del vehiculo es: "+cantidad;
        }
    }
}
