package is.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;

import static is.lab01.Labo1.*;

public class EjemploVehiculoTest {

    @Test
    public void Test01(){
        double fuelCantidad =10;
        Automovil automovilTest = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        Assert.assertEquals("Vehiculo necesita reabastecimiento de combustible", automovilTest.consumoCombustible(12));
    }
}
