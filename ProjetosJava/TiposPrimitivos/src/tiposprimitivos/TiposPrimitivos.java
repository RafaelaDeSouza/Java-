/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;
import java.util.Scanner;
/**
 *
 * @author Rafaela
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
            String nome = scan.nextLine(); 
                System.out.println("Digite sua nota: ");
                    float nota = scan.nextFloat();
                        System.out.println("A nota de Rafaela é: "+nota);
                            System.out.printf("A nota de %s é: %.2f \n" ,nome, nota);
                                System.out.printf("A nota de %s é: %.3f \n", nome, nota);
                                    System.out.format("A nota de %s é: %.4f \n", nome, nota);
    }
    
}
