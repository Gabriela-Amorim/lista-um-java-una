import java.util.Scanner;

public class ListaJavaExer1{ 

    public static void main (String[] args) {

        double numeroUm, numeroDois, mediaAritimetica;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Algoritimo Calculo Media Aritmetica");

        System.out.println("Informe um número positivo:");
        numeroUm= scanner. nextDouble();

        System.out.println("Informe o segundo número positivo");
        numeroDois= scanner. nextDouble();

        mediaAritimetica= (numeroUm+numeroDois) /2;

        System.out.println("A média aritimética é:"+ mediaAritimetica);
        
        scanner.close();
    
    }

}