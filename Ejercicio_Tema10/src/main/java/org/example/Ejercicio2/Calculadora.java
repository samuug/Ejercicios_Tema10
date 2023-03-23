package org.example.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora{
    public static Scanner sc = new Scanner(System.in);


    public void calculadora() {
        Operacion operacion = new Operacion();
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;
        char opcion = ' ';
        String mensaje = valor1+" "+opcion+" "+valor2+" = "+resultado;
        boolean salir = false;

        do {
            try {
                valor1 = getValor1(valor1);
                opcion = getChar(opcion);
                valor2 = getValor2(valor2);
                resultado = menuOperaciones(mensaje, operacion, valor1, valor2, resultado, salir, opcion);
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es correcto");
                sc.next();
            } catch (DesbordaCapacidadExcepcion e){
                System.out.println("El valor introducido desborda las capacidades de esta calculadora. Inténtelo de nuevo...");
                sc.next();
            }
        } while (!salir);
    }

    public int getValor1(int valor1) throws DesbordaCapacidadExcepcion, InputMismatchException{
        System.out.println("Introduzca el primer valor: ");
        return valor1 = sc.nextInt();
    }

    public int getValor2(int valor2) throws DesbordaCapacidadExcepcion, InputMismatchException{
        System.out.println("Introduzca el segundo valor: ");
        return valor2 = sc.nextInt();
    }

    public char getChar(char opcion) throws InputMismatchException{
        System.out.println("Introduzca la operación que desea realizar: (+ - * / % o s para salir)");
        return opcion = sc.next().charAt(0);
    }
    public int menuOperaciones(String mensaje, Operacion operacion, int valor1, int valor2, int resultado, boolean salir, char opcion) throws DesbordaCapacidadExcepcion, InputMismatchException {
        switch (opcion) {
            case '+':
                resultado = operacion.suma(valor1, valor2);
                mensaje = valor1 + " " + opcion + " " + valor2 + " = " + resultado;
                System.out.println(mensaje);
                break;
            case '-':
                resultado = operacion.resta(valor1, valor2);
                mensaje = valor1 + " " + opcion + " " + valor2 + " = " + resultado;
                System.out.println(mensaje);
                break;
            case '*':
                resultado = operacion.multiplicacion(valor1, valor2);
                mensaje = valor1 + " " + opcion + " " + valor2 + " = " + resultado;
                System.out.println(mensaje);

                break;
            case '/':
                resultado = operacion.division(valor1, valor2);
                mensaje = valor1 + " " + opcion + " " + valor2 + " = " + resultado;
                System.out.println(mensaje);
                break;
            case 's':
                salir = true;
                break;
            default:
                System.out.println("Opción incorrecta. Inténtelo de nuevo...");
                break;
        }
        return resultado;
    }

}
