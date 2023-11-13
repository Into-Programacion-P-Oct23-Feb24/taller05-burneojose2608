/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
      
        double cpu;
        double teclado;
        double pantalla;
        double raton ;

      
        System.out.print("Ingrese el costo del cpu: ");
        cpu = scanner.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        teclado = scanner.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        pantalla = scanner.nextDouble();
        System.out. print("Ingrese el costo del raton");
        raton = scanner.nextDouble();
                
        double totalGastos = calcularTotalGastos(cpu, teclado, pantalla, raton);
        System.out.printf("\nEl costo del computador es: $%.2f%n", totalGastos);
    }

    public static double calcularTotalGastos(double cpu, double teclado, double pantalla ,double raton) {
        return cpu + teclado + pantalla + raton;
    }

    }
  
    

