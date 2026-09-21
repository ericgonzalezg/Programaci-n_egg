import java.util.Scanner;

public class Entrada {

        public static void main(String[] args){
        String nombre = "Eric";
        String apellido1 = "González";
        String apellido2 = "Galán";
        String correo = "eric.gonzalezg@cesjuanpablosegundo.es";
        final String DNI = "123T";
             int edad = -18;
             edad = edad +2;
             double alto = 1.85;
             float altoFloat = 1.85f;
             char letraDni = 'T';
             boolean experiencia = true;
             Object cosa = "Eric";



        System.out.println("Hola me llamo "+nombre+" "+apellido1+" "+apellido2);
        System.out.println("Mi correo es "+correo);
        System.out.printf("Mi nombre es %s y mis apellidos son %s %s y tengo %d años",
                nombre,apellido1,apellido2,18);



        //ESTO NO SE PUEDE COMPLETAR POR LO DE ARRIBA
            Scanner lector = new Scanner (System.in); //Scanner
            System.out.println("Por favor introduce tu nombre");
            String hola = lector.next();
            System.out.println("Me llamo "+hola);
        }




}


                            //APUNTES//
// "Mi nombre es %s y mis apellidos son %s %s y tengo %d años"
    //%s palabra
    //%d nº sin decimal
    //.2f nº con 2 decimales
    // debe de ir con System.out.printf

//String-palabra " "
//char-letra 'a'
//int-numero sin coma     short/byte/long
//double-numero con coma 1,78
//float-numero con coma pero arrastra más numeros 1,78787087f (f final para float
//boolean-true/false
// Cuando la variable se encuentra en mayusculas (String) variable compleja
    // si la variable esta en minusculas (int) es una variable simple
//object se iguala a to_do  pero no se puede hacer tantas cosas como string
// cuando delante del dato pones final se convierte en una cariable final
        // y se pone en mayusculas, son constantes
// poniendo main se saca public static...
//poniendo douf se saca System...
//para darle valor a una variable compleja: Scanner lector = new Scanner ()

//TODO definir variables hacer algun mensaje...




