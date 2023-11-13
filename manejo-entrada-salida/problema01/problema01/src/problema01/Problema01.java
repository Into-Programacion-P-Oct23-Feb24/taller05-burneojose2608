/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        double altura = scanner.nextDouble();
        double area = calcularAreaTriangulo(base, altura);
        System.out.printf("Area: %.2f%n", area);
    }
    
    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }
}
