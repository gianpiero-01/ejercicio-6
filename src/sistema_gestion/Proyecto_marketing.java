/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion;

/**
 *
 * @author user
 */
public class Proyecto_marketing extends Proyecto {

    public Proyecto_marketing(String nombre) {
        super(nombre);
    }

    public void lanzar_campaña() {
        System.out.println("Lanzando campania para el proyecto: " + nombre);
    }
}
