/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        
        
        System.out.println("ingrese el costo por los kilovatio/hora");
        double costokilovatio = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos");
        double kilovatioconsumido = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        int  edad = entrada.nextInt();
        double descuento = 0.10;
             
        double costototal = costokilovatio * kilovatioconsumido;
        if (edad > 65) {
            costototal = costototal - (costototal*descuento);
            System.out.printf("el valor a pagar es: %.2f\n", costototal);
        } else {
            System.out.printf("el ingrese del valor es: %.2f\n", costototal);

        }

    }

}
    



