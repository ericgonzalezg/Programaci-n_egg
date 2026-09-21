import java.sql.SQLOutput;
import java.util.Scanner;

public class Entrada {
   // public static void main(String[] args) {
        /*
        String nombreApp = "Lector Programa";
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor introduce tu nombre");
        String nombre = lector.next();
        System.out.println("Por favor introduce tu 1er apellido");
        String apellido1 = lector.next();
        System.out.println("Por favor introduce tu 2do apellido");
        String apellido2 = lector.next();
        System.out.println("Por favor introduce tu edad");
        int edad = lector.nextInt();
        System.out.println("Por favor introduce tu correo");
        String correo = lector.next();
        System.out.printf("Me llamo %s y mis apellidos son %s %s, tengo %d años y mi correo es %s\n"
                , nombre, apellido1, apellido2, edad, correo);


        //PARA QUE ESTO ESTE MEJOR SE DEBE DE HACER PARA QUE EL USUARIO INTRODUZCA LOS DATOS 1 A 1
    }

         */


                                            //OPERADORES todo

  /*  public static void main(String[] args) {
        /* tipos de operadores
        Aritméticos +,-...
        Asignación =, += , -=
        Comparación mayor menor...
        Logicos and, or

        TIPOS CASTEO, PARSEOS
        Casteo: si de forma natural entra (se pierde info)
        parseo: si de forma natural no entra (forzar el cambio)
         */
    //TODO
        //casting
       /* int altura = (int)12.87; // le estas diciendo que deje por el camino el .87
        double estatura = 12;
        char letra = (char) 70;
        int letraASCII = 'a';
        int operando1 = 5;
        int operando2 = 2;
        System.out.println("Resultado division");
        System.out.println((double)operando1/operando2);
        System.out.println(operando1/operando2);
        System.out.println(altura);
        System.out.println(estatura);
        System.out.println(letra);
        System.out.println(letraASCII);

        //parseo
        String numero = String.valueOf(8)+7;
        int cosa = Integer.parseInt("9");
        System.out.println(numero);
        System.out.println(cosa+7);

        *///}

public static void main(String[] args) {
    System.out.println("Operadores aritmeticos");
    int operador1 = 6;
    operador1++; // operador +1 = 7
    int operador2 = 9;
    operador2--; // operador -1 = 8
    operador2--;
    int suma = operador1+operador2;
    int resta = operador1-operador2;
    int multiplicacion = operador1*operador2;
    int division = operador1/operador2;
    double divisiondecimal = (double)operador2/operador1;
    int modulo = operador1%operador2;
    System.out.println("El resultado de la suma es "+suma);
    System.out.println("El resultado de la resta es "+resta);
    System.out.println("El resultado de la multiplicación es "+multiplicacion);
    System.out.println("El resultado de la división es "+division);
    System.out.println("El resultado de la división con decimal es "+divisiondecimal);
    System.out.println("El resultado del resto de la division es "+modulo);

    //TODO

    System.out.println("Operadores de asignación");
    // = asigna un valor
    operador1 = 10;
    operador2 = 5;
    // +=, -=, *=, /=, %=
    //operador1 = operador1+10; //20
    operador1 +=10; //20
    operador2 -=4; //1
    operador1 *=2; //40
    operador2 /=2; //20
    operador1 %=4; //0 40/4 = 10


    System.out.println("Operadores de comparación");
    operador1 = 7;
    operador2 = 4;
    boolean comparacion = operador1 > operador2;
    System.out.println("La comparación de > es: "+comparacion);
    comparacion = operador2<operador1;
    System.out.println("La comparación de < es: "+comparacion);
    comparacion = operador2 <= operador1;
    System.out.println("La comparación de <= es: "+comparacion);
    comparacion = operador2 == operador1;
    System.out.println("La comparación de == es: "+comparacion);
    comparacion = operador2 != operador1;
    System.out.println("La comparación de != es: "+comparacion);
    comparacion = !comparacion; //cambia el valor comparación
}
}

