import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        int numdeLados;
        double longitudLado, altura, areaLateral, areaTotal, volumen;
        double perimetroBase, areaBase, apotema;
        System.out.println("Cantidad de lados: ");
        numdeLados = scanner.nextInt();
        System.out.println("Altura: ");
        altura = scanner.nextDouble();
        System.out.println("longitud: ");
        longitudLado = scanner.nextDouble();

        perimetroBase = numdeLados * longitudLado;
        areaLateral = perimetroBase * altura;
        double alfaGrados = (Math.PI/180) * (360/numdeLados);
        apotema = longitudLado * (2 * Math.tan(alfaGrados/2));

        System.out.println("Area lateral: " + " unidades cuadradas");
        System.out.println("Apotema: " + " unidades cuadradas");
        System.out.println("Area lateral: " + " unidades cuadradas");
        scanner.close();
    }
}
