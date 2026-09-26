import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 4;    // 4 Sucursales
        int columnas = 5; // 5 Productos

        int[][] ventas = new int[filas][columnas];
        int[] totalPorSucursal = new int[filas];
        int[] totalPorProducto = new int[columnas];
        int registrosMayores30 = 0;

        //Lectura de datos con validación
        System.out.println("=== REGISTRO DE VENTAS POR SUCURSAL Y PRODUCTO ===");
        for (int i = 0; i < filas; i++) {
            System.out.println("\nSucursal " + (i + 1) + ":");
            for (int j = 0; j < columnas; j++) {
                int unidades;
                do {
                    System.out.print("  Ingrese unidades vendidas del Producto " + (j + 1) + ": ");
                    unidades = scanner.nextInt();
                    if (unidades < 0) {
                        System.out.println("    [Error] El número de unidades no puede ser negativo. Intente de nuevo.");
                    }
                } while (unidades < 0);

                ventas[i][j] = unidades;
            }
        }

        //Procesamiento de los datos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = ventas[i][j];

                // Acumulados por sucursal y por producto
                totalPorSucursal[i] += valor;
                totalPorProducto[j] += valor;

                // Conteo de registros mayores a 30
                if (valor > 30) {
                    registrosMayores30++;
                }
            }
        }

        //Determinar sucursal con menor total de ventas (primera en caso de empate)

        int minVentas = totalPorSucursal[0];
        int sucursalMenor = 1;
        for (int i = 1; i < filas; i++) {
            if (totalPorSucursal[i] < minVentas) {
                minVentas = totalPorSucursal[i];
                sucursalMenor = i + 1;
            }
        }

        //Determinar producto con mayor total de ventas (primero en caso de empate)

        int maxVentas = totalPorProducto[0];
        int productoMayor = 1;
        for (int j = 1; j < columnas; j++) {
            if (totalPorProducto[j] > maxVentas) {
                maxVentas = totalPorProducto[j];
                productoMayor = j + 1;
            }
        }


        //Mostrar Resultados Finales

        System.out.println("=== REPORTES Y ESTADÍSTICAS ===");
        
        System.out.println("\n1. Total de unidades vendidas por sucursal:");
        for (int i = 0; i < filas; i++) {
            System.out.println("   - Sucursal " + (i + 1) + ": " + totalPorSucursal[i] + " unidades");
        }

        System.out.println("\n2. Total vendido por cada producto:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("   - Producto " + (j + 1) + ": " + totalPorProducto[j] + " unidades");
        }

        System.out.println("\n3. Sucursal con la menor cantidad total de ventas:");
        System.out.println("   - Sucursal " + sucursalMenor + " (Total: " + minVentas + " unidades)");

        System.out.println("\n4. Producto con la mayor cantidad total de unidades vendidas:");
        System.out.println("   - Producto " + productoMayor + " (Total: " + maxVentas + " unidades)");

        System.out.println("\n5. Cantidad de registros mayores a 30 unidades:");
        System.out.println("   - Total de registros: " + registrosMayores30);

        scanner.close();
    }
}