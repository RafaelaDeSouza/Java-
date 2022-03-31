/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package omaior;
import static java.lang.Math.abs;
import java.util.Scanner; 

public class OMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       
       int maiorAB = ((a+b)+ abs(a-b))/2;
       int maiorABC = ((maiorAB+c)+ abs(maiorAB-c))/2;
    
        System.out.println(maiorABC+" eh o maior");
       }
       
    }
    

