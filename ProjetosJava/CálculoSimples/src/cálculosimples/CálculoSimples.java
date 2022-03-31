/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cálculosimples;
import java.util.Scanner; 

public class CálculoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int cod = s.nextInt();
        int quant = s.nextInt();
        double valor = s.nextDouble();
        
        int cod1 = s.nextInt();
        int quant1 = s.nextInt();
        double valor1 = s.nextDouble();
        
        double res = quant*valor;
        double res1 = quant1*valor1;
        
        double total = res + res1;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
    
}
