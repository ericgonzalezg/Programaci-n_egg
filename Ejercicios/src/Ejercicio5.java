import java.util.Scanner;

public class Ejercicio5 {
    /* Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)

*ENTRADA/SALIDA*

Número de segundos: **24973**

Horas: 6

Minutos: 56

Segundos: 13 */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hola buenas me puede indicar el número de segundos");
        int segundostot = lector.nextInt();
        int minutos = segundostot/60;
        int segundos = segundostot%60;
        int horas = minutos/60;
        minutos = minutos %60;
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);

    }
}
