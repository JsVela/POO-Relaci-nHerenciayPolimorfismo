/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jparga.t03;

/**
 *
 * @author JESUS PARGA VELA
 */
public abstract class Computadora implements iCompu {

    /**
     * Atributos
     */
    protected String marca;
    protected int capacidad;
    protected double tamPantalla;

    /**
     * Constructor
     */
    public Computadora() {

    }

    public Computadora(String marca) {
        this.marca = marca;
    }

    public Computadora(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public Computadora(String marca, int capacidad, double tamPantalla) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.tamPantalla = tamPantalla;
    }

    /**
     * Métodos sobreescritos de la interfaz iCompu
     */
    @Override
    public void prender() {
        System.out.println("Encender equipo");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar equipo");
    }

    @Override
    public void imprimirDatos() {
    }
}
