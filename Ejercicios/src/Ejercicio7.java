import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {


    /*Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100. Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI

*ENTRADA/SALIDA*

Escribe un radio entero: **15**

Longitud de la circunferencia: 94.24777960769379

Area de circulo: 706.8583470577034
     */
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el radio de una circunferencia entre 0 y 100");
        int radio = lector.nextInt();
        double longitud = 2*Math.PI*radio;
        double radio2 = radio*radio;
        double area = Math.PI*radio2;
        System.out.println("La longitud de la circunferencia es: "+longitud);
        System.out.println("El area del circulo es: "+area);

    }
}
