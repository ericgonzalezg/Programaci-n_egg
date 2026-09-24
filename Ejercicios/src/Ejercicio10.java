import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce decenas de mil");
        int DECM = lector.nextInt();
        System.out.println("Introduce unidades de mil");
        int UNIDM = lector.nextInt();
        System.out.println("Introduce centenas");
        int CEN = lector.nextInt();
        System.out.println("Introduce decenas");
        int DEC = lector.nextInt();
        System.out.println("Introduce unidades");
        int UNID = lector.nextInt();

        System.out.println("Número introducido " +DECM+UNIDM+CEN+DEC+UNID);

        /* numero/10000
            (numero%10000)/1000
            (numero%10000)%1000/100
            ...
         */
    }
}