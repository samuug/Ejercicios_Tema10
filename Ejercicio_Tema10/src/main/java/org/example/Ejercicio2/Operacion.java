package org.example.Ejercicio2;

public class Operacion {

    public int suma(int valor1, int valor2) throws DesbordaCapacidadExcepcion{
        long resultado = (long) valor1+valor2;
        if (resultado>Integer.MAX_VALUE || resultado<Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public int resta(int valor1, int valor2) throws DesbordaCapacidadExcepcion{
        long resultado = (long) valor1-valor2;
        if (resultado>Integer.MAX_VALUE || resultado<Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public int multiplicacion(int valor1, int valor2) throws DesbordaCapacidadExcepcion{
        long resultado= (long) valor1*valor2;
        if (resultado>Integer.MAX_VALUE || resultado<Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public int division(int valor1, int valor2) throws ArithmeticException{
        if (valor2 == 0){
            throw new ArithmeticException("La división por 0 no está definida");
        }
        return valor1/valor2;
    }
}
