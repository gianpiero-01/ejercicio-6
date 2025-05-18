/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import sistema_gestion.*;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Proyecto p1 = new Proyecto_software("Sistema de Ventas");
        Proyecto p2 = new Proyecto_marketing("Campania Primavera");

        p1.agregarTarea("Diseniar interfaz. ");
        p1.agregarTarea("Codificar modulo de login. ");

        p2.agregarTarea("Definir audiencia objetivo. ");
        p2.agregarTarea("Diseniar afiches publicitarios. ");

        p1.listarTareas();
        p2.listarTareas();

        if (p1 instanceof Proyecto_software) {
            ((Proyecto_software) p1).compilar_proyecto();
        }

        if (p2 instanceof Proyecto_marketing) {
            ((Proyecto_marketing) p2).lanzar_campaña();
        }
    }
}
/*
 _________________________________________________
|       DIAGRAMA DE MEMORIA – STACK               |
|-------------------------------------------------|
| p1 → #PS (Proyecto_software)                     |
| p2 → #PM (Proyecto_marketing)                    |
|_________________________________________________|

 _________________________________________________
|       DIAGRAMA DE MEMORIA – HEAP                |
|-------------------------------------------------|
| #PS → Proyecto_software                          |
|       nombre = "Sistema de Ventas"              |
|       tareas = [ #T1, #T2 ]                     |
|                                                 |
| #PM → Proyecto_marketing                         |
|       nombre = "Campaña Primavera"              |
|       tareas = [ #T3, #T4 ]                     |
|                                                 |
| #T1 → Proyecto.Tarea                            |
|       descripcion = "Diseñar interfaz"          |
|                                                 |
| #T2 → Proyecto.Tarea                            |
|       descripcion = "Codificar módulo de login" |
|                                                 |
| #T3 → Proyecto.Tarea                            |
|       descripcion = "Definir audiencia"         |
|                                                 |
| #T4 → Proyecto.Tarea                            |
|       descripcion = "Diseñar afiches"           |
|_________________________________________________|
*/
