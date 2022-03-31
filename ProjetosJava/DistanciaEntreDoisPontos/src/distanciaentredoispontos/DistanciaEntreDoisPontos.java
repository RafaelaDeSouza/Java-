/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distanciaentredoispontos;
import java.util.Scanner;
import java.lang.Math;

public class DistanciaEntreDoisPontos {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       float x1 = scan.nextFloat();
       float y1 = scan.nextFloat();
       float x2 = scan.nextFloat();
       float y2 = scan.nextFloat();
       
       float menosx = (float) x2 - x1;
       float menosy = (float) y2 - y1;
       float elevadox = (float) Math.pow(menosx, 2.00);
        float elevadoy = (float) Math.pow(menosy, 2.00);
          float somaxy = (float) elevadox + elevadoy;
            float dis = (float) Math.sqrt(somaxy);
            
            System.out.printf("%.4f", dis);
    }
    
}
