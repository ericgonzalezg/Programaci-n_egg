import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digame los bocadillos");
        double BOC = lector.nextDouble();
        System.out.println("Digame las bebidas");
        double BEB = lector.nextDouble();
        System.out.println("Digame el precio de cada bocadillo");
        double PRBOC = lector.nextDouble();
        System.out.println("Digame el precio de cada bebida");
        double PRBEB = lector.nextDouble();
        System.out.println("Digame los alumnos");
        double ALUM = lector.nextDouble();

        double FBOC = BOC * PRBOC;
        double FBEB = BEB * PRBEB;
        double PRALUM = FBOC + FBEB;
        double FIN = PRALUM * ALUM;

        System.out.println("El precio de los bocadillos es de " + FBOC);
        System.out.println("El precio de las bebidas es de " + FBEB);
        System.out.println("El precio de los productos es "+PRALUM);
        System.out.println("El precio final con todos los alumnos es de " + FIN);
    }
}
