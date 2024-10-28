/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclista;

/**
 *
 * @author h
 */

import javax.swing.JOptionPane;

public class Ciclista {
    private int id;
    private String nombre;
    private double tiempoAcumulado; 

    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    public Ciclista(int id, String nombre, double tiempoAcumulado) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoAcumulado = tiempoAcumulado; 
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getTiempoAcumulado() { return tiempoAcumulado; }
    public void setTiempoAcumulado(double tiempoAcumulado) { this.tiempoAcumulado = tiempoAcumulado; }

   
    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null,
            "ID: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Tiempo Acumulado: " + tiempoAcumulado + " minutos");
    }
}
