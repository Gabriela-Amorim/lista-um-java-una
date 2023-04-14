import java.util.Scanner;

public class ListaJavaExer4 {

    public static void main (String[] args){
    
    double capitalAplicado, prazoEmMeses, taxaJurosMensal, montanteRecebido;

    Scanner scanner= new Scanner (System.in);

    System.out.println("Juros compostos");

    System.out.println("Informe o valor do capital aplicado");
    capitalAplicado= scanner.nextDouble();

    System.out.println("Informe o prazo de aplicação em meses");
    prazoEmMeses= scanner.nextDouble();

    System.out.println("Informe a taxa de juros mensal");
    taxaJurosMensal= scanner.nextDouble();

    montanteRecebido = capitalAplicado * Math.pow(1 + taxaJurosMensal,prazoEmMeses);

    System.out.println("O montante a ser recebido é" + montanteRecebido);
    
    scanner.close (); 


    }
    
}
