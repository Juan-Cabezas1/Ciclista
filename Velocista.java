/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

import javax.swing.JOptionPane;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprint;

    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    public Velocista(int id, String nombre, double tiempoAcumulado, double potenciaPromedio, double velocidadSprint) {
        super(id, nombre, tiempoAcumulado);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprint = velocidadSprint;
    }

    
    public double getPotenciaPromedio() { return potenciaPromedio; }
    public void setPotenciaPromedio(double potenciaPromedio) { this.potenciaPromedio = potenciaPromedio; }

    public double getVelocidadSprint() { return velocidadSprint; }
    public void setVelocidadSprint(double velocidadSprint) { this.velocidadSprint = velocidadSprint; }

    
    public void imprimirDatos() {
        super.imprimirDatos(); 
        JOptionPane.showMessageDialog(null,
            "Potencia Promedio: " + potenciaPromedio + " W\n" +
            "Velocidad en Sprint: " + velocidadSprint + " km/h");
    }
}
