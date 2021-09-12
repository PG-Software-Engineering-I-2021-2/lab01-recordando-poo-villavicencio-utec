package is.lab01;
import java.util.logging.Logger;

public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    static double consumoVehiculo = 0.9;
    static double consumoCamion = 1.6;
    static double capacidadTotal = 100;
    public static void main(String[ ] args) {

        double fuelCantidad =10;


//Ejemplo 1
        Automovil lAutomovil1 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);

        String rpta1 = lAutomovil1.consumoCombustible(4);
        logger.info(rpta1);

//Ejemplo 2
        Automovil lAutomovil2 = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        String rpta2 = lAutomovil2.consumoCombustible(12);
        logger.info(rpta2);

//Ejemplo 3
        Camion lCamion = new Camion(fuelCantidad,consumoCamion,capacidadTotal);
        String rpta3 = lCamion.consumoCombustible(4);
        logger.info(rpta3);

    }
}
