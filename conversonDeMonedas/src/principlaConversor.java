import monedas.datosMonedas;

import java.io.IOException;
import java.util.Scanner;

public class principlaConversor {
    public static void main(String[] args)  {
        Scanner lectura = new Scanner(System.in);
        datosMonedas consulta = new datosMonedas();


        while (true) {
            System.out.println("BInevenido a su conversor de moneda\n" +
                    "Convertir de: \n" +
                    "1- UDS a COP\n" +
                    "2- COP a USD \n" +
                    "3- USD a ARS\n" +
                    "4- ARS a USD \n" +
                    "5- USD a BOB \n" +
                    "6- BOB a USD\n " +
                    "7- salir  \n" +
                    "Recuerde selecionar una opción válida");
            System.out.println("Seleccione la opción a realizar: ");
            int opcion = lectura.nextInt();

            //condicionales conversor
            switch (opcion){
                case 1:
                conversionDeMoneda.conversionMonedas ("USD", "COP", consulta, lectura);
                break;
                case 2:
                    conversionDeMoneda.conversionMonedas ("COP", "USD", consulta, lectura);
                    break;
                case 3:
                    conversionDeMoneda.conversionMonedas ("USD", "ARS", consulta, lectura);
                    break;
                case 4:
                    conversionDeMoneda.conversionMonedas ("ARS", "USD", consulta, lectura);
                    break;
                case 5:
                    conversionDeMoneda.conversionMonedas ("USD", "BOB", consulta, lectura);
                    break;
                case 6:
                    conversionDeMoneda.conversionMonedas ("BOB", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("saliendo del conversor...");
                    break;
                }
                if (opcion >=7){
                    break; 
                }
            System.out.println("Fin de la ejecución.");
            }


        }

    }

