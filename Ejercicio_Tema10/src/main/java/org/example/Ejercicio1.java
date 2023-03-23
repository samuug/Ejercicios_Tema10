package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Sea la función raizCuadrada() que calcula la raíz cuadrada del número que se pasa como argumento. Esta función lanza una excepción si su argumento es negativo. No se le pide que escriba esta función, se asume que ya existe.

Escribir un algoritmo que calcule la raíz cuadrada de un número introducido por el usuario.

Visualización y entrada (ejecución normal):

Introducir un valor: 25

√25 = 5



Visualización y entrada (ejecución no normal):

Introducir un valor: -3

La raíz cuadrada no está definida para un número negativo.
     */
    public static Scanner scanner = new Scanner(System.in);
    public static void raizCuadrada(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("La raíz cuadrada no está definida para un número negativo.");
        }
        System.out.println("√" + numero + " = " + Math.sqrt(numero));
    }

    public static void main(String[] args) {
        try {
            System.out.println("Introducir un valor: ");
            int numero = scanner.nextInt();
            raizCuadrada(numero);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
