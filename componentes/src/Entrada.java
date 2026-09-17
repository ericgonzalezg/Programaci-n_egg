public class Entrada {

        public static void main(String[] args){
        String nombre = "Eric";
        String apellido1 = "González";
        String apellido2 = "Galán";
        String correo = "eric.gonzalezg@cesjuanpablosegundo.es";
        System.out.println("Hola me llamo "+nombre+" "+apellido1+" "+apellido2);
        System.out.println("Mi correo es "+correo);
        System.out.printf("Mi nombre es %s y mis apellidos son %s %s y tengo %d años",
                nombre,apellido1,apellido2,18);
        }
}

// "Mi nombre es %s y mis apellidos son %s %s y tengo %d años"
    //%s palabra
    //%d nº sin decimal
    //.2f nº con 2 decimales
    // debe de ir con System.out.printf
