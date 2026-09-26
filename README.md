# Primer Parcial Práctico – Programación I

## Versión B

**Lenguaje:** Java  
**Modalidad:** Individual  
**Duración total:** 60 minutos  
**Valor:** 100 puntos  
**Temas:** arreglos unidimensionales, arreglos bidimensionales, ciclos, condicionales, contadores y acumuladores.

---

## Indicaciones generales

- Desarrolle los dos ejercicios en Java y desde consola.
- Cada ejercicio debe resolverse en un archivo independiente.
- Toda la solución debe estar dentro del método `main`.
- Puede utilizar `Scanner`, arreglos, matrices, ciclos y condicionales.
- No se permite utilizar `ArrayList`, colecciones, `Stream`, métodos de ordenamiento automático ni métodos creados por el estudiante.
- Los datos deben ser solicitados al usuario; no deben quedar escritos directamente en el código.
- Los resultados deben mostrarse de forma clara e identificable.
- Si se presenta un empate, debe reportarse la primera posición encontrada.

---

# Ejercicio 1 – Paquetes procesados por hora

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Un centro de distribución registró la cantidad de paquetes procesados durante **10 horas consecutivas**. Los valores son enteros y deben almacenarse en un arreglo unidimensional.

Construya un programa que:

1. Cree un arreglo de 10 posiciones.
2. Solicite la cantidad de paquetes procesados en cada hora y valide que no sea negativa. Si el dato es inválido, debe solicitarlo nuevamente.
3. Calcule y muestre:
   - El total de paquetes procesados.
   - El promedio de paquetes por hora.
   - El número de la hora con la menor cantidad procesada.
   - Cuántas horas tuvieron una producción inferior al promedio.
   - La racha más larga de horas consecutivas cuya producción fue inferior al promedio.
4. Muestre el listado final con el número de cada hora y su cantidad registrada.

## Aclaraciones

- Las horas se numeran del 1 al 10, aunque las posiciones del arreglo comiencen en 0.
- Una racha es una secuencia de posiciones consecutivas. Por ejemplo, si las horas 5, 6 y 7 están por debajo del promedio, existe una racha de longitud 3.
- Para determinar cuáles valores están por debajo del promedio será necesario recorrer nuevamente el arreglo después de calcularlo.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de los 10 valores | 10 |
| Cálculo correcto del total y del promedio | 10 |
| Identificación de la hora con menor producción | 10 |
| Conteo de horas por debajo del promedio | 8 |
| Cálculo correcto de la racha más larga | 8 |
| Claridad de la salida y organización del código | 4 |

---

# Ejercicio 2 – Registro de ventas de sucursales

**Tiempo sugerido:** 30 minutos  
**Valor:** 50 puntos

Una empresa tiene **4 sucursales** y desea analizar las unidades vendidas de **5 productos** durante una jornada. La información debe almacenarse en una matriz de 4 filas por 5 columnas:

- Cada fila representa una sucursal.
- Cada columna representa un producto.

Construya un programa que:

1. Cree una matriz de `4 x 5`.
2. Solicite las unidades vendidas de cada producto en cada sucursal y valide que ningún valor sea negativo.
3. Calcule y muestre:
   - El total de unidades vendidas por cada sucursal.
   - El total vendido de cada producto, sumando las cuatro sucursales.
   - La sucursal con la menor cantidad total de ventas.
   - El producto con la mayor cantidad total de unidades vendidas.
   - Cuántos registros de la matriz fueron superiores a 30 unidades.
4. Muestre la matriz completa, organizada por sucursales y productos.

## Aclaraciones

- Las sucursales se numeran del 1 al 4 y los productos del 1 al 5.
- Si dos sucursales tienen el mismo total mínimo, se reporta la primera.
- Si dos productos tienen el mismo total máximo, se reporta el primero.
- No es necesario crear arreglos adicionales para resolver el ejercicio, aunque puede utilizarlos si lo considera conveniente.

## Criterios de evaluación

| Criterio | Puntaje |
|---|---:|
| Lectura, almacenamiento y validación de la matriz | 10 |
| Cálculo del total de cada sucursal | 10 |
| Cálculo del total de cada producto | 10 |
| Identificación de la sucursal menor y el producto mayor | 10 |
| Conteo de registros superiores a 30 | 6 |
| Presentación de la matriz y organización del código | 4 |

---

## Entrega

Entregue los dos archivos `.java`, debidamente nombrados y capaces de compilar y ejecutarse sin errores.

**Analice primero y programe después. Java ejecuta exactamente lo escrito, incluso cuando la idea iba por otro camino.**
EJERCICIO 1
Entradas: 
-10 números enteros positivos o cero que representan los paquetes procesados en cada hora consecutiva
-Arreglo unidimensional / Vector de 10 posiciones

Procesos:
-Validación: Bucle `do-while` para rechazar cantidades negativas.
-Suma TotalAcumulación secuencial de los 10 valores del arreglo.
-Cálculo del Promedio: División flotante `(double) Total / 10`.
-Hora Pico (Máximo): Identificación del mayor valor en el arreglo y la hora en que ocurrió 
-Hora Valle (Mínimo): Identificación del menor valor en el arreglo y la hora en que ocurrió 

Salida:
-Lista detallada del número de paquetes procesados hora por hora (Hora 1 a Hora 10).
-Total acumulado: Suma total de paquetes de toda la jornada.
-Hora Pico: Número de la hora con mayor cantidad procesada y su total.
-Hora Valle: Número de la hora con menor cantidad procesada y su total.




EJERCICIO 2
Entradas:
-20 números enteros positivos o cero que representan las unidades vendidas.
-Matriz bidimensional de (`int[4][5]`).

Proceso:
-Bucle `do-while` para asegurar que ningún valor ingresado sea negativo.
-Acumulación de los elementos de cada fila $i \in [0, 3]$.
-Acumulación de los elementos de cada columna $j \in [0, 4]$.
-Recorrido lineal sobre el total de sucursales usando comparación estricta (`<`).
-Recorrido lineal sobre el total de productos usando comparación estricta (`>`).
-Contador incremental de celdas donde $V_{i,j} > 30$.

Salidas:
-Vista tabular de $4 \times 5$ con totales por fila al margen derecho y totales por columna en el pie.
-Total vendido por cada una de las 4 sucursales y por cada uno de los 5 productos.
-Nombre/Número de la sucursal con menor volumen total y su cantidad.
-Nombre/Número del producto con mayor volumen total y su cantidad.
-Cantidad exacta de celdas de la matriz que superaron las 30 unidades.
