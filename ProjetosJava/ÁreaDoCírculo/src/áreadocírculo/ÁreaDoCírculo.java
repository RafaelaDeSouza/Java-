/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package áreadocírculo;
import java.util.Scanner; 

public class ÁreaDoCírculo {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
       double π = 3.14159;
        double r = scan.nextDouble();
       
       double r2 = r*r;
        double area = r2*π;
            System.out.printf("A=%.4f\n", area);
        
        
    }
    
}
