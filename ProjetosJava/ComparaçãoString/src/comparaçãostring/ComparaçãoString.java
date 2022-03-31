/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author salve
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Para comparar objetos se utiliza o equals
        String nome1 = "Rafaela";
        String nome2 = "Rafaela"; 
        String nome3 = new String("Rafaela");
        String res, res2, res3, res4, res5; 
        
        res = (nome1 == nome2)?"Igual":"Diferente";
        System.out.println(res);
        
        res2 = (nome1 == nome3)?"Igual":"Diferente"; 
        System.out.println(res2);
        
        res3 = (nome2 == nome3)?"Igual":"Diferente";
        System.out.println(res3);
        
        res4 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res4);
        
        res5 = (nome2.equals(nome3))?"Igual":"Diferente";
        System.out.println(res5);
        
        
        
        
    }
    
}
