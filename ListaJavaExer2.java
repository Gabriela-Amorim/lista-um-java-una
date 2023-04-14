import java.util.Scanner;

public class ListaJavaExer2 { 
      
    public static void main(String[] args) {
         
        double produto, porcentagem;

        Scanner scanner= new Scanner (System.in);

        System.out.println("Preço do produto");

        System.out.println("Informe o preço do produto");
        produto=scanner.nextDouble();

        porcentagem=produto * 10 / 100 + produto;
    
        
        System.out.println("O novo preço do produto é:"+ porcentagem);

        scanner.close();

    }
}