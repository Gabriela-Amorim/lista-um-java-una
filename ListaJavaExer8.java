import java.util.Scanner;

public class ListaJavaExer8 {

    public static void main(String[] args) {

        double totalVeiculos, totalRodas, quantidadeCarros, quantidadeMotos;

        Scanner scanner= new Scanner (System.in);

        System.out.println("Informe a quantidade de veículos");
        totalVeiculos= scanner.nextDouble();

        System.out.println("Informe a quantidade de rodas");
        totalRodas= scanner.nextDouble();

        quantidadeMotos = ((4 * totalVeiculos) - totalRodas) / 2;
        quantidadeCarros = (totalVeiculos - quantidadeMotos);

        System.out.println("A quantidade de motos é:" + quantidadeMotos);
        System.out.println("A quantidade de carros é:" + quantidadeCarros);

        scanner.close();        

    }
 }