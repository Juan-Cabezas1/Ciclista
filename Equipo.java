/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclista;

/**
 *
 * @author h
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private ArrayList<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    
    public String getNombreEquipo() { return nombreEquipo; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

   
    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    
    public void imprimirDatosEquipo() {
        StringBuilder equipoInfo = new StringBuilder("Equipo: " + nombreEquipo + "\nPaís: " + pais + "\nCiclistas:\n");
        for (Ciclista ciclista : ciclistas) {
            equipoInfo.append(ciclista.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(null, equipoInfo.toString());
    }

    
    public double calcularTiempoTotal() {
        double tiempoTotal = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotal += ciclista.getTiempoAcumulado();
        }
        return tiempoTotal;
    }

    
    public void buscarCiclistaPorId(int id) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getId() == id) {
                ciclista.imprimirDatos();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Ciclista no encontrado.");
    }
}
