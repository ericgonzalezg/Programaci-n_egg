import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)

                ENTRADA/SALIDA
        Número de bebidas: 3
        Número de bocadillos: 5
        Coste de las bebidas: 3.75
        Coste de los bocadillos: 10.25
        Coste consumición: 14.0
         */
        Scanner lector = new Scanner(System.in);
        System.out.println("Hola buenas ¿Qué desean?, El precio de las bebidas es de 1,25 y de los bocadillos de 2,05");
        System.out.println("¿Cuantas bebidas quieren?");
        double bebidas = lector.nextInt();
        System.out.println("¿Cuantos bocadillos quieren?");
        double bocadillos = lector.nextInt();
        double preciobe = bebidas*1.25;
        double preciobo = bocadillos*2.05;
        double preciotot = preciobe+preciobo;
        System.out.println("El coste de las bebidas es "+preciobe);
        System.out.println("El coste de los bocadillos es "+preciobo);
        System.out.println("El precio total es de "+preciotot);

    }
}
