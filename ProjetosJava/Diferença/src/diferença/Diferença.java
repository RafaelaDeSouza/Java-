/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diferença;

import java.util.Scanner; 

public class Diferença {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a, b, c, d;
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt(); 
        d = scan.nextInt();
        
        int dif = ((a*b) - (c*d));
        System.out.println("DIFERENCA = " +dif);
        
    }
    
}
