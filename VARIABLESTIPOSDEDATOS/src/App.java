import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Variables");
        /* nombres de variables
         * deben ser con miniscula: edad
         * no pueden ser en mayuscula: Edad //esto es para clases
         * nombres complejos: edadEstudiante
         * nombres con guion:  _edadEstudiante
         * no pueden iniciar con numeros
         * no pueden iniciar con caracteres
         * no pueden tener espacios
         * 
         */
        Scanner scanner = new Scanner(System.in);
        float altura, anchura, largo;
        System.out.println("Altura: ");
        altura = scanner.nextFloat();
        System.out.println("Anchura: ");
        anchura = scanner.nextFloat();
        System.out.println("Largo: ");
        largo = scanner.nextFloat();

        float volumen = altura * anchura * largo;
        
        System.out.println("Su volumen es: " + volumen + " metros cubicos");
        scanner.close();
    }
}
