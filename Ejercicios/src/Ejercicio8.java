import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        System.out.println("Digame los grados centigrados");
        double CENT1 = lector.nextDouble();
        double KELV1 = CENT1+273.15;
        double FAR1 = ((9*CENT1)/5)+32;
        System.out.println("En farenheits es: "+FAR1);
        System.out.println("En kelvins es: "+KELV1);
        System.out.println(" ");
        System.out.println("Digame los kelvin");
        double KELV2 = lector.nextDouble();
        double CENT2 = KELV2-273.15;
        double FAR2 = ((9*CENT2)/5)+32;
        System.out.println("En centigrados es: "+CENT2);
        System.out.println("En farenheits es: "+FAR2);
        System.out.println(" ");
        System.out.println("Digame los farenheit");
        double FAR3 = lector.nextDouble();
        double CENT3 = (5*(FAR3-32))/9;
        double KELV3 = CENT3+273.15;
        System.out.println("En centigrados es: "+CENT3);
        System.out.println("En kelvins es: "+KELV3);
    }
}
