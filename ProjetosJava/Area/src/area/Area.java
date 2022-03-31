/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;
import java.util.Scanner;

public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double pi =  3.14159;
        double a = scan.nextDouble(); 
        double b = scan.nextDouble(); 
        double c = scan.nextDouble(); 
        
        double areaTri = (a*c)/2.0;
        double areaCir = (c*c)*pi;
        double areaTra = ((a+b)*c)/2.0;
        double areaQua = (b*b);
        double areaRet = (a*b);
        
        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCir);
        System.out.printf("TRAPEZIO: %.3f\n", areaTra);
        System.out.printf("QUADRADO: %.3f\n", areaQua);
        System.out.printf("RETANGULO: %.3f\n", areaRet);
    }
    
}
