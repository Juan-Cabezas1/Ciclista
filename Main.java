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

public class Main {
    public static void main(String[] args) {
        
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
        String paisEquipo = JOptionPane.showInputDialog("Ingrese el país del equipo:");
        Equipo equipo = new Equipo(nombreEquipo, paisEquipo);

      
        int idContrarrelojista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del contrarrelojista:"));
        String nombreContrarrelojista = JOptionPane.showInputDialog("Ingrese el nombre del contrarrelojista:");
        double tiempoAcumuladoContrarrelojista = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo acumulado en minutos del contrarrelojista:"));
        double velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad máxima del contrarrelojista (Km/h):"));
        Contrarrelojista contrarrelojista = new Contrarrelojista(idContrarrelojista, nombreContrarrelojista, tiempoAcumuladoContrarrelojista, velocidadMaxima);
        equipo.agregarCiclista(contrarrelojista);

        
        int idVelocista = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del velocista:"));
        String nombreVelocista = JOptionPane.showInputDialog("Ingrese el nombre del velocista:");
        double tiempoAcumuladoVelocista = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo acumulado en minutos del velocista:"));
        double potenciaPromedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la potencia promedio del velocista (W):"));
        double velocidadSprint = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad en sprint del velocista (Km/h):"));
        Velocista velocista = new Velocista(idVelocista, nombreVelocista, tiempoAcumuladoVelocista, potenciaPromedio, velocidadSprint);
        equipo.agregarCiclista(velocista);

        
        int idEscalador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del escalador:"));
        String nombreEscalador = JOptionPane.showInputDialog("Ingrese el nombre del escalador:");
        double tiempoAcumuladoEscalador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo acumulado en minutos del escalador:"));
        double aceleracionSubida = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la aceleración en subida del escalador (m/s2):"));
        double gradoRampa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el grado de rampa soportada (grados):"));
        Escalador escalador = new Escalador(idEscalador, nombreEscalador, tiempoAcumuladoEscalador, aceleracionSubida, gradoRampa);
        equipo.agregarCiclista(escalador);

        
        equipo.imprimirDatosEquipo();

        
        int idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del ciclista a buscar:"));
        equipo.buscarCiclistaPorId(idBusqueda);

        
        double tiempoTotal = equipo.calcularTiempoTotal();
        JOptionPane.showMessageDialog(null, "Tiempo total del equipo: " + tiempoTotal + " minutos");
    }
}
