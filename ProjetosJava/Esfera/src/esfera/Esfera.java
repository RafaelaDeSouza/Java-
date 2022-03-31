/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esfera;
import java.util.Scanner;
import java.lang.Math;


public class Esfera {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        double raio = scan.nextInt();
        double r = raio*raio*raio;
        double pi = (double) 3.14159; 
        double volumeEsfera = (double) 4/3.0*(pi)*(r);
        System.out.printf("VOLUME = %.3f\n", volumeEsfera);
        
        
        
    }
    
}
