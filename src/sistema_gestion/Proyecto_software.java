/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion;

/**
 *
 * @author user
 */
public class Proyecto_software extends Proyecto {

    public Proyecto_software(String nombre) {
        super(nombre);
    }

    public void compilar_proyecto() {
        System.out.println("Compilando proyecto de software: " + nombre);
    }
}
