import java.util.Scanner;

public class ListaJavaExer5{ 

    public static void main (String[] args) {

        double numeroDeHoras, valorPorHoras, valorSalarioFamilia, numeroDeFilhos, 
        salarioBruto;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Salario bruto");

        System.out.println("Informe o número de horas trabalhadas");
        numeroDeHoras= scanner.nextDouble();

        System.out.println("Informe o valor recebido por horas");
        valorPorHoras= scanner.nextDouble();

        System.out.println("informe o valor do salário família");
        valorSalarioFamilia= scanner.nextDouble();

        System.out.println("Informe o número de filhos com menos de 14 anos");
        numeroDeFilhos=scanner.nextDouble();

        salarioBruto = numeroDeHoras*valorPorHoras+valorSalarioFamilia*numeroDeFilhos;

        System.out.println("O sálario bruto a ser recebido é: " + salarioBruto);

        scanner.close();

    }
    
}
