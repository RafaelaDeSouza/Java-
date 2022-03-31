/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;
import java.util.Scanner; 

public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = scan.nextInt();
        String tipo;
        System.out.println("Isso é um(a)");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
                
            case 2:
                tipo = "bípede";
                break;
            
            case 3: 
                tipo = "Trípede";
                break; 
            
            case 4: 
                tipo = "Quadrupede";
                break;
            
            case 6: 
                tipo = "Aranha";
                break; 
                
            default:
                tipo = "ET";
                break;
        
        
        }
        
        System.out.println(tipo);
        
       
       
    }
    
}
