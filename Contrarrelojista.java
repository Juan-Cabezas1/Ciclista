/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

import javax.swing.JOptionPane;


public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public Contrarrelojista(int id, String nombre, double tiempoAcumulado, double velocidadMaxima) {
        super(id, nombre, tiempoAcumulado);
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    
    public void imprimirDatos() {
        super.imprimirDatos(); // Llamada al método de la clase padre
        JOptionPane.showMessageDialog(null,
            "Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
