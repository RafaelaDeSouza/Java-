/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oconsumo;
import java.util.Scanner;

public class OConsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        
        int disx = scan.nextInt();
        float comy = scan.nextFloat();
        
        float kml = disx/comy;
        System.out.printf("%.3f km/l\n",kml);
    }
    
}
