import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número entero entre 0 y 100");
        int num = lector.nextInt();
        boolean condicionmay = num>50;
        boolean condicionpar = num%2 == 0;
        System.out.println("El numero es par? "+condicionmay);
        System.out.println("El numero es mayor que 50? "+condicionpar);
        System.out.println("Las dos condiciones cumplen? "+(condicionmay && condicionpar));
    }
}
