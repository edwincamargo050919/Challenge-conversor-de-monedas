import monedas.datosMonedas;
import monedas.valoresMoneda;

import java.io.IOException;
import java.util.Scanner;

public class conversionDeMoneda {
    public  static void conversionMonedas (String monedaBase, String monedaConvertida, datosMonedas consulta, Scanner lectura ) {
        double cantidad;
        double cantidadConvertida;
//metopdo para convertir la moneda empleando la API
        valoresMoneda moneda = consulta.datosmonedass(monedaBase, monedaConvertida);
        System.out.println("la tasa de conversion del día es: "+moneda.conversion_rate());

        System.out.println("Ingrese el valor a converitr: ");
        cantidad = lectura.nextDouble();
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidadConvertida);




    }

}
