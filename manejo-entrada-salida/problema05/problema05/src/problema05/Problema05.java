/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
      
        double netflix;
        double dropbox;
        double spotify;
        double  youtubePremium;

      System.out.print("Ingrese el costo de Netflix: ");
        netflix = scanner.nextDouble();
        System.out.print("Ingrese el costo de YouTube Premium: ");
         youtubePremium = scanner.nextDouble();
        System.out.print("Ingrese el costo de Dropbox: ");
        dropbox = scanner.nextDouble();
        System.out.print("Ingrese el costo de Spotify: ");
        spotify = scanner.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        double totalPagar = calcularTotalPagar(netflix, youtubePremium, dropbox, spotify, edad);
        System.out.printf("\nTotal a pagar mensual: $%.2f%n", totalPagar);
    }
    public static double calcularTotalPagar(double netflix, double youtubePremium, double dropbox, double spotify, int edad) {       
        double totalSinDescuento = netflix + youtubePremium + dropbox + spotify;

        if (edad < 30) {
            double descuento = 0.20 * totalSinDescuento;
            return totalSinDescuento - descuento;
        } else {
            return totalSinDescuento;
        }
    }
}
        
   






    

    
    

