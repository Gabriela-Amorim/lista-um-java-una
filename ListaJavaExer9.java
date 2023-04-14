import java.util.Scanner;

public class ListaJavaExer9{

    public static void main(String[] args){

        int segundos; 
        Double minutos, horas;

        Scanner scanner= new Scanner (System.in);

        System.out.println("Informe os segundos");
        segundos= scanner.nextInt();

        minutos= (double)segundos/60;
        horas= minutos/60;

        System.out.printf("%d Segundos se equivale a: \n%.1f minutos \n",segundos, minutos);
        System.out.printf("%.1f horas", horas);

        scanner.close();

    }
} 