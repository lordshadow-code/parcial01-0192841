import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HORAS = 10;

        // Crear arreglo de 10 posiciones
        int[] paquetes = new int[HORAS];

        // Solicitar y validar cada valor (no negativo)
        for (int i = 0; i < HORAS; i++) {
            int valor;
            while (true) {
                System.out.print("Ingrese la cantidad de paquetes procesados en la hora " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    valor = sc.nextInt();
                    if (valor >= 0) {
                        break; // dato válido
                    } else {
                        System.out.println("Error: la cantidad no puede ser negativa. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Error: debe ingresar un número entero.");
                    sc.next(); // descartar entrada inválida
                }
            }
            paquetes[i] = valor;
        }

        // Calcular total
        int total = 0;
        for (int i = 0; i < HORAS; i++) {
            total += paquetes[i];
        }

        // Media
        double promedio = (double) total / HORAS;

        // Hora con la menor cantidad procesada
        int menor = paquetes[0];
        int horaMenor = 1;
        for (int i = 1; i < HORAS; i++) {
            if (paquetes[i] < menor) {
                menor = paquetes[i];
                horaMenor = i + 1;
            }
        }

        //  Recorrer de nuevo para saber cuántas horas y qué racha
        int horasBajoPromedio = 0;
        int rachaActual = 0;
        int rachaMaxima = 0;

        for (int i = 0; i < HORAS; i++) {
            if (paquetes[i] < promedio) {
                horasBajoPromedio++;
                rachaActual++;
                if (rachaActual > rachaMaxima) {
                    rachaMaxima = rachaActual;
                }
            } else {
                rachaActual = 0; // se corta la racha
            }
        }

        // Mostrar resultados
        System.out.println("\n RESULTADOS ");
        System.out.printf("Total de paquetes procesados: %d%n", total);
        System.out.printf("Promedio de paquetes por hora: %.2f%n", promedio);
        System.out.println("Hora con la menor cantidad procesada: " + horaMenor + " (con " + menor + " paquetes)");
        System.out.println("Horas con produccion inferior al promedio: " + horasBajoPromedio);
        System.out.println("Racha mas larga de horas consecutivas bajo el promedio: " + rachaMaxima);

        System.out.println("\nLISTADO FINAL");
        for (int i = 0; i < HORAS; i++) {
            System.out.printf("Hora %2d: %d paquetes%n", (i + 1), paquetes[i]);
        }

        sc.close();
    }
}
