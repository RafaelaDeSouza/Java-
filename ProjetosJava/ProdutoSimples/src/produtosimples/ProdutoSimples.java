
package produtosimples;
import java.util.Scanner; 

public class ProdutoSimples {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int C = scan.nextInt(); 
        int D = scan.nextInt();
          
        int prod = C*D; 
        System.out.println("PROD = " +prod);
    }
    
}
