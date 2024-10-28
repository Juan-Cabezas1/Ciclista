/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

/**
 *
 * @author h
 */
import javax.swing.JOptionPane;

public class Escalador extends Ciclista {
    private double aceleracionSubida;
    private double gradoRampa;

    public Escalador(int id, String nombre, double aceleracionSubida, double gradoRampa) {
        super(id, nombre);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }

    public Escalador(int id, String nombre, double tiempoAcumulado, double aceleracionSubida, double gradoRampa) {
        super(id, nombre, tiempoAcumulado);
        this.aceleracionSubida = aceleracionSubida;
        this.gradoRampa = gradoRampa;
    }

   
    public double getAceleracionSubida() { return aceleracionSubida; }
    public void setAceleracionSubida(double aceleracionSubida) { this.aceleracionSubida = aceleracionSubida; }

    public double getGradoRampa() { return gradoRampa; }
    public void setGradoRampa(double gradoRampa) { this.gradoRampa = gradoRampa; }

    
    public void imprimirDatos() {
        super.imprimirDatos(); // Llamada al método de la clase padre
        JOptionPane.showMessageDialog(null,
            "Aceleración en Subida: " + aceleracionSubida + " m/s2\n" +
            "Grado de Rampa: " + gradoRampa + " grados");
    }
}
