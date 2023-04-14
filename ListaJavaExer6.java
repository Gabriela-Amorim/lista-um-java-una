import java.util.Scanner;

public class ListaJavaExer6{

    public static void main (String[] args){

        double logaritimando, base, logaritimo;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Calculo de logaritimo");

        System.out.println("Informe o logaritimando");
        logaritimando= scanner.nextDouble();

        System.out.println("Informe a base");
        base= scanner.nextDouble();

        logaritimo= Math.log(logaritimando) / Math.log(base);

        System.out.println("O logaritimo é:  "+ logaritimo);

        scanner.close();

    }
}