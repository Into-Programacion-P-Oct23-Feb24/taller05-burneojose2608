/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
      
        double costo;
        double minutos_consumidos;
        System.out.print("Ingrese el costo por minutos: ");
        costo = scanner.nextDouble();
        System.out.print("Ingrese el numero de minutos consumidos en el mes: ");
        minutos_consumidos = scanner.nextDouble();
        double totalGastos = calcularTotalGastos(costo, minutos_consumidos);
        System.out.printf("\nEl valor de la planilla de su telefono es: $%.2f%n", totalGastos);
    }
    public static double calcularTotalGastos(double costo, double minutos_consumidos ) {
        return costo + minutos_consumidos ;
    }
   
}
