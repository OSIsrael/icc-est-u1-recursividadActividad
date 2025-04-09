import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean condicion = true;
        Scanner leer = new Scanner(System.in);
        Ejemplo1 ejemplo1 = new Ejemplo1();
        Ejemplo2 ejemplo2 = new Ejemplo2();
        Ejemplo3 ejemplo3= new Ejemplo3();
        Fibinacci fuFibinacci= new Fibinacci();
        while (condicion) {
            System.out.println("**********Ingrese el ejercio que desea:********");
            System.out.println("1. SUMA DE NUMEROS CONSECUTIVOS");
            System.out.println("2. POTENCIA DE UN NUMERO");
            System.out.println("3. SUMA DE DIGITOS DE UN NUMEROS ");
            System.out.println("4. SERIE FIBONACCI");
            System.out.println("5. SALIR");
            int op = leer.nextInt();
//ejemplo1.construirSum(n) + " = " + 
            switch (op) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    int n = leer.nextInt();
                    System.out.println(ejemplo1.sumaRecursiva(n));
                    break;
                case 2:
                    System.out.println("Ingrese la base");
                    int base = leer.nextInt();
                    System.out.println("Ingrese el exponente");
                    int exponente = leer.nextInt();
                    System.out.println(base + " ^ " + exponente + " = " + ejemplo2.potenciaRecursiva(base, exponente));
                    break;
                case 3:
                    System.out.println("Ingrese su numero");
                    int num=leer.nextInt();
                    System.out.println("La suma de los dígitos de " + num + " es: " + ejemplo3.sumaDigitos(num));
                    break;
                case 4:
                    System.out.println("Ingrese un numero n:");
                    int num1= leer.nextInt();
                    System.out.println(fuFibinacci.recurividadFibonacci(num1));
                    break;
                case 5:
                    condicion=false;
                    break;
                default:
                    break;
            }
        }
    }
}
