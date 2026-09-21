import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
/*Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
a) Suma
b) Resta
c) Multiplicación
d) División entera
e) Resto
f) División real
g) Resto real
(Operaciones)

ENTRADA/SALIDA
ENTERO: 24
ENTERO: 7

 */
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor di un número");
        int numero = lector.nextInt();
        System.out.println("Por favor di otro número");
        int numero2 = lector.nextInt();
        int suma = numero+numero2;
        int resta = numero-numero2;
        int multiplicacion = numero*numero2;
        int division = numero/numero2;
        int resto = numero%numero2;
        double divisionr = (double) numero/numero2;
        double restor = (double) numero/numero2;
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la multiplicación entera es "+multiplicacion);
        System.out.println("El resultado de la division es "+division);
        System.out.println("El resultado del resto es "+resto);
        System.out.println("El resultado de la division real es "+divisionr);
        System.out.println("El resultado del resto real es "+restor);

    }
}
