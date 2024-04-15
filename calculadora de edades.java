import java.util.Scanner;

class CalculadoraEdades {
    private int[] edades;

    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }

    public double calcularPromedioMayoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                suma += edad;
                contador++;
            }
        }
        if (contador == 0) {
            return 0; 
        }
        return (double) suma / contador;
    }

    public double calcularPromedioMenoresEdad() {
        int suma = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad < 18) {
                suma += edad;
                contador++;
            }
        }
        if (contador == 0) {
            return 0; 
        }
        return (double) suma / contador;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas en el grupo: ");
        int cantidadPersonas = scanner.nextInt();

        int[] edades = new int[cantidadPersonas];

        
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        CalculadoraEdades calculadora = new CalculadoraEdades(edades);

        double promedioMayores = calculadora.calcularPromedioMayoresEdad();
        System.out.println("El promedio de edades de los mayores de edad es: " + promedioMayores);

        double promedioMenores = calculadora.calcularPromedioMenoresEdad();
        System.out.println("El promedio de edades de los menores de edad es: " + promedioMenores);

        scanner.close();
    }
}
