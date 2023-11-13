/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
      
        double Hijo1;
        double Hijo2;
        double Hijo3;

      
        System.out.print("Ingrese los gastos del primer hijo: ");
        Hijo1 = scanner.nextDouble();
        System.out.print("Ingrese los gastos del segundo hijo: ");
        Hijo2 = scanner.nextDouble();
        System.out.print("Ingrese los gastos del tercer hijo: ");
        Hijo3 = scanner.nextDouble();
        double totalGastos = calcularTotalGastos(Hijo1, Hijo2, Hijo3);
        System.out.printf("\nTotal de gastos de los hijos: $%.2f%n", totalGastos);
    }

    public static double calcularTotalGastos(double Hijo1, double Hijo2, double Hijo3) {
        return Hijo1 + Hijo2 + Hijo3;
    }

    }
    

