import java.util.Scanner;

public class ListaJavaExer10{

    public static void main (String[] args) {

        double numeroUm, numeroDois, numeroTres, mediaAritmetica, mediaHarmonica, mediaGeometrica;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Médias aritmética, harmônica e geométrica");

        System.out.println("Informe o primeiro número");
        numeroUm = scanner.nextDouble();

        System.out.println("Informe o segundo número");
        numeroDois = scanner.nextDouble();

        System.out.println("Informe o terceiro número");
        numeroTres = scanner.nextDouble();

        mediaAritmetica= (numeroUm + numeroDois + numeroTres) / 3;
        mediaHarmonica= 3 / (1/numeroUm + 1/numeroDois + 1/numeroTres);
        mediaGeometrica= Math.pow((numeroUm * numeroDois * numeroTres), 1.0/3.0);

        System.out.println("\n  A média aritmetica é:" + mediaAritmetica);
        System.out.println("\n  A média harmônica é:" + mediaHarmonica);
        System.out.println("\n  A média geométrica é:" + mediaGeometrica);

        scanner.close ();

    }

}
