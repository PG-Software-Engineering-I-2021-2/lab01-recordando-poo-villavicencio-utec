package is.lab01;

public class Automovil extends Vehiculo{

    Automovil(double _cantidad, double _consumo, double _capacidad) {
        super(_cantidad, _consumo, _capacidad);
    }

    @Override
    String  abastecer(double _cantidad) {
        double freeSpace = this.capacidad - this.cantidad;

        if (_cantidad > freeSpace)
        {
            return "Automovil no se puede reabastecer el tanque, esta lleno";

        }
        else{
            cantidad += cantidad;
            return "La cantidad de combustible del vehiculo es: "+cantidad;
        }
    }
}
