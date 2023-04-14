import java.util.Scanner;

public class ListaJavaExer3 {

    public static void main (String[] args) {

        double celsius, fahrenheit;

        Scanner scanner= new Scanner (System.in);

        System.out.println("Converção de graus");

        System.out.println("Informe a temperatura em Fahrenheit: (°F)");
        fahrenheit = scanner.nextDouble();

        celsius = ( fahrenheit -32) / 1.8;

        System.out.println("A temperatura em Celsius é:"+ celsius);

        scanner.close();

    }
}