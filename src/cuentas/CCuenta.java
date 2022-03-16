/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * paquete al que pertenece la clase CCuenta
 */
package cuentas;

/**
 * Clase CCuenta que posee los metodos para crear una cuenta, getters y setters
 * de sus atributos q ingresar y retirar dinero
 *
 * @author Marcos
 */
public class CCuenta {

    /**
     * Atributos de CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio
     */
    public CCuenta() {
    }

    /**
     * Constructor
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @param nom the nom to set
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     *
     * @return getNombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     *
     * @return getSaldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo para comprobar si se puede ingresar saldo en caso negativo lanza
     * una excepcion
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para comprobar si se puede retirar saldo en caso negativo lanza
     * una excepcion
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return getCuenta
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
