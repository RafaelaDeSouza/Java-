/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternário;

/**
 *
 * @author salve
 */
public class OperadorTernário {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a1, a2, b;
        a1 = 2; 
        a2 = 10; 
        b = (a1>a2)?0:1;
        System.out.println(b);
        
         int b1, b2, c;
        b1 = 1; 
        b2 = 2; 
        c = (b1>b2)?b1+2:b2+2;
        System.out.println(c);
        
    }
    
}
