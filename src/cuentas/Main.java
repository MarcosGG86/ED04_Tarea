/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Paquete al que pertenece la clase main
 */
package cuentas;

/**
 * Clase que contiene el metodo main y realiza operaciones con el objeto cuenta1
 *
 * @author Marcos
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativa_cuenta(2500);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        /**
         * Comprobacion mediante Excepciones de si se puede retirar o ingresar
         * el saldo
         */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * Metodo para asignar por parametro una cantidad al objeto cuenta1
     *
     * @param cantidad
     * @return cuenta1
     */
    public static CCuenta operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        return cuenta1;
    }
}
