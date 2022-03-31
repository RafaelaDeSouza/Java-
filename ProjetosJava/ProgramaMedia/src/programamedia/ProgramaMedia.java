/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;
import java.util.Scanner; 

public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        float n1 = scan.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 =  scan.nextFloat();
        
        float m = (n1 + n2)/2;
        System.out.println("A Media é igual à: " +m);
        
        if (m>9){
            
            System.out.println("Parabéns pequeno gafanhoto");
        }
    }
    
}
