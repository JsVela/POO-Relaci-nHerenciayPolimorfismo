/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jparga.t03;

import java.util.Scanner;//importación  de la clase scanner del paquete java.util

/**
 *
 * @author JESUS PARGA VELA
 */
public class POOJPargaT03 {

    /**
     * @param c
     */
    public static void capturarDatos(Computadora c) {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclee la marca: ");
        c.marca = s.next();
        System.out.println("");
        System.out.println("Teclee la capacidad: ");
        c.capacidad = s.nextInt();
        System.out.println("");
        System.out.println("Teclee el tamaño de la pantalla: ");
        c.tamPantalla = s.nextDouble();
        System.out.println("");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * instaciar objetos
         */
        Laptop l = new Laptop();
        System.out.println("Datos para la laptop");
        System.out.println("");
        capturarDatos(l);
        l.prender();
        System.out.println("");
        System.out.println("");
        Tablet t = new Tablet();
        System.out.println("");
        System.out.println("Datos para tablet");
        System.out.println("");
        capturarDatos(t);
        t.prender();
        System.out.println("");
        System.out.println("");
        PC p = new PC();
        System.out.println("");
        System.out.println("Datos para pc");
        System.out.println("");
        capturarDatos(p);
        p.prender();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Datos de la laptop");
        l.imprimirDatos();
        l.apagar();
        System.out.println("");
        System.out.println("");
        System.out.println("Datos de la tablet");
        t.imprimirDatos();
         t.apagar();
        System.out.println("");
        System.out.println("");
        System.out.println("Datos de la pc");
        p.imprimirDatos();
        p.apagar();
        System.out.println("");
        System.out.println("");
    }

}
