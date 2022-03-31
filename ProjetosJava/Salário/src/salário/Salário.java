/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salário;
import java.util.Scanner; 

public class Salário {

    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       int num, hora;
       double valorHora;
       
       num = scan.nextInt();
       hora = scan.nextInt(); 
       valorHora = scan.nextDouble();
       
       double salario = hora*valorHora;
       
        System.out.println("NUMBER = " +num);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
       
       
    }
    
}
