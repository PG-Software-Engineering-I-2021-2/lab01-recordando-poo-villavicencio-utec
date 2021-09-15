package is.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;

import static is.lab01.Labo1.*;

public class EjemploVehiculoTest {
    @Test
    public void Test01(){
        Automovil automovilTest = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        Assert.assertEquals(automovilTest.fuelCantidad(12),"Vehiculo necesita reabastecimiento de combustible" );
    }

    @Test
    public void Test02(){
        Automovil automovilTest = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        Assert.assertEquals(automovilTest.abastecer(12),"La cantidad de combustible del vehiculo es: 20.0" );
    }
    @Test
    public void Test03(){
        Automovil automovilTest = new Automovil(fuelCantidad,consumoVehiculo,capacidadTotal);
        Assert.assertEquals(automovilTest.abastecer(100),"Automovil no se puede reabastecer el tanque, esta lleno" );
    }


}
