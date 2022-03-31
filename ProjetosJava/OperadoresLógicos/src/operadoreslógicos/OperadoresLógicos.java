/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslógicos;

/**
 *
 * @author salve
 */
public class OperadoresLógicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        a = 4;
        b = 7;
        c = 12; 
        
        boolean r;
        r = (a<b && b<c)?true:false;
        System.out.println(r);
    }
    
}
