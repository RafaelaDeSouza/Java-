/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresmatematicos;

/**
 *
 * @author salve
 */
public class OperadoresMatematicos {

   
    public static void main(String[] args) {
       //Soma 
        int n1 = 3; 
        int n2 = 5;
        float media = (n1+n2)/2;
        System.out.println("A media é: " +media);
        
        //Incremento 
        int n3 = 5;
        n3++; 
        System.out.println("O valor é: " +n3);
        
        int n4 = 5; 
        int valor1 = 5 + n4++;
        System.out.println("O valor do incremento é: " +n4);
        System.out.println("O valor é: " +valor1);
        
        int n5 = 5; 
        int valor2 = 5 + ++n5;
        System.out.println("O valor do incremento é: " +n5);
        System.out.println("O valor é: " +valor2);
        
        //Atribuição com Incremento 
        int x = 6;
        x += 2;  // x = x + 2;
        System.out.println("Valor de x é: " +x);
        
        //Classe Math Arredondar valores
        float y = 5.6f;
        int y1 = (int) Math.floor(y); 
        System.out.println("O valor é: " +y1);
        
        float z = 5.6f;
        int z1 = (int) Math.ceil(z);
        System.out.println("O valor é: " +z1);
        
        float a = 5.6f;
        int a1 = (int) Math.round(a);
        System.out.println("O valor é: " +a1);
        
        //Gerador de Números aleatórios Random
        double b = Math.random();
        System.out.println("b é igual: " +b);
        
        double c = Math.random();
        int c1 = (int) (10 + c * (20-10));
        System.out.println("c é igual: " +c1);
        
        
        
    }
    
}
