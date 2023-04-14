import java.util.Scanner;

public class ListaJavaExer7{

    public static void main(String[] args){

        double salarioFixo, valorTotalDasVendas, percentual, salarioTotal;

        Scanner scanner= new Scanner (System.in);

        System.out.println("Salário total");

        System.out.println("Informe o salário fixo");
        salarioFixo= scanner.nextDouble();

        System.out.println("Informe o valor total das vendas");
        valorTotalDasVendas= scanner.nextDouble();

        System.out.println("Informe o percentual");
        percentual= scanner.nextDouble();

        salarioTotal= salarioFixo + (valorTotalDasVendas*percentual/100);

        System.out.println("O salário total é:" + salarioTotal);

        scanner.close();
    }

}


