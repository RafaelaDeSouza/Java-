/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saláriocombônus;
import java.util.Scanner; 



public class SalárioComBônus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
       String nome = scan.nextLine();
       double salarioFixo = scan.nextDouble();
       double numeroVendas = scan.nextDouble();
       double comissao = numeroVendas*0.15;
       double salarioT = salarioFixo + comissao;
       
        System.out.printf("TOTAL = R$ %.2f\n", salarioT);
        
    }
    
}
