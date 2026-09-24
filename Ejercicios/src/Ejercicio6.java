import java.util.Scanner;

public class Ejercicio6 {
    /*
    Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

    *ENTRADA/SALIDA*

    Valor de la compra (entre 0.00 y 500.00):**298,45**

    IVA (entre 0 y 25%):**12**

    Compra: 266.47

    IVA: 31.98

    ======

    298.45
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Hola buenas me puede indicar el precio exacto del producto?(entre 0.00 y 500.00)");
        double precio = lector.nextDouble();
        System.out.println("Hola buenas me puede indicar el porcentaje del IVA?(entre 0 y 25%)");
        double iva = lector.nextDouble();
        double ivatot = precio * iva;
        ivatot = ivatot / 100;
        double preciot = precio - ivatot;


        System.out.printf("El iva es: %.2f\n " ,ivatot);
        System.out.printf("El precio de la compra sin iva es de %.2f " ,preciot);


    }
}
//OTRA MANERA DE HACERLO ES COMPRASINIVA = COMPRATOTAL * (1 - ((DOUBLE)IVA/100)