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
public class Laptop extends Computadora {

    /**
     * Definr métodos de la intefaz iCompu, prender y apagar
     */
    @Override
    public void prender() {
        System.out.print("Laptop encendida");
    }

    @Override
    public void apagar() {
        System.out.print("Laptop apagada");
    }

    @Override
    public void imprimirDatos() {
        System.out.print("La marca de la laptop es: " + marca);
        System.out.println("");
        System.out.print("La capacacidad de la laptop es: " + capacidad);
        System.out.println("");
        System.out.print("El tamaño de la pantalla de la laptop es: " + tamPantalla);
        System.out.println("");
    }
}
