/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
           
            
            System.out.print("Ingrese la descripcion del articulo: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese la cantidad requerida: ");
            int cantidad = scanner.nextInt();
            System.out.print("Ingrese el precio unitario: ");
            double precioUnitario = scanner.nextDouble();
           double descuento = 0.15;
            double costotal = precioUnitario * cantidad;
        if (cantidad > 50) {
            costotal = costotal - (costotal*descuento);
            System.out.printf("el valor a pagar es: %.2f\n", costotal);
        } else {
            System.out.printf("el valor a pagar es: %.2f\n",costotal);

        }
        
        }
    }
}