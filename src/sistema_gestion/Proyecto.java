/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Proyecto {
    protected String nombre;
    protected List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public class Tarea {
        private String descripcion;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public void eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.remove(index);
        }
    }

    public void listarTareas() {
        System.out.println("Tareas del proyecto \"" + nombre + "\":");
        for (Tarea t : tareas) {
            System.out.println("- " + t.getDescripcion());
        }
    }
}
